package com.aliberkaygedikoglu.n11tasarim.data.entity;

public class Cardview {
    private String fiyat;
    private String firsatTop;
    private int firsatImage;
    private String icerik;



    public Cardview(String fiyat, String firsatTop, int firsatImage, String icerik) {
        this.fiyat = fiyat;
        this.firsatTop = firsatTop;
        this.firsatImage = firsatImage;
        this.icerik = icerik;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getFirsatTop() {
        return firsatTop;
    }

    public void setFirsatTop(String firsatTop) {
        this.firsatTop = firsatTop;
    }

    public int getFirsatImage() {
        return firsatImage;
    }

    public void setFirsatImage(int firsatImage) {
        this.firsatImage = firsatImage;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }
}
