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

public class cms extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_2020_p1, rl_2019_p1, rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1;
    MaterialCardView rl_2020_p2, rl_2019_p2, rl_2018_p2, rl_2017_p2, rl_2016_p2, rl_2015_p2, rl_2014_p2;

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
        setContentView(R.layout.activity_cms);

        init();

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(cms.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(cms.this);

        //---------------------------------------------------------------------------------------------------------------
        rl_2020_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ELXU-mlGJxw5L9TcVtyN3aIZ3JFNazl9/view?usp=sharing");
            }
        });
        rl_2020_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1VMnDsbSwTT2ynGe3OPIoyNMfqdSXurQb/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2019_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1N-RTABy4-HHn24Ad5DK9XADjxYOUkcxw/view?usp=sharing");
            }
        });
        rl_2019_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/19gydoPCGAK3jl_S4LfGfjY8Cw-x5vr-Q/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2018_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1icF86G_fAFPWhCUDJxtuYpIzXjWr292E/view?usp=sharing");
            }
        });
        rl_2018_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1RX_o3A_2Dh4Bawy0eBXMZ_fRCPiBO6tK/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2017_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1aYeJxhYcsoRfRVlN9BaNzFGIrMTLXY9W/view?usp=sharing");
            }
        });
        rl_2017_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1461qkFOMm7juLRFbJH5fQLGiWoCtIvQa/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2016_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1bwp92rc1rNT0MpGiePMcADEDkz0dE4yL/view?usp=sharing");
            }
        });
        rl_2016_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ytM1qIlUG5SR23Dlc2vHwq-GQ2K9EjjX/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2015_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ytM1qIlUG5SR23Dlc2vHwq-GQ2K9EjjX/view?usp=sharing");
            }
        });
        rl_2015_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1J4pbBX2KvORjZ-dkqDQVjnIX_Brx9MLc/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2014_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1NZ5AG21WIOrdZarOxb86DTQxL--OOiuY/view?usp=sharing");
            }
        });
        rl_2014_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1s0aKnf0Qwpuu8JqInjGCt5GM-NmwdKR7/view?usp=sharing");
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

        rl_2020_p2 = findViewById(R.id.rl_2020_p2);
        rl_2019_p2 = findViewById(R.id.rl_2019_p2);
        rl_2018_p2 = findViewById(R.id.rl_2018_p2);
        rl_2017_p2 = findViewById(R.id.rl_2017_p2);
        rl_2016_p2 = findViewById(R.id.rl_2016_p2);
        rl_2015_p2 = findViewById(R.id.rl_2015_p2);
        rl_2014_p2 = findViewById(R.id.rl_2014_p2);

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