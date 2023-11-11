package com.aliberkaygedikoglu.hesapmakinesiodev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.aliberkaygedikoglu.hesapmakinesiodev.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }



}