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
import com.secure.exammaterial.upsc.cds;

public class cgs_2014 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_chem_1, rl_chem_2, rl_chem_3, rl_geo_phy_1, rl_geo_phy_2,
                     rl_geo_phy_3, rl_geo_1, rl_geo_2, rl_geo_3, rl_eng_1, rl_hydro_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgs_2014);

        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(cgs_2014.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(cgs_2014.this);

        rl_chem_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/16YnB9Q8j4EJiMY8lCrKSZSk3UEEJ7RCx/view?usp=sharing");
            }
        });
        rl_chem_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1wIP2TayFpNHeb69LTqS70-kz2lOyC8tI/view?usp=sharing");
            }
        });
        rl_chem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1gfSnz-D7I1l8DyEAcI48U2q_vEBnd5-N/view?usp=sharing");
            }
        });
        rl_geo_phy_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/15QipfTQQ5ZDryLoum_Lwf1Xbjy8aKGgp/view?usp=sharing");
            }
        });
        rl_geo_phy_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1VIQ6gA8JayC5rLuS6YTKlMyLfA4wyRVH/view?usp=sharing");
            }
        });
        rl_geo_phy_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1UjXx5NADHPWacGhW5lXIDMb4iFZeTQ1g/view?usp=sharing");
            }
        });
        rl_geo_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1cDjt8OxgTz4N9PrHBeZEEq_A8tbsRI27/view?usp=sharing");
            }
        });
        rl_geo_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1SsihL5GH8dHt57-8Wi9vvPGzm6t1FnTv/view?usp=sharing");
            }
        });
        rl_geo_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1kr5lrrMQdlLNOdicDO62S1owvChGmg2O/view?usp=sharing");
            }
        });
        rl_eng_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1v9_13eytemg-ZXGGK2P4X5TFN0WvDsUH/view?usp=sharing");
            }
        });
        rl_hydro_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1DjPu-RjF3z3rY2eIWQUvuR4sdDPIaWBn/view?usp=sharing");
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