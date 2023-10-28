package com.example.javadersleri.odev;

public class Odev2Class {

    public int icAciToplam(int kenarSayisi){
        int toplam=((kenarSayisi-2)*180)/kenarSayisi;
        System.out.println(toplam);
        return toplam;
    }

    public double gunMaasHesap(int gun){
        int saatHesabi=gun*8;
        double maas;

        if (saatHesabi<=150)
           maas= saatHesabi*40;
        else{
            maas=150*40+(saatHesabi-150)*80;
        }
        System.out.println(maas);
         return maas   ;

    }
    public double otoparkUcret(int saat){
        double ucret;
        if (saat<=1){
           ucret= saat*50;
        }else {
            ucret=50+10*saat;
        }
        System.out.println(ucret);
        return ucret;

    }

}
