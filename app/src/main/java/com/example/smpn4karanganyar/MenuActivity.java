package com.example.smpn4karanganyar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;



public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(MenuActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();

    }
}