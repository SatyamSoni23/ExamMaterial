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
import com.secure.exammaterial.update_password;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.civil_main;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class iit_jee_category extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1, rl_2013_p1,
            rl_2011_p1, rl_2010_p1, rl_2009_p1, rl_2008_p1, rl_2007_p1, rl_2006_p1, rl_2005_p1, rl_2004_p1,
            rl_2003_p1, rl_2002_p1;
    MaterialCardView rl_2018_p2, rl_2017_p2, rl_2016_p2, rl_2015_p2, rl_2014_p2, rl_2013_p2;
    MaterialCardView rl_2019_p1_A, rl_2019_p1_B, rl_2019_p1_C, rl_2019_p1_D, rl_2019_p1_E, rl_2019_p1_F, rl_2019_p1_G,
            rl_2019_p1_H, rl_2019_p1_J, rl_2019_p1_K;
    MaterialCardView rl_2019_p2_A, rl_2019_p2_B, rl_2019_p2_C, rl_2019_p2_D, rl_2019_p2_E, rl_2019_p2_F, rl_2019_p2_G,
            rl_2019_p2_H, rl_2019_p2_J, rl_2019_p2_K;

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
        setContentView(R.layout.activity_iit_jee_category);
        init();

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(iit_jee_category.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(iit_jee_category.this);


        rl_2019_p1_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1HfVK7Pc579XsCzl9vMPNCVMHTU-oYtqh/view?usp=sharing");
            }
        });
        rl_2019_p1_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1N87KldXFHhpQ_Zvwq6J_aiCN0YcLRD2B/view?usp=sharing");
            }
        });
        rl_2019_p1_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1i4vLDxt8TBKOIeHPfnOImNrdTpot_aMZ/view?usp=sharing");
            }
        });
        rl_2019_p1_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Q7ZTHj-8zVupUoRtRS3zB8rwemNRbY5x/view?usp=sharing");
            }
        });
        rl_2019_p1_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1eYimwuq7ED7bbGx2jpWS2UlulN9h2uUa/view?usp=sharing");
            }
        });
        rl_2019_p1_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1sZMNDoc4x19N0z3A0XUsPb98bAronVf8/view?usp=sharing");
            }
        });
        rl_2019_p1_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1i2i3rjQyEdBk90WKd1VefOYtgukws8iF/view?usp=sharing");
            }
        });
        rl_2019_p1_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/17H0na-j1tHuUvKRWr0C0TjdCJHMqTuTw/view?usp=sharing");
            }
        });
        rl_2019_p1_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1SStQRjUGN6FwCPOGgu1mnC4l8-T3-Mam/view?usp=sharing");
            }
        });
        rl_2019_p1_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1nAO5HJ_YXwg83n7vygmrRSWkLs7x12z8/view?usp=sharing");
            }
        });


        rl_2019_p2_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1oP28Mf4G_3TaB7esQsmWtRKfG43PJs2F/view?usp=sharing");
            }
        });
        rl_2019_p2_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/19N0Fj-9sDqvoLcJWrS86g9DCMrouWriN/view?usp=sharing");
            }
        });
        rl_2019_p2_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1dwArV2xZMcZl4t0W-lkFRNiwxe_rzcgq/view?usp=sharing");
            }
        });
        rl_2019_p2_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1z2UhgxcGhrBhyGcYPj74WfR26NCFirwn/view?usp=sharing");
            }
        });
        rl_2019_p2_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1btulgSSmpCXc_NKg2v5HIZXCbEklmLZt/view?usp=sharing");
            }
        });
        rl_2019_p2_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1c3IujKL5lgdSX37uvHeVlXgctftoMzRL/view?usp=sharing");
            }
        });
        rl_2019_p2_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1o3hyTAn0QJxXRHYlbZysjmVrWOgNz-P8/view?usp=sharing");
            }
        });
        rl_2019_p2_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1a0yKJaNblNTTePSU5razI2eSA0gY3s0d/view?usp=sharing");
            }
        });
        rl_2019_p2_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/12yWOvJxaEdRLeUfwxoTMUUViwteURnKj/view?usp=sharing");
            }
        });
        rl_2019_p2_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1LPsywttt7UTJ-65wmkcyB2icPnrZ7hSF/view?usp=sharing");
            }
        });

        rl_2018_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1FLL4_foS5oNc3wQ3x_LBjrZar4gujLSl/view?usp=sharing");
            }
        });
        rl_2018_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1NB7ivdJYJXGSF9nIfF2ZaN-dQDOlNKl7/view?usp=sharing");
            }
        });
        rl_2017_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1_1hI-e6-MCUfWE7Kn62F0mp5Zz9QBMDa/view?usp=sharing");
            }
        });
        rl_2017_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1J8431xAMJlth67W4KJsvheyU82MAmBWS/view?usp=sharing");
            }
        });
        rl_2016_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1fubQ_PvI_B_rq8QIVkZdY5CE-6C3UdG7/view?usp=sharing");
            }
        });
        rl_2016_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/11TG6pIzPiVlttg43TBucmL8UpSfCbUKD/view?usp=sharing");
            }
        });
        rl_2015_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/10Y2hjy_eUmIYMCREghdVx3Jod_V-NeOh/view?usp=sharing");
            }
        });
        rl_2015_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1tbRyyxkKsGEZEop6IYxGBRkynxEDmH1c/view?usp=sharing");
            }
        });
        rl_2014_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1w1RvQfGPqCkQ-XI8jA5uvYOUfskPNliZ/view?usp=sharing");
            }
        });
        rl_2014_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1TUrusaxDr34v1jm7XQvDFVYm1-at8XdH/view?usp=sharing");
            }
        });
        rl_2013_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1MpBFPWbUK4QYMqd9Wc-ktKctnbLTO8Xq/view?usp=sharing");
            }
        });
        rl_2013_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1CUox8pTE0R4qfg2kKW-BpqiKr-iiPHLx/view?usp=sharing");
            }
        });

        rl_2011_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1VUysa-Um1S67umlEg8HIzdgEVYaKp_Oo/view?usp=sharing");
            }
        });
        rl_2010_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1RzK1gC0-mDEeAyW1UnLhknyGyMkgs0oh/view?usp=sharing");
            }
        });
        rl_2009_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1uapTKKwufE3WZZklVrSk-W7d3VTYPPZs/view?usp=sharing");
            }
        });
        rl_2008_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Xl_wFNZn6PIcNuVb2C1tRe7yfWYxfCh8/view?usp=sharing");
            }
        });
        rl_2007_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1IDjt00QbgooMOU4RhV_vXq5aqTd2AY-M/view?usp=sharing");
            }
        });
        rl_2006_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1tv7e5GNHBYzxsJPOy0gQFOY_Zmh9vYBv/view?usp=sharing");
            }
        });
        rl_2005_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1R6mMKyXNBhg2QdxOMEhcd7-_cjslof0T/view?usp=sharing");
            }
        });
        rl_2004_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ZLkIP4OgN2Qyo5dvAwykF2f4yGIytHO5/view?usp=sharing");
            }
        });
        rl_2003_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1CekOIMH-_X3-VNB8Azx7kc5olxngUpFo/view?usp=sharing");
            }
        });
        rl_2002_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1OX6Shqy-Is78ITqGwh92nga9roqs1iMw/view?usp=sharing");
            }
        });

    }

    private void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        rl_2019_p1_A = findViewById(R.id.rl_2019_p1_A);
        rl_2019_p1_B = findViewById(R.id.rl_2019_p1_B);
        rl_2019_p1_C = findViewById(R.id.rl_2019_p1_C);
        rl_2019_p1_D = findViewById(R.id.rl_2019_p1_D);
        rl_2019_p1_E = findViewById(R.id.rl_2019_p1_E);
        rl_2019_p1_F = findViewById(R.id.rl_2019_p1_F);
        rl_2019_p1_G = findViewById(R.id.rl_2019_p1_G);
        rl_2019_p1_H = findViewById(R.id.rl_2019_p1_H);
        rl_2019_p1_J = findViewById(R.id.rl_2019_p1_J);
        rl_2019_p1_K = findViewById(R.id.rl_2019_p1_K);

        rl_2019_p2_A = findViewById(R.id.rl_2019_p2_A);
        rl_2019_p2_B = findViewById(R.id.rl_2019_p2_B);
        rl_2019_p2_C = findViewById(R.id.rl_2019_p2_C);
        rl_2019_p2_D = findViewById(R.id.rl_2019_p2_D);
        rl_2019_p2_E = findViewById(R.id.rl_2019_p2_E);
        rl_2019_p2_F = findViewById(R.id.rl_2019_p2_F);
        rl_2019_p2_G = findViewById(R.id.rl_2019_p2_G);
        rl_2019_p2_H = findViewById(R.id.rl_2019_p2_H);
        rl_2019_p2_J = findViewById(R.id.rl_2019_p2_J);
        rl_2019_p2_K = findViewById(R.id.rl_2019_p2_K);

        rl_2018_p1 = findViewById(R.id.rl_2018_p1);
        rl_2017_p1 = findViewById(R.id.rl_2017_p1);
        rl_2016_p1 = findViewById(R.id.rl_2016_p1);
        rl_2015_p1 = findViewById(R.id.rl_2015_p1);
        rl_2014_p1 = findViewById(R.id.rl_2014_p1);
        rl_2013_p1 = findViewById(R.id.rl_2013_p1);
        rl_2011_p1 = findViewById(R.id.rl_2011_p1);
        rl_2010_p1 = findViewById(R.id.rl_2010_p1);
        rl_2009_p1 = findViewById(R.id.rl_2009_p1);
        rl_2008_p1 = findViewById(R.id.rl_2008_p1);
        rl_2007_p1 = findViewById(R.id.rl_2007_p1);
        rl_2006_p1 = findViewById(R.id.rl_2006_p1);
        rl_2005_p1 = findViewById(R.id.rl_2005_p1);
        rl_2004_p1 = findViewById(R.id.rl_2004_p1);
        rl_2003_p1 = findViewById(R.id.rl_2003_p1);
        rl_2002_p1 = findViewById(R.id.rl_2002_p1);

        rl_2018_p2 = findViewById(R.id.rl_2018_p2);
        rl_2017_p2 = findViewById(R.id.rl_2017_p2);
        rl_2016_p2 = findViewById(R.id.rl_2016_p2);
        rl_2015_p2 = findViewById(R.id.rl_2015_p2);
        rl_2014_p2 = findViewById(R.id.rl_2014_p2);
        rl_2013_p2 = findViewById(R.id.rl_2013_p2);
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