package com.secure.exammaterial.cgs;

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

public class cgs_2019 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_chem_1, rl_chem_2, rl_chem_3, rl_geo_phy_1, rl_geo_phy_2,
            rl_geo_phy_3, rl_geo_1, rl_geo_2, rl_geo_3, rl_hydro_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgs_2019);

        init();
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(cgs_2019.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(cgs_2019.this);

        rl_chem_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1gkhYvIYowX-xtyJPVV0OCi3HauAlL-iN/view?usp=sharing");
            }
        });
        rl_chem_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Om6iT6cmVSiOcH4spMdenVwAIG2a2qnO/view?usp=sharing");
            }
        });
        rl_chem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Hn_VISv2aINzvcSkmry88NjfTqsjes6r/view?usp=sharing");
            }
        });
        rl_geo_phy_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1lfy0cWFuT_5Mz8dcCDktw8iWl74FkR0n/view?usp=sharing");
            }
        });
        rl_geo_phy_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1MKdT8cHjcN6uqgQmBMXgAqccpR-SmgG6/view?usp=sharing");
            }
        });
        rl_geo_phy_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1ZdHn6BY8gJ6iyUFaL60cxpqWLmv3DBxT/view?usp=sharing");
            }
        });
        rl_geo_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1KaROf40frrCIac-yQSLoxcdw8bXRFSXb/view?usp=sharing");
            }
        });
        rl_geo_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/13qK11CL3VVIUXOv4nojYYrsJ9_UscVOX/view?usp=sharing");
            }
        });
        rl_geo_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/17ThjryJmjzbpM2VSKNIRLOkJ9jcJwmAP/view?usp=sharing");
            }
        });
        rl_hydro_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1CsdtWY5aYYyxctuUoz40hs7lWNL_huAn/view?usp=sharing");
            }
        });

    }

    private void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        rl_chem_1 = findViewById(R.id.rl_chem_1);
        rl_chem_2 = findViewById(R.id.rl_chem_2);
        rl_chem_3 = findViewById(R.id.rl_chem_3);
        rl_geo_phy_1 = findViewById(R.id.rl_geo_phy_1);
        rl_geo_phy_2 = findViewById(R.id.rl_geo_phy_2);
        rl_geo_phy_3 = findViewById(R.id.rl_geo_phy_3);
        rl_geo_1 = findViewById(R.id.rl_geo_1);
        rl_geo_2 = findViewById(R.id.rl_geo_2);
        rl_geo_3 = findViewById(R.id.rl_geo_3);
        rl_hydro_1 = findViewById(R.id.rl_hydro_1);
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