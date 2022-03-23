package com.example.smpn4karanganyar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guruclick(View view){
        Intent intent = new Intent(MainActivity.this, guruaktivity.class);
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
    }


}