package com.aliberkaygedikoglu.filmlerapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.filmlerapp.R;
import com.aliberkaygedikoglu.filmlerapp.data.entity.Filmler;
import com.aliberkaygedikoglu.filmlerapp.databinding.FragmentAnasayfaBinding;
import com.aliberkaygedikoglu.filmlerapp.ui.adapter.FilmlerAdapter;

import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {


    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.filmlerRv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        ArrayList<Filmler> filmlerListesi = new ArrayList<>();
        Filmler f1 = new Filmler(1,"Django","django",24);
        Filmler f2 = new Filmler(2,"Interstellar","interstellar",32);
        Filmler f3 = new Filmler(3,"Inception","inception",16);
        Filmler f4 = new Filmler(4,"The Hateful Eight","thehatefuleight",28);
        Filmler f5 = new Filmler(5,"The Pianist","thepianist",18);
        Filmler f6 = new Filmler(6,"Anadoluda","anadoluda",10);
        filmlerListesi.add(f1);
        filmlerListesi.add(f2);
        filmlerListesi.add(f3);
        filmlerListesi.add(f4);
        filmlerListesi.add(f5);
        filmlerListesi.add(f6);

        //FilmlerAdapter filmlerAdapter = new FilmlerAdapter(filmlerListesi,requireContext());
        //binding.filmlerRv.setAdapter(filmlerAdapter);
        binding.filmlerRv.setAdapter(new FilmlerAdapter(filmlerListesi,requireContext()));





        return binding.getRoot();


    }
}