package com.example.smpn4karanganyar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provil extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }

    public void sejarahclick(View view) {
        Intent intent = new Intent(provil.this, sejarahclick.class);
        startActivity(intent);
    }

    public void profilclick(View view) {
        Intent intent = new Intent(provil.this, profilclick.class);
        startActivity(intent);
    }

   public void biodataclick(View view){
        Intent intent = new Intent(provil.this, biodataclick.class);
        startActivity(intent);
    }
    public void strukturclick(View view){
        Intent intent = new Intent(provil.this,strukturclick.class);
        startActivity(intent);
    }
    public void visimisiclick(View view) {
        Intent intent = new Intent(provil.this, visimisiclick.class);
        startActivity(intent);
    }

}
