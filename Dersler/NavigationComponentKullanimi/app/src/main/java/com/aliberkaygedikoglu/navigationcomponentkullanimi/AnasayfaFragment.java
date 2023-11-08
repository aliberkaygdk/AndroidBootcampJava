package com.aliberkaygedikoglu.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliberkaygedikoglu.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      //  return inflater.inflate(R.layout.fragment_anasayfa, container, false);
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        binding.buttonDetay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // binding.textViewAnasayfa.setText("Merhaba");
                Urunler urun = new Urunler(100,"TV");
                AnasayfaFragmentDirections.DetayGecis gecis=AnasayfaFragmentDirections.detayGecis(urun);
                gecis.setAd("Ahmet");
                gecis.setYas(23);
                gecis.setBoy(1.78f);
                gecis.setBekar(true);



                Navigation.findNavController(v).navigate(gecis);
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Yaşam Döngüsü","onCreate");
        //uygulama calısıtırıldığında bir kere çalısır.

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü","onResume");
        //sayfa her görüldüğünde çalısır
        //sayfaya geri dönüldüğünde

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü","onPause");
        //Sayfa her görünmez olduğunda.

    }
}