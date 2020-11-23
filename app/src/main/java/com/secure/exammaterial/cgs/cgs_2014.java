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
import com.google.firebase.auth.FirebaseAuth;
import com.secure.exammaterial.R;
import com.secure.exammaterial.category.IitJeeAdvancedCategoryActivity;
import com.secure.exammaterial.category.gate_category;
import com.secure.exammaterial.category.iit_jee_category;
import com.secure.exammaterial.category.neet_category;
import com.secure.exammaterial.home;
import com.secure.exammaterial.login;
import com.secure.exammaterial.pdf_viewer;
import com.secure.exammaterial.update_password;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.civil_main;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class cgs_2014 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_chem_1, rl_chem_2, rl_chem_3, rl_geo_phy_1, rl_geo_phy_2,
                     rl_geo_phy_3, rl_geo_1, rl_geo_2, rl_geo_3, rl_eng_1, rl_hydro_1;

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
        setContentView(R.layout.activity_cgs_2014);

        init();

        mAuth = FirebaseAuth.getInstance();

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
        else if(id == R.id.update_password){
            start_nav_activity(update_password.class);
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
}