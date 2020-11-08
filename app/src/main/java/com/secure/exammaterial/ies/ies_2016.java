package com.secure.exammaterial.ies;

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

public class ies_2016 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_eng_1, rl_gen_eco_1, rl_gen_eco_2, rl_gen_eco_3, rl_gen_stud_1, rl_ind_eco_1, rl_stat_1,
            rl_stat_2, rl_stat_3, rl_stat_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ies_2016);

        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(ies_2016.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(ies_2016.this);

        rl_eng_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1g_k5Nc1-lQpeTSGjMyH4k6uZXHBSooij/view?usp=sharing");
            }
        });
        rl_gen_eco_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1fa4JSUPPyIkevBhXSyg7JpbKYiGcX4Y8/view?usp=sharing");
            }
        });
        rl_gen_eco_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1xHdG79IEOo3iwUYrRTmFZ8XhkuZ4ohW-/view?usp=sharing");
            }
        });
        rl_gen_eco_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1r3ify1QlMTMbLY8w7rcQyUWAitCenCWv/view?usp=sharing");
            }
        });
        rl_gen_stud_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1pN5HS3ZGvXbE82MWVrH9FREKa31_dcnB/view?usp=sharing");
            }
        });
        rl_ind_eco_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1zNY2KMiHMt_OKBRMXJ0Tvafljd3Rbs_N/view?usp=sharing");
            }
        });
        rl_stat_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1DEeQMFTtCMaAzzW2HGvYLwl_8CLzo0q7/view?usp=sharing");
            }
        });
        rl_stat_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1iO2DWXyqaV-DEJ0Ks7xkGNtFJj08LdpL/view?usp=sharing");
            }
        });
        rl_stat_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1XYKyKofV41r2acF3Btsfcq0NclGWF4pl/view?usp=sharing");
            }
        });
        rl_stat_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1tXmGOxGvv7S5oiATHloz-TcfNJ7EFkg-/view?usp=sharing");
            }
        });
    }

    private void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        rl_eng_1 = findViewById(R.id.rl_eng_1);
        rl_gen_eco_1 = findViewById(R.id.rl_gen_eco_1);
        rl_gen_eco_2 = findViewById(R.id.rl_gen_eco_2);
        rl_gen_eco_3  =findViewById(R.id.rl_gen_eco_3);
        rl_gen_stud_1 = findViewById(R.id.rl_gen_stud_1);
        rl_ind_eco_1 = findViewById(R.id.rl_ind_eco_1);
        rl_stat_1 = findViewById(R.id.rl_stat_1);
        rl_stat_2 = findViewById(R.id.rl_stat_2);
        rl_stat_3 = findViewById(R.id.rl_stat_3);
        rl_stat_4 = findViewById(R.id.rl_stat_4);
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