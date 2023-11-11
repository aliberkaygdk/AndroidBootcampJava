package com.aliberkaygedikoglu.hesapmakinesiodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.hesapmakinesiodev.databinding.FragmentTusBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class TusFragment extends BottomSheetDialogFragment {


    private FragmentTusBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTusBinding.inflate(inflater, container, false);


        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("1");

            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("2");
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("3");
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("4");
            }
        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("5");
            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("6");
            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("7");
            }
        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("8");
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("9");
            }
        });
        binding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("0");
            }
        });
        binding.buttonArti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.append("+");
            }
        });
        binding.buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String islem = binding.textViewIslem.getText().toString();

                String[] parcalar = islem.split("\\+");

                int toplam = 0;
                for (String a : parcalar) {
                    toplam = toplam + Integer.parseInt(a);

                }
                binding.textViewIslem.setText(String.valueOf(toplam));


                String sonuc;
                TusFragmentDirections.AnasayfayaGit toAnasayfa = TusFragmentDirections.anasayfayaGit();
                sonuc = String.valueOf(toplam);
                toAnasayfa.setSonuc(sonuc);


               // Navigation.findNavController(v).navigate(R.id.anasayfayaGit);


            }


        });
        binding.buttonSifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewIslem.setText("");
            }
        });

        return binding.getRoot();

    }
}