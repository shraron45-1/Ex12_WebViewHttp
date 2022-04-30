package com.example.webviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //进入学校官网
        Button button_web=(Button)findViewById(R.id.button_web);
        WebView webView = (WebView) findViewById(R.id.web_view);
        button_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.gdpu.edu.cn");
            }
        });
        //httpurl
        Button button_httpurl=(Button)findViewById(R.id.button_httpurl);
        button_httpurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,HttpURLConnectionActivity.class);
                startActivity(intent);
            }
        });
        Button button_Okhttp=(Button) findViewById(R.id.button_Okhttp);
        button_Okhttp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,OkHttpActivity.class);
                startActivity(intent);
            }
        });
    }
}