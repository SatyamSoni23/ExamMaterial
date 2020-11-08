package com.secure.exammaterial.cgs;

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
import com.secure.exammaterial.R;
import com.secure.exammaterial.home;
import com.secure.exammaterial.pdf_viewer;

public class cgs_2015 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_chem_1, rl_chem_2, rl_chem_3, rl_geo_phy_1, rl_geo_phy_2,
            rl_geo_phy_3, rl_geo_1, rl_geo_2, rl_geo_3, rl_eng_1, rl_hydro_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgs_2015);

        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(cgs_2015.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(cgs_2015.this);

        rl_chem_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1LR15Y32pwRKcBuCMbG0J7wXDOl982_7w/view?usp=sharing");
            }
        });
        rl_chem_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ayQUX_32aXfe2YWQgXJ_nZVsgrsuwV1g/view?usp=sharing");
            }
        });
        rl_chem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1O3EU00tvFb-ieRVWySkhx3Et4kw85o1g/view?usp=sharing");
            }
        });
        rl_geo_phy_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1aaAKnlsPC1SzWSFHAQ1cXaIw4pk6afhu/view?usp=sharing");
            }
        });
        rl_geo_phy_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1VSK7-on_Qf1HeLipzdMxN3-fPN4cBGH6/view?usp=sharing");
            }
        });
        rl_geo_phy_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1sPBGFDFBvx_YIKCMlAP8N1D_ATkSP_d5/view?usp=sharing");
            }
        });
        rl_geo_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1w8mF7zV7AyKUzl7_Ywu07TFGQJG_w8UA/view?usp=sharing");
            }
        });
        rl_geo_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1DswGMiMYRdzl2epcNm_qUbF6xWmcehM0/view?usp=sharing");
            }
        });
        rl_geo_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ucuMuB_1lKyxaPlG_GFKa54FORo7V1AN/view?usp=sharing");
            }
        });
        rl_eng_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1lLgviELsjDAOuLRAuyR1xuTc7C7e7Nd_/view?usp=sharing");
            }
        });
        rl_hydro_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1DzPX9jh2LZb6whGUNe89MN7igBaMrZNe/view?usp=sharing");
            }
        });

    }

    private void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        rl_chem_1 = findViewById(R.id.rl_chem_1);
        rl_chem_2 = findViewById(R.id.rl_chem_2);
        rl_chem_3 = findViewById(R.id.rl_chem_3);
        rl_geo_phy_1 = findViewById(R.id.rl_geo_phy_1);
        rl_geo_phy_2 = findViewById(R.id.rl_geo_phy_2);
        rl_geo_phy_3 = findViewById(R.id.rl_geo_phy_3);
        rl_geo_1 = findViewById(R.id.rl_geo_1);
        rl_geo_2 = findViewById(R.id.rl_geo_2);
        rl_geo_3 = findViewById(R.id.rl_geo_3);
        rl_eng_1 = findViewById(R.id.rl_eng_1);
        rl_hydro_1 = findViewById(R.id.rl_hydro_1);
    }

    void startViewing(String url_res){
        Intent intent = new Intent(this, pdf_viewer.class);
        home.url = url_res;
        startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}