package com.secure.exammaterial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    public static String url = null;

    MaterialCardView jee_main, jee_advanced, civil_pre, civil_main, upsc, cat, neet, gate, cds, cgs, nda, ies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(home.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(home.this);
    }
    void init(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        jee_main = findViewById(R.id.jee_main_category);
        jee_advanced = findViewById(R.id.jee_advanced_category);
        civil_pre = findViewById(R.id.civil_pre_category);
        civil_main = findViewById(R.id.civil_main_category);
        upsc = findViewById(R.id.upsc_category);
        cat = findViewById(R.id.cat_category);
        neet = findViewById(R.id.neet_category);
        gate = findViewById(R.id.gate_category);
        cds = findViewById(R.id.cds_category);
        cgs = findViewById(R.id.cgs_category);
        nda = findViewById(R.id.nda_category);
        ies = findViewById(R.id.ies_category);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItems) {
        return false;
    }
}