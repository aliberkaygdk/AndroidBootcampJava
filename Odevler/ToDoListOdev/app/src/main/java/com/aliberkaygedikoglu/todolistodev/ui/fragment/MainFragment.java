package com.aliberkaygedikoglu.todolistodev.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.aliberkaygedikoglu.todolistodev.R;
import com.aliberkaygedikoglu.todolistodev.databinding.FragmentMainBinding;
import com.aliberkaygedikoglu.todolistodev.ui.adapter.ToDoAdapter;
import com.aliberkaygedikoglu.todolistodev.ui.viewmodel.MainViewModel;


public class MainFragment extends Fragment {

   private FragmentMainBinding binding;
   private MainViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);

        binding.recylerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        viewModel.toDoList.observe(getViewLifecycleOwner(),toDos -> {
            ToDoAdapter adapter = new ToDoAdapter(toDos,requireContext(),viewModel);
            binding.recylerView.setAdapter(adapter);
        });

        binding.addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.goToCreate);
            }
        });

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                viewModel.search(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                viewModel.search(newText);
                return true;
            }
        });


        return binding.getRoot();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.toDoLoad();
    }
}