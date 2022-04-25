package com.inhatc.android_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCow, btnDog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCow = (Button)findViewById(R.id.btnCow);
        btnDog = (Button)findViewById(R.id.btnDog);
        btnCow.setOnClickListener(this);
        btnDog.setOnClickListener(this);
    }

    public void onClick(View v){
        if (v == btnCow) {
            Intent cowIntent = new Intent(MainActivity.this, CowActivity.class);
            startActivity(cowIntent);
        } else if (v == btnDog) {
            Intent dogIntent = new Intent(MainActivity.this, DogActivity.class);
            startActivity(dogIntent);
        }
    }
}