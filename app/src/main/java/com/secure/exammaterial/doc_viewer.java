package com.secure.exammaterial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import com.google.android.material.navigation.NavigationView;

public class doc_viewer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    private WebView mWebview ;
    private String url = home.url;
    RelativeLayout progress_bar;


    private String removePdfTopIcon = "javascript:(function() {" + "document.querySelector('[role=\"toolbar\"]').remove();})()";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_viewer);

        init();
        //-----------------------Side Navigation Bar-----------------------------
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(doc_viewer.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(doc_viewer.this);
        //-----------------------------------------------------------------------

        showPdfFile(url);

    }
    public void init(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);
        progress_bar = findViewById(R.id.progress_bar);
    }
    @Override
    public void onBackPressed() {
        mWebview.clearCache(true);
        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }


    private void showPdfFile(final String imageString) {
        showProgress();
        //-------------------------------- Make web view invisible ------------------------
        mWebview  = new WebView(this);
        mWebview = findViewById(R.id.webview);
        mWebview.setVisibility(View.GONE);
        //---------------------------------------------------------------------------------
        mWebview.invalidate();
        mWebview.getSettings().setJavaScriptEnabled(true);
        mWebview.getSettings().setSupportZoom(true);
        mWebview.loadUrl("https://docs.google.com/gview?embedded=true&url=" + imageString);
        mWebview.setWebViewClient(new WebViewClient() {
            boolean checkOnPageStartedCalled = false;

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                checkOnPageStartedCalled = true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                if (checkOnPageStartedCalled) {
                    mWebview.loadUrl(removePdfTopIcon);
                    hideProgress();
                } else {
                    showPdfFile(imageString);
                }
            }
        });
    }
    public void showProgress() {
        //-------------------------- Make Progress bar visible --------------------------
        AlphaAnimation alpha = new AlphaAnimation(1.0F, 1.0F);
        alpha.setFillAfter(true);
        progress_bar.startAnimation(alpha);
        //-------------------------------------------------------------------------------
    }
    public void hideProgress() {
        //-------------------------- Make Progress bar invisible --------------------------
        AlphaAnimation alpha = new AlphaAnimation(0.0F, 0.0F);
        alpha.setDuration(0);
        alpha.setFillAfter(true);
        //---------------------------------------------------------------------------------
        //--------------------------------- Make web view visible -------------------------
        mWebview.setVisibility(View.VISIBLE);
        progress_bar.startAnimation(alpha);
        //---------------------------------------------------------------------------------
    }
}