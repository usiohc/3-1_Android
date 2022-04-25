package com.inhatc.android_tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost myTabHost = null;
    TabHost.TabSpec myTabSpec;
    Drawable imgIcon = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTabHost = (TabHost)findViewById(R.id.tabhost);
        myTabHost.setup();

        //Add tab
        myTabSpec = myTabHost.newTabSpec("Artists")
                .setIndicator("Artists")
                .setContent(R.id.tab1);
        myTabHost.addTab(myTabSpec);

        myTabSpec = myTabHost.newTabSpec("Albums")
                .setIndicator("Albums")
                .setContent(R.id.tab2);
        myTabHost.addTab(myTabSpec);


        myTabSpec = myTabHost.newTabSpec("Songs")
                .setIndicator("Songs")
                .setContent(R.id.tab3);
        myTabHost.addTab(myTabSpec);

        myTabHost.setCurrentTab(0);

        //Change Tab Background Color
        myTabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#FF0000"));
        myTabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#00FF00"));
        myTabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#0000FF"));

        //set Tab Height = 150
        for(int idx=0; idx < myTabHost.getTabWidget().getChildCount();++idx)
            myTabHost.getTabWidget().getChildAt(idx).getLayoutParams().height = 150;
    }
}