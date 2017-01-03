package com.example.gurnoor.gndec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {



        WebView webView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            webView = (WebView)findViewById(R.id.webView);

            WebViewClient client = new WebViewClient();


            webView.setWebViewClient(client);
            webView.loadUrl("http://gndec.ac.in/");
        }
    }
