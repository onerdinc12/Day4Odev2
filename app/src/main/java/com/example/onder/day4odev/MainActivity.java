package com.example.onder.day4odev;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int resimPozisyuon;
    ImageView resim;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resim = (ImageView) findViewById(R.id.imageView);
        text = (TextView) findViewById(R.id.textView);

    }

    public void kartal(View view) {

        Kuslar kartal = new Kuslar("Siyah","kartal",10,1);
        resimPozisyuon = kartal.getResimPozisyon();
        if(resimPozisyuon==1){
            resim.setImageResource(R.drawable.kartal);
            String kartalOzellikleri = " Rengi " + kartal.getRengi()+ " Türü " + kartal.getTur() + " Yaşı" + kartal.getYas();
            text.setText(kartalOzellikleri);

        }



    }


    public void guvercin(View view) {

        Kuslar guvercin = new Kuslar("Beyaz","Guvercin",2,2);
        resimPozisyuon = guvercin.getResimPozisyon();
        if(resimPozisyuon==2){

            resim.setImageResource(R.drawable.guvercin);
            String guvercinOzellikler = "Rengi " + guvercin.getRengi()+ " Türü " + guvercin.getTur() + " Yaşı " + guvercin.getYas();
            text.setText(guvercinOzellikler);
        }
    }


    public void kanarya(View view) {
        Kuslar kanarya = new Kuslar("Sarı","Kanarya",1907,3);
        resimPozisyuon = kanarya.getResimPozisyon();
        if(resimPozisyuon == 3){
            resim.setImageResource(R.drawable.kanarya);
            String kanaryaOzellikleri = "Rengi " + kanarya.getRengi() + " Türü " + kanarya.getTur() + " Yaşı " + kanarya.getYas();
            text.setText(kanaryaOzellikleri);
        }
    }
}
