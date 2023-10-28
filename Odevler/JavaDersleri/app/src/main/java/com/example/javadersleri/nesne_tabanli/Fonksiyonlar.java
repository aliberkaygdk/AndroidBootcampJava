package com.example.javadersleri.nesne_tabanli;

public class Fonksiyonlar {
    //Void : geri dönüş değeri olmayan

    public void selamla1(){
        String sonuc = "Merhaba Ahmet";
        System.out.println(sonuc);
    }

    //return : geri dönüşü olan
    public String selamla2(){
        String sonuc = "Merhaba Ahmet";
        return sonuc;
    }

    //parametre
    public void selamla3(String isim){
        String sonuc = "Merhaba "+isim;
        System.out.println(sonuc);
    }

    //overloading
    public void carp(int sayi1,int sayi2){
        System.out.println("çarpma : "+(sayi1*sayi2));
    }
    public void carp(double sayi1,double sayi2){
        System.out.println("çarpma : "+(sayi1*sayi2));
    }
    public void carp(int sayi1,int sayi2,String isim){
        System.out.println("çarpma : "+(sayi1*sayi2));
    }
}
