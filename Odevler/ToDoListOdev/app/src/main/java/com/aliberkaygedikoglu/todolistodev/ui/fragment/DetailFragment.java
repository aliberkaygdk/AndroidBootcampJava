package com.aliberkaygedikoglu.todolistodev.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.todolistodev.data.entity.ToDo;
import com.aliberkaygedikoglu.todolistodev.databinding.FragmentDetailBinding;
import com.aliberkaygedikoglu.todolistodev.ui.viewmodel.DetailViewModel;


public class DetailFragment extends Fragment {

    private FragmentDetailBinding binding;
    private DetailViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater, container, false);


        DetailFragmentArgs bundle = DetailFragmentArgs.fromBundle(getArguments());
        ToDo toDo = bundle.getTodo();

        binding.editTextName.setText(toDo.getName());


        binding.buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.editTextName.getText().toString();

                viewModel.update(toDo.getId(),name);
            }
        });





        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(DetailViewModel.class);
    }
}