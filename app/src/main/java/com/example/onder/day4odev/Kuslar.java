package com.example.onder.day4odev;

/**
 * Created by Onder on 11.03.2017.
 */

public class Kuslar {

    String rengi;
    String tur;
    int yas;
    int resimPozisyon;

    public Kuslar(String rengi, String tur, int yas, int resimPozisyon) {
        this.rengi = rengi;
        this.tur = tur;
        this.yas = yas;
        this.resimPozisyon = resimPozisyon;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getResimPozisyon() {
        return resimPozisyon;
    }

    public void setResimPozisyon(int resimPozisyon) {
        this.resimPozisyon = resimPozisyon;
    }
}
