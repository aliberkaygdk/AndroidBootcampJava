package com.aliberkaygedikoglu.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aliberkaygedikoglu.calismayapisi.databinding.ActivityDetayBinding;

public class DetayActivity extends AppCompatActivity {

    private ActivityDetayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String gelenAd = getIntent().getStringExtra("ad");
        int gelenYas = getIntent().getIntExtra("yas", 0);
        double gelenBoy = getIntent().getDoubleExtra("boy", 0);
        boolean gelenBekar = getIntent().getBooleanExtra("bekar", false);


        binding.textViewDetay.setText(gelenAd+" - "+gelenYas+" - "+gelenBoy+" - "+gelenBekar);

    }
}