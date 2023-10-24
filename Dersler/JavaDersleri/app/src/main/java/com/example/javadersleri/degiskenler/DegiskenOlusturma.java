package com.example.javadersleri.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {

        String ogrenciAdi = "Ali";//referans tip
        int ogrenciYas = 23; //primitive tipler bu alttaki 4
        double ogrenciBoy = 1.70;
        char ogrenciBasharf = 'A';
        boolean ogrenciDevamEdiyorMu = true;

        System.out.println(ogrenciAdi);
        System.out.println(ogrenciYas);
        System.out.println(ogrenciBoy);
        System.out.println(ogrenciBasharf);
        System.out.println(ogrenciDevamEdiyorMu);

        int urun_id = 3416;
        String urun_adi = "Kol saati";
        int urun_adet = 100;
        double urun_fiyat = 149.99;
        String urun_tedarikcisi = "Rolex";

        System.out.println("Ürün id : "+urun_id);
        System.out.println("Ürün adı : "+urun_adi);
        System.out.println("Ürün adet : "+urun_adet);
        System.out.println("Ürün fiyat : "+urun_fiyat+" $");
        System.out.println("Ürün tedarikçi : "+urun_tedarikcisi);

        //Sabit : Constant
        //final (java) , let (swift) , val(kotlin), dart(final-const)
        int sayi = 10;
        System.out.println(sayi);
        sayi=80;
        System.out.println(sayi);

        final int numara = 40;
        System.out.println(numara);
        //numara = 100;

        //Tür Dönüşümü - Type Casting
        //1.Sayısaldan Sayısala
        int i = 67;
        double d = 35.98;
        int sonuc1 = (int) d;//explicit
        double sonuc2 = i;//unexplicit
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        //2Sayısaldan Metine
        String sonuc3 = String.valueOf(d);
        String sonuc4 = String.valueOf(i);
        System.out.println(sonuc3);
        System.out.println(sonuc4);

        //3.Metinden Sayısala
        String yazi1 = "89";
        String yazi2 = "43.91";



        int sonuc5 = Integer.parseInt(yazi1);
        double sonuc6 = Double.parseDouble(yazi2);
        System.out.println(sonuc5);
        System.out.println(sonuc6);


    }
}
