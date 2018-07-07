package com.example.application.militarytraining;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class m2 extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);
        webview = (WebView) findViewById(R.id.webview);

        webview.loadUrl("https://www.youtube.com/watch?v=GXm-IiGyle0");
    }
}

