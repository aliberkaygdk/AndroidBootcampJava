package com.example.javadersleri.nesne_tabanli;

public class FonksiyonlarMain {
    public static void main(String[] args) {
        Fonksiyonlar f = new Fonksiyonlar();
        f.selamla1();

        String gelenSonuc = f.selamla2();
        System.out.println("Gelen Sonuc : "+gelenSonuc);

        f.selamla3("Zeynep");

        f.carp(10,5,"zeynep");
    }
}
