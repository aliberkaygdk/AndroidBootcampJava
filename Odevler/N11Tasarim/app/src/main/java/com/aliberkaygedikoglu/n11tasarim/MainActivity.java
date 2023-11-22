package com.aliberkaygedikoglu.n11tasarim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aliberkaygedikoglu.n11tasarim.data.entity.Cardview;
import com.aliberkaygedikoglu.n11tasarim.data.entity.ImageRes1;
import com.aliberkaygedikoglu.n11tasarim.databinding.ActivityMainBinding;
import com.aliberkaygedikoglu.n11tasarim.ui.adapter.RecyclerAdapter;
import com.aliberkaygedikoglu.n11tasarim.ui.adapter.RecyclerAdapter2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Integer> res1 = new ArrayList<>();
        res1.add(R.drawable.genisresim1);
        res1.add(R.drawable.genisresim2);
        res1.add(R.drawable.genisresim3);

        RecyclerAdapter adapter = new RecyclerAdapter(this,res1);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.recylerView1.setLayoutManager(linearLayoutManager);
        binding.recylerView1.setAdapter(adapter);

        Cardview cardview1 = new Cardview("499 ₺","Mobile Özel Fırsat",R.drawable.firsatlar1,"Premium Baggy Fit Salopet Kot Tulum Koyu Mavi");
        Cardview cardview2 = new Cardview("6175 ₺","Günün Süper Fırsatı",R.drawable.firsatlar2,"Sunny SN32DAL13-TNR 32 HD Android Smart LED TV");
        Cardview cardview3 = new Cardview("130 ₺","Süper Fırsat",R.drawable.firsatlar3,"Keramika Mat Siyah Delta Makarna Tabağı 26 Cm");

        ArrayList<Cardview> res2 = new ArrayList<>();
        res2.add(cardview1);
        res2.add(cardview2);
        res2.add(cardview3);



        RecyclerAdapter2 adapter2 = new RecyclerAdapter2(this,res2);
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.recylerView2.setLayoutManager(linearLayoutManager2);
        binding.recylerView2.setAdapter(adapter2);




    }
}