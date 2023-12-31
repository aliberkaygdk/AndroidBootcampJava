package com.aliberkaygedikoglu.calismayapisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.aliberkaygedikoglu.calismayapisi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonDetay.setOnClickListener(v -> {
            //binding.textViewAnasayfa.setText("Merhaba");
            Intent intent = new Intent(this,DetayActivity.class);
            intent.putExtra("ad","Ahmet");
            intent.putExtra("yas",23);
            intent.putExtra("boy",1.78);
            intent.putExtra("bekar",true);
            startActivity(intent);

        });
    }
}