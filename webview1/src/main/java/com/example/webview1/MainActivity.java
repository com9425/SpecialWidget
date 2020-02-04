package com.example.webview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUrl;
    Button btnGo, btnBack;
    WebView webView1;
    String urlStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUrl = (EditText) findViewById(R.id.edtUrl);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnGo = (Button) findViewById(R.id.btnGo);
        webView1 = (WebView) findViewById(R.id.webView1);
        webView1.setWebViewClient(new Homeshow());
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urlStr = edtUrl.getText().toString();
                if (urlStr.substring(0, 7).equals("http://"))
                    webView1.loadUrl(urlStr);

            else {
                webView1.loadUrl("http://" + urlStr);



            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView1.goBack();
            }
        });

    }

    class Homeshow extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
