package com.example.smpn4karanganyar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
LinearLayout osis, pmr,pramuka;
RelativeLayout eskul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        osis = findViewById(R.id.osissatu);
        pmr = findViewById(R.id.pmr);
        pramuka = findViewById(R.id.pramuka);
        eskul = findViewById(R.id.eskul);

        eskul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ekstrakulikuleractivity.class);
                startActivity(intent);
            }
        });

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


    public void osisclick(View view) {
    }
}