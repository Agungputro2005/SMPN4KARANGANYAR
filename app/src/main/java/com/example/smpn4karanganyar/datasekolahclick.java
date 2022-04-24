package com.example.smpn4karanganyar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class datasekolahclick extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kepalasekolahdanguru);
    }
    public void staftu(View view){
        Intent intent = new Intent(datasekolahclick.this,staftu.class);
        startActivity(intent);
    }
    public void kepsekguruclick(View view){
        Intent intent = new Intent(datasekolahclick.this,kepsekguruclick.class);
        startActivity(intent);
    }
}