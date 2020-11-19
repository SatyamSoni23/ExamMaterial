package com.secure.exammaterial.category;

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

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.secure.exammaterial.MainActivity;
import com.secure.exammaterial.R;
import com.secure.exammaterial.doc_viewer;
import com.secure.exammaterial.gate.gate_web_view;
import com.secure.exammaterial.home;
import com.secure.exammaterial.login;
import com.secure.exammaterial.offline;
import com.secure.exammaterial.pdf_viewer;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.civil_main;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class gate_category extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    RelativeLayout progress_bar;

    MaterialCardView rl_2020_p1, rl_2019_p1, rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1,
                     rl_2013_p1, rl_2012_p1, rl_2011_p1, rl_2010_p1, rl_2009_p1, rl_2008_p1, rl_2007_p1;

    FirebaseAuth mAuth;

    @Override
    protected void onStart() {
        if(mAuth.getCurrentUser() == null){
            onBackPressed();
        }
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate_category);

        init();

        mAuth = FirebaseAuth.getInstance();

        //-----------------------Side Navigation Bar-----------------------------
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(gate_category.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(gate_category.this);
        //-----------------------------------------------------------------------


    }

    public void init(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);
        progress_bar = findViewById(R.id.progress_bar);

        rl_2020_p1 = findViewById(R.id.rl_2020_p1);
        rl_2019_p1 = findViewById(R.id.rl_2019_p1);
        rl_2018_p1 = findViewById(R.id.rl_2018_p1);
        rl_2017_p1 = findViewById(R.id.rl_2017_p1);
        rl_2016_p1 = findViewById(R.id.rl_2016_p1);
        rl_2015_p1 = findViewById(R.id.rl_2015_p1);
        rl_2014_p1 = findViewById(R.id.rl_2014_p1);
        rl_2013_p1 = findViewById(R.id.rl_2013_p1);
        rl_2012_p1 = findViewById(R.id.rl_2012_p1);
        rl_2011_p1 = findViewById(R.id.rl_2011_p1);
        rl_2010_p1 = findViewById(R.id.rl_2010_p1);
        rl_2009_p1 = findViewById(R.id.rl_2009_p1);
        rl_2008_p1 = findViewById(R.id.rl_2008_p1);
        rl_2007_p1 = findViewById(R.id.rl_2007_p1);

        rl_2020_p1.setOnClickListener(this);
        rl_2019_p1.setOnClickListener(this);
        rl_2018_p1.setOnClickListener(this);
        rl_2017_p1.setOnClickListener(this);
        rl_2016_p1.setOnClickListener(this);
        rl_2015_p1.setOnClickListener(this);
        rl_2014_p1.setOnClickListener(this);
        rl_2013_p1.setOnClickListener(this);
        rl_2012_p1.setOnClickListener(this);
        rl_2011_p1.setOnClickListener(this);
        rl_2010_p1.setOnClickListener(this);
        rl_2009_p1.setOnClickListener(this);
        rl_2008_p1.setOnClickListener(this);
        rl_2007_p1.setOnClickListener(this);

    }

    void startViewing(String url_res){
        Intent intent = new Intent(this, doc_viewer.class);
        home.url = url_res;
        startActivity(intent);
    }

    void start_gate_web_view(String url_web){
        Intent intent = new Intent(this, gate_web_view.class);
        home.url = url_web;
        startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_home){
            start_nav_activity(home.class);
        }
        else if(id == R.id.civil_pre_nav){
            start_nav_activity(civil_pre.class);
        }
        else if(id == R.id.civil_main_nav){
            start_nav_activity(civil_main.class);
        }
        else if(id == R.id.nda_nav){
            start_nav_activity(nda_nae.class);
        }
        else if(id == R.id.cds_nav){
            start_nav_activity(cds.class);
        }
        else if(id == R.id.cgs_nav){
            start_nav_activity(cgs_category.class);
        }
        else if(id == R.id.ies_nav){
            start_nav_activity(ies_category.class);
        }
        else if(id == R.id.jee_main_nav){
            start_nav_activity(iit_jee_category.class);
        }
        else if(id == R.id.jee_advanced_nav){
            start_nav_activity(IitJeeAdvancedCategoryActivity.class);
        }
        else if(id == R.id.gate_nav){
            start_nav_activity(gate_category.class);
        }
        else if(id == R.id.neet_nav){
            start_nav_activity(neet_category.class);
        }
        else if(id == R.id.logout){
            mAuth.signOut();
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        }
        return true;
    }

    void start_nav_activity(Class act){
        Intent intent = new Intent(this, act);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_2020_p1:
                start_gate_web_view("http://gate.iitkgp.ac.in/?id=gdl");
                break;
            case R.id.rl_2019_p1:
                start_gate_web_view("http://gate.iitkgp.ac.in/?id=gdl");
                break;
            case R.id.rl_2018_p1:
                start_gate_web_view("http://gate.iitm.ac.in/gate2019/previousqp18.php");
                break;
            case R.id.rl_2017_p1:
                start_gate_web_view("http://gate.iitm.ac.in/gate2019/previousqp17.php");
                break;
            case R.id.rl_2016_p1:
                start_gate_web_view("http://gate.iitm.ac.in/gate2019/previousqp.php");
                break;
            case R.id.rl_2015_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate15.html");
                break;
            case R.id.rl_2014_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate14.html");
                break;
            case R.id.rl_2013_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate13.html");
                break;
            case R.id.rl_2012_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate12.html");
                break;
            case R.id.rl_2011_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate11.html");
                break;
            case R.id.rl_2010_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate10.html");
                break;
            case R.id.rl_2009_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate9.html");
                break;
            case R.id.rl_2008_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate8.html");
                break;
            case R.id.rl_2007_p1:
                start_gate_web_view("https://www.iitr.ac.in/gate/gate7.html");
                break;
            default:
                break;
        }
    }
}