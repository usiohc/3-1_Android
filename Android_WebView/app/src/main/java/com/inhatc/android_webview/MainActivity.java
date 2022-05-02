package com.inhatc.android_webview;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView objWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objWebView = (WebView) findViewById(R.id.webView);
        objWebView.setWebViewClient(new Android_WebViewClient());
        objWebView.getSettings().setJavaScriptEnabled(true);
        objWebView.loadUrl("http://www.google.com");
    }

    private class Android_WebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
        @Override
        public boolean shouldOverrideKeyEvent (WebView view, KeyEvent event){
            int keyCode = event.getKeyCode();
            if ((keyCode == KeyEvent.KEYCODE_DPAD_LEFT) && objWebView.canGoBack()) {
                objWebView.goBack();
                return true;
            }
            else if ((keyCode == KeyEvent.KEYCODE_DPAD_RIGHT) && objWebView.canGoForward()){
                objWebView.goForward();
                return true;
            }
            return false;
        }
    }
}