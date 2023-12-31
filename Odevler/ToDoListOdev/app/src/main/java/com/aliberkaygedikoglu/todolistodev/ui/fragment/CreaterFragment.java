package com.aliberkaygedikoglu.todolistodev.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.todolistodev.databinding.FragmentCreaterBinding;
import com.aliberkaygedikoglu.todolistodev.ui.viewmodel.CreaterViewModel;


public class CreaterFragment extends Fragment {

   private FragmentCreaterBinding binding;
   private CreaterViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCreaterBinding.inflate(inflater, container, false);

        binding.buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.editTextCreate.getText().toString();

                viewModel.create(name);
            }
        });



        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(CreaterViewModel.class);
    }
}