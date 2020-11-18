package com.secure.exammaterial.gate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.secure.exammaterial.R;
import com.secure.exammaterial.category.gate_category;
import com.secure.exammaterial.doc_viewer;
import com.secure.exammaterial.home;
import com.secure.exammaterial.offline;
import com.secure.exammaterial.pdf_viewer;

public class gate_web_view extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    private WebView mWebview ;
    private String url = home.url;
    RelativeLayout progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate_web_view);

        init();

        //-----------------------Side Navigation Bar-----------------------------
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(gate_web_view.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(gate_web_view.this);
        //-----------------------------------------------------------------------

        //------------- Make Progress bar visible and web view invisible----------
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
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                String ext = url.substring(url.lastIndexOf("."));
                String ext_drive = url.substring(url.lastIndexOf("/"));
                if(ext.equals(".pdf")) {
                    startViewing(url);
                }
                else if(ext_drive.equals("/view")){
                    startViewing_pdf(url);
                }
                else{
                    return true;
                }
                return true;
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mWebview.loadUrl("javascript:(function() { " +
                        "document.querySelector('[role=\"toolbar\"]').remove();})()");
                //----------------- After Successful loading of web view ----------------
                //------------- Make Progress bar invisible and web view visible----------
                progress_bar = findViewById(R.id.progress_bar);
                AlphaAnimation alpha = new AlphaAnimation(0.0F, 0.0F);
                alpha.setDuration(0);
                alpha.setFillAfter(true);
                mWebview.setVisibility(View.VISIBLE);
                progress_bar.startAnimation(alpha);
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Intent intent = new Intent(gate_web_view.this, offline.class);
                startActivity(intent);
                super.onReceivedError(view, errorCode, description, failingUrl);
            }
        });
        mWebview.loadUrl(url);
        //---------------------------------------------------------------------------------
    }

    public void init(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);
        progress_bar = findViewById(R.id.progress_bar);
    }

    void startViewing(String url_res){
        Intent intent = new Intent(this, doc_viewer.class);
        home.url = url_res;
        startActivity(intent);
    }

    void startViewing_pdf(String url_res){
        Intent intent = new Intent(this, pdf_viewer.class);
        home.url = url_res;
        startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}