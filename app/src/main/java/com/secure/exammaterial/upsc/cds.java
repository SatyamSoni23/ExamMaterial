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

public class cds extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_2020_p1, rl_2019_p1, rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1;
    MaterialCardView rl_2020_p2, rl_2019_p2, rl_2018_p2, rl_2017_p2, rl_2016_p2, rl_2015_p2, rl_2014_p2;
    MaterialCardView rl_2020_p3, rl_2019_p3, rl_2018_p3, rl_2017_p3, rl_2016_p3, rl_2015_p3, rl_2014_p3;
    MaterialCardView rl_2019_p12, rl_2018_p12, rl_2017_p12, rl_2016_p12, rl_2015_p12, rl_2014_p12;
    MaterialCardView rl_2019_p22, rl_2018_p22, rl_2017_p22, rl_2016_p22, rl_2015_p22, rl_2014_p22;
    MaterialCardView rl_2019_p32, rl_2018_p32, rl_2017_p32, rl_2016_p32, rl_2015_p32, rl_2014_p32;

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
        setContentView(R.layout.activity_cds);

        init();

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(cds.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(cds.this);

        rl_2020_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/19wad2AUr2IBHVcL3JQlf_0IVeIU89Z5J/view?usp=sharing");
            }
        });
        rl_2020_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1TX-fF8Mt0tLxk8g1hhac92NM_g-z-tGn/view?usp=sharing");
            }
        });
        rl_2020_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1z124l2OZ2eupn6s-pvuBL17-KNszweRy/view?usp=sharing");
            }
        });
        rl_2019_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1n0uAhZiSzmn3nkm_W4EsBpJwmDU7EbXT/view?usp=sharing");
            }
        });
        rl_2019_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ja2YmBcrmHEVGXtDICmE2nLdQpdEh6Yu/view?usp=sharing");
            }
        });
        rl_2019_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1So6EjWpvf1psw2CEwJIcAl_UZKgaiCB1/view?usp=sharing");
            }
        });
        rl_2018_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Vm_SR9oDNG92abrn7oKqHaajGOdRF1Kc/view?usp=sharing");
            }
        });
        rl_2018_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1OsQyFKdg9i7c2almmRxV6qeMNqFHP_L0/view?usp=sharing");
            }
        });
        rl_2018_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1GD3qqXeCUN5AIgy5I5Q6d9Vqj5Kf7MSA/view?usp=sharing");
            }
        });
        rl_2017_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/19xXe2fM98B5LpnOedBhNSIwjSuKrNEAh/view?usp=sharing");
            }
        });
        rl_2017_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1r5QitjW1mIbcFHqXzlY_ZeK389xRkSuN/view?usp=sharing");
            }
        });
        rl_2017_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1SPlgnS-DN68Mnda4sDyfgCG0epyurKuy/view?usp=sharing");
            }
        });
        rl_2016_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1_UXte9_JdAmigXnEiQm7F016M3MkZkSx/view?usp=sharing");
            }
        });
        rl_2016_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1cP51ukS1553H0PHkO_DUBghTsTq0QoaF/view?usp=sharing");
            }
        });
        rl_2016_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1DSTyRNf4HiTSEDnBP6tvzUmNP_yb5uNS/view?usp=sharing");
            }
        });
        rl_2015_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1_y82TAu9f1NKAscF7xQzpBX971zQjrBZ/view?usp=sharing");
            }
        });
        rl_2015_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Kjq4Mi4vgXrteuPBTVgnUzOb1QtF96nV/view?usp=sharing");
            }
        });
        rl_2015_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1S9JgfeUTXgb5ZdmoSPTSYWZ70Az1Snrw/view?usp=sharing");
            }
        });
        rl_2014_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1QDPJOnBJxWInVqyKXUoyi_M55wBweaoh/view?usp=sharing");
            }
        });
        rl_2014_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1TFblX1TkNCHXJ6XQcHWdxyRI_vdbIbXe/view?usp=sharing");
            }
        });
        rl_2014_p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1aO4n4nRSs0rmv2HiGLjCFeqhcBSduIWb/view?usp=sharing");
            }
        });

        rl_2019_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1UdivhGjagZ3rnCVQbD9Qiqfdnr3SDLS4/view?usp=sharing");
            }
        });
        rl_2019_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1c8pIAnvgvD6W_Ec-nMdmYcg8fdHp7cJD/view?usp=sharing");
            }
        });
        rl_2019_p32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Ln6MD823wzbgLTIBwyiSOGhLjgDFzxck/view?usp=sharing");
            }
        });
        rl_2018_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1uu4peHNNw_zAKfaSNHH9FN9smGbse4dp/view?usp=sharing");
            }
        });
        rl_2018_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1q9OUuTSTzJGOs5HjjZwxwlA0CywqfAlc/view?usp=sharing");
            }
        });
        rl_2018_p32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1zxaixvkPGTgf3jrKXDvv_9DmPT5QfkvW/view?usp=sharing");
            }
        });
        rl_2017_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1MJP7tjo-u-ewqvjwu38zvMUA_niVZ5tx/view?usp=sharing");
            }
        });
        rl_2017_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1CD1OmoAnbMQ0IblIe2HHjYRFVKqFgmrl/view?usp=sharing");
            }
        });
        rl_2017_p32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1nDbMQFrrSSTf5L7MuykBb2JYgNZ_UZXj/view?usp=sharing");
            }
        });
        rl_2016_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1NYXyweSD8VMaPhyX2OU7Ih5OE9oJlpTr/view?usp=sharing");
            }
        });
        rl_2016_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1dEd9blKGD89rZIx0uIWEAt_G5qxSIh8U/view?usp=sharing");
            }
        });
        rl_2016_p32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1FKDSAwY2xo_d9RCK1Pm7dgIfRce0tiyu/view?usp=sharing");
            }
        });
        rl_2015_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1QQQakrkhqpV5mi_UWJ_7qWyyP3nM19_j/view?usp=sharing");
            }
        });
        rl_2015_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/19X0w39i-wVEnCRVTCyDFyZkUCqy22K9R/view?usp=sharing");
            }
        });
        rl_2015_p32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1xffl2JJ8OjpM45XQvNGdXukZ5WSUs-zW/view?usp=sharing");
            }
        });
        rl_2014_p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1YbhUm3gDLOBkMxQ_ZPnWcsz5ILq8QrWv/view?usp=sharing");
            }
        });
        rl_2014_p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/13MvJpFCzNLWdwj-r1ffIihOVuEHuAMdg/view?usp=sharing");
            }
        });
        rl_2014_p32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/10q1Tjjc2mTbDCEm96jgros_BphcgWp4X/view?usp=sharing");
            }
        });
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

        rl_2020_p3 = findViewById(R.id.rl_2020_p3);
        rl_2019_p3 = findViewById(R.id.rl_2019_p3);
        rl_2018_p3 = findViewById(R.id.rl_2018_p3);
        rl_2017_p3 = findViewById(R.id.rl_2017_p3);
        rl_2016_p3 = findViewById(R.id.rl_2016_p3);
        rl_2015_p3 = findViewById(R.id.rl_2015_p3);
        rl_2014_p3 = findViewById(R.id.rl_2014_p3);

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

        rl_2019_p32 = findViewById(R.id.rl_2019_p32);
        rl_2018_p32 = findViewById(R.id.rl_2018_p32);
        rl_2017_p32 = findViewById(R.id.rl_2017_p32);
        rl_2016_p32 = findViewById(R.id.rl_2016_p32);
        rl_2015_p32 = findViewById(R.id.rl_2015_p32);
        rl_2014_p32 = findViewById(R.id.rl_2014_p32);
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