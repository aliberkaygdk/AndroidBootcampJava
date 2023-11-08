package com.aliberkaygedikoglu.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.navigationcomponentkullanimi.databinding.FragmentBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    private FragmentBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentBottomSheetBinding.inflate(inflater, container, false);

        binding.imageViewPaylas.setOnClickListener(v -> {
            Snackbar.make(v,"Paylaşıldı",Snackbar.LENGTH_SHORT).show();
        });

        binding.imageViewKopyala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Kopyalandı",Snackbar.LENGTH_SHORT).show();
            }
        });

        return binding.getRoot();
    }
}