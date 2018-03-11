package com.wuriyanto.tutorial15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.my_webview);

        //String page = "<html><head><title>Musobar Media</title></head><body><h2>Welcome to Musobar Media</h2></body></html>";

        //myWebView.loadData(page, "text/html", "UTF-8");

        //myWebView.loadUrl("file:///android_asset/page/index.html");

        myWebView.loadUrl("https://www.google.co.id");
    }
}
