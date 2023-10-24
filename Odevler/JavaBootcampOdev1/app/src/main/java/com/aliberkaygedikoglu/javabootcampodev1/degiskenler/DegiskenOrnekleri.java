package com.aliberkaygedikoglu.javabootcampodev1.degiskenler;

import java.util.Random;

public class DegiskenOrnekleri {
    public static void main(String[] args) {

        String ilce = "Fatsa";
        String kita = "Asya";
        System.out.println(ilce + "-" + kita);

        Random random = new Random();
        int ulkeKodu = random.nextInt(10);
        int sehirKodu = random.nextInt(1000);
        int firmaKodu = random.nextInt(10000000);

        String faks = "Faks numarası : " + "+" + ulkeKodu + "-" + sehirKodu + "-" + firmaKodu;
        System.out.println(faks);

        int postaKodu = 52400;
        String instaAdresi = "instagram.com/aliberkaygdk/";
        String calismaBolumu = "Yazılım Gelistirme";
        int urunMiktar = random.nextInt(100);
        String musterSoyad = "Turan";
        double odemeMiktar = 212.5;
        String dogumTarih = "21.05.1985";
        double borc = 586.7;
        String medeniHal = "Bekar";
        String videoYorum = "sddfasdfasdfdsfa";
        String odemeSaat = "22.05";
        double eftMiktar = 945.3;
        int satilanMiktar = 77;
        String telModel = "Galaxy S3";
        String dergiAd = "Bilim-Çocuk";
        String basimTarih = "14.01.2020";
        double zamMiktar = 654.4;
        int daireSayi = 7;
        double enlem = 19.562565;
        double boylam = 42.55265695; // suudi arabistanda bir yer
        String yemekAdi = "Pide";
        double urunFiyat = 12.99;
        String sirket = "E Corp.";
        String videoAdi = "Kurtlar Vadisi 1.Bölüm";
        int muzikSuresi = 184;
        double mekanPuan = 9.4;
        String dosyaAdi = "Yeni Klasör";
        String resimFormati = "*.jpg";
        String renk = "Beyaz";
        String renkKodu = "#ffffff";
        String bilgisayarModel = "Tulpar T7 20.6.2";
        double ekranBoyut = 17.3;
        int kullanimSuresi = 15648;
        double basinc = 4555.7;
        String etkinlikGunu = "09.08.2024";
        String odemeGunu = "10.08.2024";
        String yolculukCikisTarih = "05.06.2024";
        String mahalleAdi = "Dolunay";
        String otobusHatti = "19-K";
        int kullanilanDakika = 154;
        int kargoTakipNo = 12524886;
        int kuponSuresi = 5155;
        String kuponKodu = "5EKIM1923AA";
        String faturaTarih = "11.11.2021";

    }
}
