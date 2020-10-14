package com.secure.exammaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.File;

public class pdf_viewer extends AppCompatActivity {
    private WebView mWebview ;
    private String url = home.url;
    RelativeLayout progress_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        progress_bar = findViewById(R.id.progress_bar);
        AlphaAnimation alpha = new AlphaAnimation(1.0F, 1.0F);
        alpha.setFillAfter(true);
        progress_bar.startAnimation(alpha);

        mWebview  = new WebView(this);
        mWebview = findViewById(R.id.webview);
        mWebview.setVisibility(View.GONE);
        mWebview.getSettings().setJavaScriptEnabled(true);
        mWebview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                mWebview.loadUrl("javascript:(function() { " +
                        "document.querySelector('[role=\"toolbar\"]').remove();})()");

            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mWebview.loadUrl("javascript:(function() { " +
                        "document.querySelector('[role=\"toolbar\"]').remove();})()");

                progress_bar = findViewById(R.id.progress_bar);
                AlphaAnimation alpha = new AlphaAnimation(0.0F, 0.0F);
                alpha.setDuration(0);
                alpha.setFillAfter(true);
                mWebview.setVisibility(View.VISIBLE);
                progress_bar.startAnimation(alpha);
            }
        });
        mWebview.loadUrl(url);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}