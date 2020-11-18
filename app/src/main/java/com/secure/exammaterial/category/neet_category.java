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
import com.secure.exammaterial.R;
import com.secure.exammaterial.home;
import com.secure.exammaterial.pdf_viewer;

public class neet_category extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_2019_p1;
    MaterialCardView rl_2009_p1;
    MaterialCardView rl_2007_aiims;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet_category);

        init();

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

        rl_2009_p1 = findViewById(R.id.rl_2009_p1);

        rl_2007_aiims = findViewById(R.id.rl_2007_aiims);

        rl_2019_p1.setOnClickListener(this);

        rl_2009_p1.setOnClickListener(this);

        rl_2007_aiims.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_2019_p1:
                startViewing("");;
                break;
            case R.id.rl_2009_p1:
                startViewing("");
                break;
            case R.id.rl_2007_aiims:
                startViewing("");
                break;
            default:
                break;
        }
    }
}