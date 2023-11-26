package com.aliberkaygedikoglu.hiltkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aliberkaygedikoglu.hiltkullanimi.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

 ActivityMainBinding binding;
 @Inject
 Kargo kargo;
 @Inject
 Internet internet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        kargo.gonder();


        internet.basvuruYap();
    }
}