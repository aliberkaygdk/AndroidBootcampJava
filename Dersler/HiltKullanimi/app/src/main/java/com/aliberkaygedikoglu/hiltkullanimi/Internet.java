package com.aliberkaygedikoglu.hiltkullanimi;

import android.util.Log;

import javax.inject.Inject;

public class Internet {
    private Adres adres ;

    @Inject
    public Internet(Adres adres) {
        this.adres = adres;
    }

    public void basvuruYap(){
        Log.e("Sonuç",adres.getBilgi()+" adresine internet başvurusu yapıldı");
    }
}
