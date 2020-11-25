package com.example.mywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.mywebview);
//        Intent intent=getIntent();
//        Uri data =intent.getData();
//        URL url =null;
//        try{
//            url=new URL(data.getScheme(),data.getHost(),data.getPath());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        startBrowser(url);
//    }
//    private void startBrowser(URL url){
//        WebView webView=findViewById(R.id.webView);
//        webView.loadUrl(url.toString());
//        webView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view,String url){
//                view.loadUrl(url);
//                return true;
//            }
//        });
//    }
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mywebview);
        Intent intent=getIntent();
        Uri data =intent.getData();
        URL url =null;
        try{
            url=new URL(data.getScheme(),data.getHost(),data.getPath());
        }catch (Exception e){
            e.printStackTrace();
        }
        startBrowser(url);
    }
    private void startBrowser(URL url){
        WebView webView =findViewById(R.id.webView);
//        webView.getSettings().setJavaScriptEnabled(true);//让WebView支持JavaScript脚本
        webView.setWebViewClient(new WebViewClient());//在WebView上显示网页
        webView.loadUrl(url.toString());
    }



}
