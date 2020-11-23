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

public class nda_nae extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_2020_p1, rl_2019_p1, rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1;
    MaterialCardView rl_2019_p12, rl_2018_p12, rl_2017_p12, rl_2016_p12, rl_2015_p12, rl_2014_p12;
    MaterialCardView rl_2020_p2, rl_2019_p2, rl_2018_p2, rl_2017_p2, rl_2016_p2, rl_2015_p2, rl_2014_p2;
    MaterialCardView rl_2019_p22, rl_2018_p22, rl_2017_p22, rl_2016_p22, rl_2015_p22, rl_2014_p22;

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
        setContentView(R.layout.activity_nda_nae);

        init();

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(nda_nae.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(nda_nae.this);

        //---------------------------------------------------------------------------------------------------------------
        rl_2020_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1s9ZRiDrWPwkMmb5EqvWCYKnTVJKt7gA9/view?usp=sharing");
            }
        });
        rl_2020_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ENwenTmMpKhXlYFmCCjfqIOLOWc1dHhz/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2019_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1iAcUP935TsWc2lW-mxB4MVObsKAxAjNh/view?usp=sharing");
            }
        });
        rl_2019_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/15K5358s1S7vMfxj7u81iWrMIDJ1YwISw/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2018_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1_X1OJ2Z8cYQySaWLRU6eziq232mFmQpn/view?usp=sharing");
            }
        });
        rl_2018_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1a0lGnjCgrZQBMI4mjiff7xUgTmI_wluI/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2017_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1iXvYmgTuueCxJ_sZ3ja8gbMyMgSUb2pI/view?usp=sharing");
            }
        });
        rl_2017_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1tpi9-HAPoaxm6cu0d0xq6cbkTJkWVK7y/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2016_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1L7VT6reA6vpiliPxrFhxGP7yYnIeSEwJ/view?usp=sharing");
            }
        });
        rl_2016_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/10apwE-Doi0JyD8BxyXNe0nsvo6aA1gnI/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2015_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1aOP7YIcoWE9G9sL6Jxkjal3jK4p4A2f-/view?usp=sharing");
            }
        });
        rl_2015_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1SbMoJmfaZR0FXavre5E8mcvFewS_HDIb/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2014_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1KQr_v3AWL_EP6fvJhZZVclMxXrXI3HnX/view?usp=sharing");
            }
        });
        rl_2014_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/12_cffDtOH0vkZxRC4P9y6orNi37BRkz2/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2019_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1mV5FqcwmHOh2q4186gnZS8GDVd8W4ug1/view?usp=sharing");
            }
        });
        rl_2019_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1jmL01G6q_IpIPzKWO6cdTKOfIKpDSFHR/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2018_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1KQwp23PUFrVdB784VPEnGn07qcBNblNp/view?usp=sharing");
            }
        });
        rl_2018_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Q-iNeqGP7f9OjspxKssLptKyNEwerFJT/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2017_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1g_wbAXhgzyrjum8mzIaFKt3vQQrrybMR/view?usp=sharing");
            }
        });
        rl_2017_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/103EDuDw9yjeo9nL_JmbVRu2ojwZdG-c9/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2016_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1zWh2-sJo8V02_k-vfpLqeplRkGhyOnTd/view?usp=sharing");
            }
        });
        rl_2016_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1v5-O9ZMhWVIr1Fr7uHuisdzkStfHL8P4/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2015_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1sMZaqcdfZK_5DoScgC4QeOv3l3OAbDZg/view?usp=sharing");
            }
        });
        rl_2015_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1RLcEtPb1SWTcYm1dbiGJgKGeQHJguQI-/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2014_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1U0gNhO3DrV-aNnLDNYbj4G1AqyTRmFNf/view?usp=sharing");
            }
        });
        rl_2014_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1l9AMkWmC76CtDdkF3XfTl_WcyEmRcG8s/view?usp=sharing");
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

        rl_2019_p12 = findViewById(R.id.rl_2019_p12);
        rl_2018_p12 = findViewById(R.id.rl_2018_p12);
        rl_2017_p12 = findViewById(R.id.rl_2017_p12);
        rl_2016_p12 = findViewById(R.id.rl_2016_p12);
        rl_2015_p12 = findViewById(R.id.rl_2015_p12);
        rl_2014_p12 = findViewById(R.id.rl_2014_p12);

        rl_2019_p22 = findViewById(R.id.rl_2019_p22);
        rl_2018_p22 = findViewById(R.id.rl_2018_p22);
        rl_2017_p22 = findViewById(R.id.rl_2017_p22);
        rl_2016_p22 = findViewById(R.id.rl_2016_p22);
        rl_2015_p22 = findViewById(R.id.rl_2015_p22);
        rl_2014_p22 = findViewById(R.id.rl_2014_p22);
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