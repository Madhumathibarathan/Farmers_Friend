package com.example.barat.plspls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Wpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpage);

        WebView wv = (WebView)findViewById(R.id.my_webview);


        wv.setWebViewClient(new WebViewClient() {
            @Override


            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);


                return true;
            }


        });


        wv.loadUrl("http://cropcrop.freeforums.net/ ");


    }


}


