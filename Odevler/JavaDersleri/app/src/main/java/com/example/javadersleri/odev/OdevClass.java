package com.example.javadersleri.odev;

public class OdevClass {

    public double kmToMile(double km){
        double mile=km*0.621;
        System.out.println(mile);
        return mile;
    }
    public void dikdortgenAlan(double x, double y){
        double alan=x*y;
        System.out.println(alan);
    }
    public int faktoriyel(int f){
        int fSonuc=1;
        for (int i=1;i<=f;f--){
            fSonuc=fSonuc*f;
        }
        System.out.println(fSonuc);
        return fSonuc;
    }
    public void eHesap (String kelime){
        int eSay=0;
        for (int i=0;i<kelime.length();i++){
           // kelime.charAt(i);
            if (kelime.charAt(i)=='e'||kelime.charAt(i)=='E'){
                eSay=eSay+1;
            }

        }
        System.out.println(eSay);
    }
}
