package com.secure.exammaterial.upsc;

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

import com.secure.exammaterial.ies.ies_2014;
import com.secure.exammaterial.ies.ies_2015;
import com.secure.exammaterial.ies.ies_2016;
import com.secure.exammaterial.ies.ies_2017;
import com.secure.exammaterial.ies.ies_2018;
import com.secure.exammaterial.ies.ies_2019;
import com.secure.exammaterial.ies.ies_2020;

public class ies_category extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_2020_p1, rl_2019_p1, rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ies_category);

        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(ies_category.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(ies_category.this);

        //---------------------------------------------------------------------------------------------------------------
        rl_2020_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ies_category.this, ies_2020.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2019_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ies_category.this, ies_2019.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2018_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ies_category.this, ies_2018.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2017_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ies_category.this, ies_2017.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2016_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ies_category.this, ies_2016.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2015_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ies_category.this, ies_2015.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2014_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ies_category.this, ies_2014.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------
    }

    private void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        rl_2020_p1 = findViewById(R.id.rl_2020_p1);
        rl_2019_p1 = findViewById(R.id.rl_2019_p1);
        rl_2018_p1 = findViewById(R.id.rl_2018_p1);
        rl_2017_p1 = findViewById(R.id.rl_2017_p1);
        rl_2016_p1 = findViewById(R.id.rl_2016_p1);
        rl_2015_p1 = findViewById(R.id.rl_2015_p1);
        rl_2014_p1 = findViewById(R.id.rl_2014_p1);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}