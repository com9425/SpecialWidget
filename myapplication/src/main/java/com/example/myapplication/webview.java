package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WebView extends AppCompatActivity {

    EditText edtUrl;
    Button btnGo, btnBack;
    WebView webView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        edtUrl=(EditText)findViewById(R.id.edtUrl);
        btnBack=(Button)findViewById(R.id.btnBack);
        btnGo=(Button)findViewById(R.id.btnGo);
        webView1=(WebView)findViewById(R.id.webView1);
        webView1.setWebViewClient(new Homeshow());
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView1.loadUrl(edtUrl.getText().toString());
            }
        });

    }
    class Homeshow extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){

            return super.shouldOverrideUrlLoading(view, url);
        }

    }
}
