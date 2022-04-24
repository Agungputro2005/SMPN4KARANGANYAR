package com.example.smpn4karanganyar;

import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ekstrakulikuleractivity extends Activity {
    String judul[], pengertian[], fungsi[], tujuan[], jadwal[];
    int image[] = {R.drawable.osis, R.drawable.pmr, R.drawable.dewanpenggalang, R.drawable.basket,
            R.drawable.gamelansatu, R.drawable.vollyball, R.drawable.bta};
    LinearLayout osis, pmr, pramuka, basket, karawitan, voli, bta;
    CardView osis1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ekstrakulikuler);


//        judul = getResources().getStringArray(R.array.extra);
//        pengertian = getResources().getStringArray(R.array.pengertian);
//        fungsi = getResources().getStringArray(R.array.fungsi);
//        tujuan = getResources().getStringArray(R.array.tujuan);
//        jadwal = getResources().getStringArray(R.array.Waktu_Pelaksana);


        osis1 = findViewById(R.id.osissatuu);
        pmr = findViewById(R.id.pmrsatu);
        pramuka = findViewById(R.id.dewansatu);
        basket = findViewById(R.id.basketsatu);
        karawitan = findViewById(R.id.karawitansatu);
        voli = findViewById(R.id.vollysatu);


        osis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(ekstrakulikuleractivity.this, osisclick.class);
//                in.putExtra("judul", judul[1]);
//                in.putExtra("pengertian", pengertian[1]);
//                in.putExtra("fungsi", fungsi[1]);
//                in.putExtra("tujuan", tujuan[1]);
//                in.putExtra("jadwal", jadwal[1]);
//                in.putExtra("gbr", image[1]);
                startActivity(inte);
            }
        });
        pmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ekstrakulikuleractivity.this, pmrclick.class);
//                in.putExtra("judul", judul[2]);
//                in.putExtra("pengertian", pengertian[2]);
//                in.putExtra("fungsi", fungsi[2]);
//                in.putExtra("tujuan", tujuan[2]);
//                in.putExtra("jadwal", jadwal[2]);
//                in.putExtra("gbr", image[2]);
                startActivity(in);
            }
        });
        pramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ekstrakulikuleractivity.this, pramukaclick.class);
//                in.putExtra("judul", judul[2]);
//                in.putExtra("pengertian", pengertian[2]);
//                in.putExtra("fungsi", fungsi[2]);
//                in.putExtra("tujuan", tujuan[2]);
//                in.putExtra("jadwal", jadwal[2]);
//                in.putExtra("gbr", image[2]);
                startActivity(in);
            }
        });
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ekstrakulikuleractivity.this, basketclick.class);
//                in.putExtra("judul", judul[2]);
//                in.putExtra("pengertian", pengertian[2]);
//                in.putExtra("fungsi", fungsi[2]);
//                in.putExtra("tujuan", tujuan[2]);
//                in.putExtra("jadwal", jadwal[2]);
//                in.putExtra("gbr", image[2]);
                startActivity(in);
            }
        });
        karawitan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ekstrakulikuleractivity.this, karawitanclick.class);
//                in.putExtra("judul", judul[2]);
//                in.putExtra("pengertian", pengertian[2]);
//                in.putExtra("fungsi", fungsi[2]);
//                in.putExtra("tujuan", tujuan[2]);
//                in.putExtra("jadwal", jadwal[2]);
//                in.putExtra("gbr", image[2]);
                startActivity(in);
            }
        });
        voli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ekstrakulikuleractivity.this, voliclick.class);
//                in.putExtra("judul", judul[2]);
//                in.putExtra("pengertian", pengertian[2]);
//                in.putExtra("fungsi", fungsi[2]);
//                in.putExtra("tujuan", tujuan[2]);
//                in.putExtra("jadwal", jadwal[2]);
//                in.putExtra("gbr", image[2]);
                startActivity(in);
//
            }
        });
//        bta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {

//
//            }
//        })
//            }


        }

    }

