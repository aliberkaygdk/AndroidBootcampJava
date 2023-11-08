package com.aliberkaygedikoglu.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.navigationcomponentkullanimi.databinding.FragmentAyarlarBinding;


public class AyarlarFragment extends Fragment {

    private FragmentAyarlarBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding=FragmentAyarlarBinding.inflate(inflater, container, false);

        binding.buttonBottomSheet.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.bottomSheetGecis);
        });

        return binding.getRoot();
    }
}