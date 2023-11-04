package com.example.javadersleri.nesne_tabanli;

public class Araba {
    String renk;
    int hiz;
    boolean calisiyorMu;

    public Araba() {//consturctor = init function
        System.out.println("Nesne olustu");
    }

    public Araba(String renk, int hiz, boolean calisiyorMu) {
        this.renk = renk;//shadowing
        this.hiz = hiz;
        this.calisiyorMu = calisiyorMu;
    }

    public void calistir() {//Side effect
        calisiyorMu = true;
        hiz = 5;
    }

    public void durdur() {
        calisiyorMu = false;
        hiz = 0;
    }

    public void hizlan(int miktar) {
        hiz = hiz + miktar;
    }
    public void yavasla(int miktar) {
        hiz = hiz - miktar;
    }

    public void bilgiAl() {
        System.out.println("--------");
        System.out.println(renk);
        System.out.println(hiz);
        System.out.println(calisiyorMu);
    }

}
