package com.aliberkaygedikoglu.hesapmakinesiodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.hesapmakinesiodev.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);


        // AnasayfaFragmentArgs bundle = AnasayfaFragmentArgs.fromBundle(getArguments());
        //  System.out.println(bundle.getSonuc());

        binding.textView.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.bottomSheetGecis);

        });


        return binding.getRoot();
    }


}