package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //WebView myWebView;

    /*public void showInternalWebPage() {
        myWebView.loadUrl("file:///android_asset/about.html");
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("secondActivity", "hej");

        Bundle extras = getIntent().getExtras();

        //myWebView = findViewById(R.id.myWebView);

        //showInternalWebPage();
        Log.d("secondActivity", "" + extras);
    }
}