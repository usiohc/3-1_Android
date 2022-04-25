package com.inhatc.android_checkboxradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView objTV;
    private RadioButton rdoScreenSet;
    private RadioButton rdoScreenReset;
    private CheckBox chkColor_R;
    private CheckBox chkColor_G;
    private CheckBox chkColor_B;
    private int bkColor = 0xFF000000;
    private String strData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objTV = (TextView)findViewById(R.id.textView3);

        rdoScreenSet = (RadioButton)findViewById(R.id.radio0);
        rdoScreenReset = (RadioButton)findViewById(R.id.radio1);
        rdoScreenSet.setOnClickListener(rdoScreen_listener);

    }
}