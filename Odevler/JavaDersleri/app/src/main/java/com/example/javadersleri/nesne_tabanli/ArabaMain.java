package com.example.javadersleri.nesne_tabanli;

public class ArabaMain {
    public static void main(String[] args) {
        Araba bmw = new Araba("Mavi",100,true);

       /* bmw.renk = "Mavi";
        bmw.hiz = 100;
        bmw.calisiyorMu = true;

        */
        bmw.bilgiAl();
        bmw.durdur();
        bmw.bilgiAl();
        bmw.calistir();
        bmw.bilgiAl();
        bmw.hizlan(40);
        bmw.bilgiAl();
        bmw.yavasla(10);
        bmw.bilgiAl();


        Araba sahin = new Araba("Beyaz",0,false);
       /* sahin.renk = "Beyaz";
        sahin.hiz = 0;
        sahin.calisiyorMu = false;


        */
        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.hizlan(60);
        sahin.bilgiAl();


    }
}
