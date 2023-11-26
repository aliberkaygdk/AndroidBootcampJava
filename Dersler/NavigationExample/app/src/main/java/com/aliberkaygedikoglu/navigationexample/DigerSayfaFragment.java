package com.aliberkaygedikoglu.navigationexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DigerSayfaFragment extends Fragment {



    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_diger_sayfa, container, false);
        textView=view.findViewById(R.id.textViewDetaySayfa);
        DigerSayfaFragmentArgs bundle = DigerSayfaFragmentArgs.fromBundle(getArguments());
        String gelenVeri = bundle.getVeri();
        textView.setText(gelenVeri);

        return view;
    }
}