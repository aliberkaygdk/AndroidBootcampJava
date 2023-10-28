package com.example.javadersleri.standart_programlama;

public class IfVeSwitchKullanimi {
    public static void main(String[] args) {
        int yas = 17;
        String isim = "Mehmet";

        if (yas >= 18) {
            System.out.println("Reşitsiniz");
        } else
            System.out.println("Reşit Degilsiniz");

        if (isim == "Ahmet") {
            System.out.println("Merhaba Ahmet");
        } else if (isim == "Mehmet") {
            System.out.println("Merhaba Mehmet");
        } else {
            System.out.println("Tanınmayan kişi");
        }

        String ka = "admin";
        int s = 12345;

        if (ka == "admin" && s == 123456) {
            System.out.println("Hosgeldiniz");
        } else
            System.out.println("Hatalı giris");

        int sayi = 9;
        if (sayi == 9 || sayi == 10) {
            System.out.println("SAyı 9 veya 10 dur");
        }else
            System.out.println("SAyı 9 veya 10 değildir");

        //Switch = Kotlin(When)
        int gun = 9;

        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("böle bir gün yok");
                break;
        }
    }
}
