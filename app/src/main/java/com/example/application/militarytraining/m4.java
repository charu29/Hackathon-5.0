package com.example.application.militarytraining;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class m4 extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);
        webview = (WebView) findViewById(R.id.webview);

        webview.loadUrl("https://www.youtube.com/watch?v=SlKmXVXy0k4");
    }
}

