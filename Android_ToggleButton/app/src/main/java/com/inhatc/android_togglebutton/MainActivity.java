package com.inhatc.android_togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.inhatc.android_togglebutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ToggleButton objTButton = null;
    private ActivityMainBinding mainbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainbinding = ActivityMainBinding.inflate(getLayoutInflater());
        mainbinding.tglOnOff.setOnClickListener(this);
        // 위와 같음
        // objTButton = (ToggleButton)findViewById(R.id.tglOnOff);
        // objTButton.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (objTButton.isChecked()) {
            Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
        }
    }
}