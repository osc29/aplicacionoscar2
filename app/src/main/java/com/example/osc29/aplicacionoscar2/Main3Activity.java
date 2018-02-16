package com.example.osc29.aplicacionoscar2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main3Activity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView = (WebView) findViewById(R.id.Webview);

        webView.loadUrl("https://bungie.net");

        //webView.setWebViewClient(new WebViewClient() {
          //                           public boolean shouldOverrideUrlLoading(WebViewClient view, String url) {
            //                             return false;
              //                       }


                //                 }
        //);
    }
}