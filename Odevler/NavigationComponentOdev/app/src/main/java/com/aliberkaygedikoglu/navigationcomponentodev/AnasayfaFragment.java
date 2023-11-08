package com.aliberkaygedikoglu.navigationcomponentodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.navigationcomponentodev.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);


        binding.buttonMainToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Navigation.findNavController(v).navigate(R.id.gecisMainToA);
            }
        });
        binding.buttonMainToX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.gecisMainToX);
            }
        });

        return binding.getRoot();
    }
}