package com.secure.exammaterial.category;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.secure.exammaterial.R;
import com.secure.exammaterial.home;
import com.secure.exammaterial.login;
import com.secure.exammaterial.pdf_viewer;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.civil_main;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class neet_category extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_2019_p1, rl_2018_p1, rl_2016_p1, rl_2016_p2, rl_2015_p1, rl_2014_p1, rl_2013_p1, rl_2012_p1, rl_2012_p2;
    MaterialCardView rl_2009_p1, rl_2008_p1, rl_2007_p1, rl_2007_p2, rl_2006_p1, rl_2005_p1;
    MaterialCardView rl_2007_aiims, rl_2006_aiims, rl_2005_aiims, rl_2004_aiims, rl_2003_aiims, rl_2002_aiims, rl_2001_aiims,
                     rl_2000_aiims, rl_1998_aiims, rl_2008_aiims, rl_2010_aiims;

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
        setContentView(R.layout.activity_neet_category);

        init();

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(neet_category.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(neet_category.this);

    }

    void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        rl_2019_p1 = findViewById(R.id.rl_2019_p1);
        rl_2018_p1 = findViewById(R.id.rl_2018_p1);
        rl_2016_p1 = findViewById(R.id.rl_2016_p1);
        rl_2016_p2 = findViewById(R.id.rl_2016_p2);
        rl_2015_p1 = findViewById(R.id.rl_2015_p1);
        rl_2014_p1 = findViewById(R.id.rl_2014_p1);
        rl_2013_p1 = findViewById(R.id.rl_2013_p1);
        rl_2012_p1 = findViewById(R.id.rl_2012_p1);
        rl_2012_p2 = findViewById(R.id.rl_2012_p2);

        rl_2009_p1 = findViewById(R.id.rl_2009_p1);
        rl_2008_p1 = findViewById(R.id.rl_2008_p1);
        rl_2007_p1 = findViewById(R.id.rl_2007_p1);
        rl_2007_p2 = findViewById(R.id.rl_2007_p2);
        rl_2006_p1 = findViewById(R.id.rl_2006_p1);
        rl_2005_p1 = findViewById(R.id.rl_2005_p1);

        rl_2007_aiims = findViewById(R.id.rl_2007_aiims);
        rl_2006_aiims = findViewById(R.id.rl_2006_aiims);
        rl_2005_aiims = findViewById(R.id.rl_2005_aiims);
        rl_2004_aiims = findViewById(R.id.rl_2004_aiims);
        rl_2003_aiims = findViewById(R.id.rl_2003_aiims);
        rl_2002_aiims = findViewById(R.id.rl_2002_aiims);
        rl_2001_aiims = findViewById(R.id.rl_2001_aiims);
        rl_2000_aiims = findViewById(R.id.rl_2000_aiims);
        rl_1998_aiims = findViewById(R.id.rl_1998_aiims);
        rl_2008_aiims = findViewById(R.id.rl_2008_aiims);
        rl_2010_aiims = findViewById(R.id.rl_2010_aiims);

        rl_2019_p1.setOnClickListener(this);
        rl_2018_p1.setOnClickListener(this);
        rl_2016_p1.setOnClickListener(this);
        rl_2016_p2.setOnClickListener(this);
        rl_2015_p1.setOnClickListener(this);
        rl_2014_p1.setOnClickListener(this);
        rl_2013_p1.setOnClickListener(this);
        rl_2012_p1.setOnClickListener(this);
        rl_2012_p2.setOnClickListener(this);

        rl_2009_p1.setOnClickListener(this);
        rl_2008_p1.setOnClickListener(this);
        rl_2007_p1.setOnClickListener(this);
        rl_2007_p2.setOnClickListener(this);
        rl_2006_p1.setOnClickListener(this);
        rl_2005_p1.setOnClickListener(this);

        rl_2007_aiims.setOnClickListener(this);
        rl_2006_aiims.setOnClickListener(this);
        rl_2005_aiims.setOnClickListener(this);
        rl_2004_aiims.setOnClickListener(this);
        rl_2003_aiims.setOnClickListener(this);
        rl_2002_aiims.setOnClickListener(this);
        rl_2001_aiims.setOnClickListener(this);
        rl_2000_aiims.setOnClickListener(this);
        rl_1998_aiims.setOnClickListener(this);
        rl_2008_aiims.setOnClickListener(this);
        rl_2010_aiims.setOnClickListener(this);
    }

    void startViewing(String url_res){
        Intent intent = new Intent(this, pdf_viewer.class);
        home.url = url_res;
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
            case R.id.rl_2019_p1:
                startViewing("https://drive.google.com/file/d/19fvt48a5y3xycV6p6m4YUH2pEkYuwwYf/view?usp=sharing");;
                break;
            case R.id.rl_2018_p1:
                startViewing("https://drive.google.com/file/d/1sk41jTs7a0h-qsPjGmdpXosmxXMqVM-a/view?usp=sharing");;
                break;
            case R.id.rl_2016_p1:
                startViewing("https://drive.google.com/file/d/1CYbPYDQeEM4lQeIeCumC2Q4hlkc5f_Vp/view?usp=sharing");;
                break;
            case R.id.rl_2016_p2:
                startViewing("https://drive.google.com/file/d/1sBXZwXNJWw76YOer9_pNHGjSoKygqitn/view?usp=sharing");;
                break;
            case R.id.rl_2015_p1:
                startViewing("https://drive.google.com/file/d/110j9nu_Ao6llXk-5xm1IrtEQBt_4C4vM/view?usp=sharing");;
                break;
            case R.id.rl_2014_p1:
                startViewing("https://drive.google.com/file/d/1JLApIB3R_HY-iUBTOeDUe5FRHFVOgN-3/view?usp=sharing");;
                break;
            case R.id.rl_2013_p1:
                startViewing("https://drive.google.com/file/d/124iqZyljcgIFVNkX-66FdxjjDFrOJOX2/view?usp=sharing");;
                break;
            case R.id.rl_2012_p1:
                startViewing("https://drive.google.com/file/d/11uXwH9EXtLWyA3GazawZeW-SLj52aZw3/view?usp=sharing");;
                break;
            case R.id.rl_2012_p2:
                startViewing("https://drive.google.com/file/d/1ad-XBfHVODcaMok9Fz7KOnC63lFbsnRw/view?usp=sharing");;
                break;

            case R.id.rl_2009_p1:
                startViewing("https://drive.google.com/file/d/1ayewB1oXEnUZ8BP266U3Sq_Zgw2C-Naf/view?usp=sharing");
                break;
            case R.id.rl_2008_p1:
                startViewing("https://drive.google.com/file/d/1cc9zikgu-zqqYK8M1rOhlwQk4Q6NcMS9/view?usp=sharing");
                break;
            case R.id.rl_2007_p1:
                startViewing("https://drive.google.com/file/d/1s4TmNOXK2ROPejmwHIgiBLSZnBnYj9p_/view?usp=sharing");
                break;
            case R.id.rl_2007_p2:
                startViewing("https://drive.google.com/file/d/1cb-wsiKMbaHW36lG_utbiQODf_2LCob4/view?usp=sharing");
                break;
            case R.id.rl_2006_p1:
                startViewing("https://drive.google.com/file/d/1pghCQH8OybQZwb-NUsR4GxvIDx7HYmjF/view?usp=sharing");
                break;
            case R.id.rl_2005_p1:
                startViewing("https://drive.google.com/file/d/1wRJjt0mp0oLoXlcIgAXrXKf1nrxagx-Z/view?usp=sharing");
                break;

            case R.id.rl_2007_aiims:
                startViewing("https://drive.google.com/file/d/14GUOtlkuA2C5RuPNRuJJxR9n4jb-8esv/view?usp=sharing");
                break;
            case R.id.rl_2006_aiims:
                startViewing("https://drive.google.com/file/d/1ffU1KpaYsLllkTCAuxogOsWE2HI3AXdF/view?usp=sharing");
                break;
            case R.id.rl_2005_aiims:
                startViewing("https://drive.google.com/file/d/1FXdV2rUUe2n6Z-sKyO9c7h0yblbV60pl/view?usp=sharing");
                break;
            case R.id.rl_2004_aiims:
                startViewing("https://drive.google.com/file/d/1SHaXFOsPRgYK07jRU8-FNooX0m-XjwB1/view?usp=sharing");
                break;
            case R.id.rl_2003_aiims:
                startViewing("https://drive.google.com/file/d/19aqrxBVBAMqDmWG7-PzQJFaX5LqSFYsX/view?usp=sharing");
                break;
            case R.id.rl_2002_aiims:
                startViewing("https://drive.google.com/file/d/1xzmtpkAuDbaPUcIS02MfFfMZ4Ixnsbtu/view?usp=sharing");
                break;
            case R.id.rl_2001_aiims:
                startViewing("https://drive.google.com/file/d/1k7QbHaflH5V0QwDQejXxEMUGfhjQYKFH/view?usp=sharing");
                break;
            case R.id.rl_2000_aiims:
                startViewing("https://drive.google.com/file/d/1IsYqs3-jXrQpQAIlG-mydSsOvUr96l0D/view?usp=sharing");
                break;
            case R.id.rl_1998_aiims:
                startViewing("https://drive.google.com/file/d/1FOm3uZTUmyRYcckuLtJvvZPxUZIy0V96/view?usp=sharing");
                break;
            case R.id.rl_2008_aiims:
                startViewing("https://drive.google.com/file/d/1relT7J_Eav7Ky5A_bQ45IhP9ZWQjd_nv/view?usp=sharing");
                break;
            case R.id.rl_2010_aiims:
                startViewing("https://drive.google.com/file/d/1KC3JwUwIONE1CkGZVaXiyogSdd5BbNYQ/view?usp=sharing");
                break;

            default:
                break;
        }
    }
}