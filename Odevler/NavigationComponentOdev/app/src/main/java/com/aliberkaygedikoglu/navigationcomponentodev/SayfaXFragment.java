package com.aliberkaygedikoglu.navigationcomponentodev;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.navigationcomponentodev.databinding.FragmentSayfaXBinding;


public class SayfaXFragment extends Fragment {

    private FragmentSayfaXBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false);

        binding.buttonXToY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.gecisXToY);
            }
        });
        OnBackPressedCallback geri = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {

            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),geri);

        return binding.getRoot();
    }
}