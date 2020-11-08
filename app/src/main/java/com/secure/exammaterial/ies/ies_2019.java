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

public class ies_2019 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_eng_1, rl_gen_eco_1, rl_gen_eco_2, rl_gen_eco_3, rl_gen_stud_1, rl_ind_eco_1, rl_stat_1,
            rl_stat_2, rl_stat_3, rl_stat_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ies_2019);

        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(ies_2019.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(ies_2019.this);

        rl_eng_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1YpaYiF2pGiFwTTpd5mzEgvqhfQagcQX_/view?usp=sharing");
            }
        });
        rl_gen_eco_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/16cUek85DqrxKU_3GzdLTVbWxPmkk_P1q/view?usp=sharing");
            }
        });
        rl_gen_eco_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1yLXQERvD9XxFHVzoAoSgMIUp3iznJ4jL/view?usp=sharing");
            }
        });
        rl_gen_eco_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1dqlyaUJ0kvs-ge5e7h64hGteptelBLMd/view?usp=sharing");
            }
        });
        rl_gen_stud_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/10kVKwir6YYnJVjABNfEnIo-iC4H4P3bx/view?usp=sharing");
            }
        });
        rl_ind_eco_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/13YK-qHlv4IYwSH_3T9X1wPkguz22GmZg/view?usp=sharing");
            }
        });
        rl_stat_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1SQnOMXgZduV0GkSUqWHAOK3lPZ-yXhN9/view?usp=sharing");
            }
        });
        rl_stat_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1l5xuko4AgFJ2PTQNKBM6NT0aBbv_6_dJ/view?usp=sharing");
            }
        });
        rl_stat_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1l8gJqAL-_eIfAlwU29jdHnPoa_pkOaQs/view?usp=sharing");
            }
        });
        rl_stat_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1LZDPBQMgppl40lojhEN9ljcFIsqR9KTz/view?usp=sharing");
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