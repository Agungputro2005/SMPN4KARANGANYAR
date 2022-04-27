package com.example.smpn4karanganyar;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void guruclick(View view){
        Intent intent = new Intent(MainActivity.this, datasekolahclick.class);
        startActivity(intent);
    }public void galericlick(View view){
        Intent intent = new Intent(MainActivity.this,galeriactivity.class);
        startActivity(intent);
    }public void fasilitasclick(View view){
        Intent intent = new Intent(MainActivity.this,fasilitasactivity.class);
        startActivity(intent);
    }public  void ekstrakulikulerclick(View view){
         Intent intent = new Intent(MainActivity.this,ekstrakulikuleractivity.class);
         startActivity(intent);
    }public void profilclick(View view){
        Intent intent = new Intent(MainActivity.this,provil.class);
        startActivity(intent);
    }public void sejarahclick(View view){
        Intent intent = new Intent(MainActivity.this, sejarahclick.class);
        startActivity(intent);
    }public void biodataclick(View view) {
        Intent intent = new Intent(MainActivity.this, biodataclick.class);
        startActivity(intent);
    }public void strukturclick(View view){
        Intent intent = new Intent(MainActivity.this,strukturclick.class);
        startActivity(intent);
    }public void visimisiclick(View view){
        Intent intent = new Intent(MainActivity.this,visimisiclick.class);
        startActivity(intent);
    }public void ppdbclick(View view){
        Intent intent = new Intent(MainActivity.this,ppdbclick.class);
        startActivity(intent);
    }public void informasiclick(View view){
        Intent intent = new Intent(MainActivity.this,informasiclick.class);
        startActivity(intent);

    }
}