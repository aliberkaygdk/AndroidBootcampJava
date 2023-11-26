package com.aliberkaygedikoglu.spkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.aliberkaygedikoglu.spkullanimi.databinding.ActivityMainBinding;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SharedPreferences sharedPreferences = getSharedPreferences("Bilgiler",MODE_PRIVATE);
        //Veri Kaydı
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //Nesneleri json formatta kayıt edebilirsiniz.
        //GSON kütüphaneler kullanılır
        editor.putString("ad","Ahmet");
        editor.putInt("yas",23);
        editor.putFloat("boy",1.78f);
        editor.putBoolean("bekar",true);

        Set<String> liste = new HashSet<>();
        liste.add("Ali");
        liste.add("Ece");

        editor.putStringSet("liste",liste);

        editor.apply();

        //Veri Silme
       // editor.remove("ad");
        //editor.apply();

        //Veri okuma
        String gelenAd = sharedPreferences.getString("ad","isim yok");
        int gelenYas = sharedPreferences.getInt("yas",0);
        float gelenBoy = sharedPreferences.getFloat("boy",0.0f);
        boolean gelenBekar = sharedPreferences.getBoolean("bekar",false);

        Log.e("Gelen Ad",gelenAd);
        Log.e("Gelen Yaş",String.valueOf(gelenYas));
        Log.e("Gelen Boy",String.valueOf(gelenBoy));
        Log.e("Gelen Bekar",String.valueOf(gelenBekar));

        Set<String> gelenListe = sharedPreferences.getStringSet("liste",null);

        for (String a:gelenListe){
            Log.e("Gelen Liste",a);
        }

        //Sayaç Uygulaması
        int sayac = sharedPreferences.getInt("sayac",0);

        sayac = sayac+1;
        editor.putInt("sayac",sayac);
        editor.apply();
        binding.textViewSayac.setText("Açılış sayısı : "+sayac);

    }
}