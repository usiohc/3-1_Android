package com.inhatc.android_popup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ToggleButton objTGButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objTGButton = (ToggleButton) findViewById(R.id.tgbtnSwitch);
        objTGButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast objToast;
        LinearLayout objLayout;
        ImageView objImage;
        TextView objTV;

        if (objTGButton.isChecked()){
            objToast = new Toast(this);
            objLayout = new LinearLayout(this);
            objLayout.setOrientation(LinearLayout.VERTICAL);

            objImage = new ImageView(this);
            objImage.setImageResource(R.drawable.light);
            objLayout.addView(objImage);

            objTV = new TextView(this);
            objTV.setText("Turn-On Lamp");
            objLayout.addView(objTV);

            objToast.setView(objLayout);
            objToast.setDuration(Toast.LENGTH_LONG);
            objToast.show();
        } else {
            objToast = Toast.makeText(this, "Turn-Off Lamp", Toast.LENGTH_SHORT);
            objToast.show();
        }
    }
}