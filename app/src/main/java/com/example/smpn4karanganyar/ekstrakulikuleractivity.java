package com.example.smpn4karanganyar;

import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ekstrakulikuleractivity extends Activity {
    String judul[],pengertian[],fungsi[],tujuan[],jadwal[];
    int image[] = {R.drawable.osis, R.drawable.pmr, R.drawable.dewanpenggalang, R.drawable.basket,
            R.drawable.gamelansatu, R.drawable.vollyball, R.drawable.bta};
    LinearLayout osis, pmr, pramuka, basket, karawitan, voli, bta;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.ekstrakulikuler);
//        judul = getResources().getStringArray(R.array.extra);
//        pengertian = getResources().getStringArray(R.array.pengertian);
//        fungsi = getResources().getStringArray(R.array.fungsi);
//        tujuan = getResources().getStringArray(R.array.tujuan);
//        jadwal = getResources().getStringArray(R.array.Waktu_Pelaksana);


        osis = findViewById(R.id.osissatu);
        pmr = findViewById(R.id.pmr);
        pramuka = findViewById(R.id.pramuka);
        basket = findViewById(R.id.basket);
        karawitan = findViewById(R.id.karawitan);
        voli = findViewById(R.id.volly);
        bta = findViewById(R.id.bta);


        osis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent( ekstrakulikuleractivity.this, osisclick.class);
                in.putExtra("judul", judul[1]);
                in.putExtra("pengertian", pengertian[1]);
                in.putExtra("fungsi", fungsi[1]);
                in.putExtra("tujuan", tujuan[1]);
                in.putExtra("jadwal", jadwal[1]);
                in.putExtra("gbr", image[1]);
            }
        });
        pmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent( ekstrakulikuleractivity.this, osisclick.class);
                in.putExtra("judul", judul[2]);
                in.putExtra("pengertian", pengertian[2]);
                in.putExtra("fungsi", fungsi[2]);
                in.putExtra("tujuan", tujuan[2]);
                in.putExtra("jadwal", jadwal[2]);
                in.putExtra("gbr", image[2]);
            }
        });
//        pramuka.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        basket.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        karawitan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        voli.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//        bta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }
}
