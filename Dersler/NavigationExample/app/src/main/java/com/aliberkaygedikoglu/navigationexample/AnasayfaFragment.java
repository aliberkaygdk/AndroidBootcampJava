package com.aliberkaygedikoglu.navigationexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AnasayfaFragment extends Fragment {


    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_anasayfa, container, false);
        button = view.findViewById(R.id.buttonGec);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AnasayfaFragmentDirections.Gecis gecis=AnasayfaFragmentDirections.gecis();
                gecis.setVeri("Geçiş Yapıldı");
                Navigation.findNavController(view).navigate(gecis);
            }
        });

        return view;
    }
}