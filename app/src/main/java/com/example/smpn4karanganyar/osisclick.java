package com.example.smpn4karanganyar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class osisclick extends AppCompatActivity {
    ImageView iv;
    TextView judul,pengertian, pengertiaisi ,fungsi,tujuan,jadwal;
    String judulisi,pengertianisi,fungsiisi,tujuanisi,jadwalisi;
    int image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityosis);

        iv = findViewById(R.id.logoosis);
        judul = findViewById(R.id.judul);

        pengertiaisi = findViewById(R.id.isi_pengertian);
        fungsi = findViewById(R.id.isi_fungsi);
        tujuan = findViewById(R.id.tujuan);
        jadwal = findViewById(R.id.jadwal);

    }
    private void getdata(){
        if (  getIntent().hasExtra("judul") &&
                getIntent().hasExtra("pengetian") && getIntent().hasExtra("fungsi") && getIntent().hasExtra("tujuan")
                && getIntent().hasExtra("jadwal")  && getIntent().hasExtra("gbr")){
            judulisi = getIntent().getStringExtra("judul");
            pengertianisi = getIntent().getStringExtra("pengertian");
            fungsiisi = getIntent().getStringExtra("fungsi");
            tujuanisi = getIntent().getStringExtra("tujuan");
            jadwalisi = getIntent().getStringExtra("jadwal");
            image = getIntent().getIntExtra("gbr", 1);
        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        } }
    private void setdata(){
        iv.setImageResource(image);
        judul.setText(judulisi);
        pengertian.setText(judulisi);
        pengertian.setText(pengertianisi);
        fungsi.setText(fungsiisi);
        tujuan.setText(tujuanisi);
        jadwal.setText(jadwalisi);
    }

}
