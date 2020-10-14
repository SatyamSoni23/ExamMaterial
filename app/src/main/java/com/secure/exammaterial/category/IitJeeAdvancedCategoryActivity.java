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
import android.widget.RelativeLayout;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;
import com.secure.exammaterial.R;
import com.secure.exammaterial.home;
import com.secure.exammaterial.pdf_viewer;

public class IitJeeAdvancedCategoryActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    MaterialCardView rl_2020_p1;
    RelativeLayout rl_2019_p1, rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1, rl_2013_p1,
            rl_2012_p1, rl_2011_p1, rl_2010_p1, rl_2009_p1, rl_2008_p1, rl_2007_p1, rl_2006_p1, rl_2005_p1;
    RelativeLayout rl_2020_p2, rl_2019_p2, rl_2018_p2, rl_2017_p2, rl_2016_p2, rl_2015_p2, rl_2014_p2, rl_2013_p2,
            rl_2012_p2, rl_2011_p2, rl_2010_p2, rl_2009_p2, rl_2008_p2, rl_2007_p2, rl_2006_p2, rl_2005_p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iit_jee_advanced_category);

        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(IitJeeAdvancedCategoryActivity.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(IitJeeAdvancedCategoryActivity.this);


        rl_2020_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/13L9KdixvXT69tKg509njbQnq1aMim-GQ/view?usp=sharing");
            }
        });
        rl_2020_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1sRIDY79XGsDvKtpGoofm60lOVKSUCfcT/view");
            }
        });


    }

    void init(){
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
        rl_2013_p1 = findViewById(R.id.rl_2013_p1);
        rl_2012_p1 = findViewById(R.id.rl_2012_p1);
        rl_2011_p1 = findViewById(R.id.rl_2011_p1);
        rl_2010_p1 = findViewById(R.id.rl_2010_p1);
        rl_2009_p1 = findViewById(R.id.rl_2009_p1);
        rl_2008_p1 = findViewById(R.id.rl_2008_p1);
        rl_2007_p1 = findViewById(R.id.rl_2007_p1);
        rl_2006_p1 = findViewById(R.id.rl_2006_p1);
        rl_2005_p1 = findViewById(R.id.rl_2005_p1);

        rl_2020_p2 = findViewById(R.id.rl_2020_p2);
        rl_2019_p2 = findViewById(R.id.rl_2019_p2);
        rl_2018_p2 = findViewById(R.id.rl_2018_p2);
        rl_2017_p2 = findViewById(R.id.rl_2017_p2);
        rl_2016_p2 = findViewById(R.id.rl_2016_p2);
        rl_2015_p2 = findViewById(R.id.rl_2015_p2);
        rl_2014_p2 = findViewById(R.id.rl_2014_p2);
        rl_2013_p2 = findViewById(R.id.rl_2013_p2);
        rl_2012_p2 = findViewById(R.id.rl_2012_p2);
        rl_2011_p2 = findViewById(R.id.rl_2011_p2);
        rl_2010_p2 = findViewById(R.id.rl_2010_p2);
        rl_2009_p2 = findViewById(R.id.rl_2009_p2);
        rl_2008_p2 = findViewById(R.id.rl_2008_p2);
        rl_2007_p2 = findViewById(R.id.rl_2007_p2);
        rl_2006_p2 = findViewById(R.id.rl_2006_p2);
        rl_2005_p2 = findViewById(R.id.rl_2005_p2);

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