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

    MaterialCardView rl_2020_p1, rl_2019_p1, rl_2018_p1, rl_2017_p1, rl_2016_p1, rl_2015_p1, rl_2014_p1, rl_2013_p1,
            rl_2012_p1, rl_2011_p1, rl_2010_p1, rl_2009_p1, rl_2008_p1, rl_2007_p1, rl_2006_p1, rl_2005_p1;
    MaterialCardView rl_2020_p2, rl_2019_p2, rl_2018_p2, rl_2017_p2, rl_2016_p2, rl_2015_p2, rl_2014_p2, rl_2013_p2,
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


        //---------------------------------------------------------------------------------------------------------------
        rl_2020_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1p9kcFzekoDYbP6mwJ_laQkFGKA2J8wRK/view?usp=sharing");
            }
        });
        rl_2020_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/12ALjKcsZVxz6c60cvKcLBWGiRwuGqk4_/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2019_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1sRIDY79XGsDvKtpGoofm60lOVKSUCfcT/view?usp=sharing");
            }
        });
        rl_2019_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1vvWdP5KLvDYO05cQ5F0wDC6jJq_NkLdS/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2018_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1uEwJAhTdJDRLfikgxSxf1xZzog5OsCST/view?usp=sharing");
            }
        });
        rl_2018_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1n3kI-Rqxp6G33pV8FRSonttvQZ2r1q8-/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2017_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1kbmtXdO8_AK9y0xqkg2N-prlcdSSMKVq/view?usp=sharing");
            }
        });
        rl_2017_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/11UpeUIXbrV_p7dBcRjctRa4STTVshuyK/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2016_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/17YAkGJwrEDR19GCzR3OyeNzpTNxwD1BG/view?usp=sharing");
            }
        });
        rl_2016_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1AfwQOPpCHwiKdrVcANq52HggOQXOgRBV/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2015_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1qrQ3TYSdQq0iloup_NEgEivnsP-898HP/view?usp=sharing");
            }
        });
        rl_2015_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1RJyDveQ59z6FLBqrIZSfk43XB1MJAUra/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2014_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1kGqFJdx8VCy20cMOxxX5Zplfm00LaJs8/view?usp=sharing");
            }
        });
        rl_2014_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1dJhk1KwQUxQaR58PbqyFwU2BT9pRmDW9/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2013_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1aT8GCTFy6wLsYJQcVrLFkkq2oFKBEO33/view?usp=sharing");
            }
        });
        rl_2013_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1DbS1DSsoFhsP4UDDDVpMRjH1Q2Tsbyie/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2012_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/11oeodSI2ONsG_WOZ3MH5uEZQVqS0g7D2/view?usp=sharing");
            }
        });
        rl_2012_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1dTPty12jdbWPrb8qWOzic4zqrj8TBVSn/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2011_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1pqsDu2TQo5gVnZK66EoZrCidRPtqThx9/view?usp=sharing");
            }
        });
        rl_2011_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1_IQNKH3BIDzIGzA2IFA1R9wN9-nDUw1V/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2010_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1BwhAQ436zptmI3bWX0arT4jOBpTz0T-Y/view?usp=sharing");
            }
        });
        rl_2010_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1rKMz_vMrlEBZq3RelZ_aajvJq6geQu4W/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2009_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1OxiOlW7aLiri7p9rXOHAhe_v_vJ6UauD/view?usp=sharing");
            }
        });
        rl_2009_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1cKH_YINQ9FptKl_bfCZ3QVrh583vcT1m/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2008_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1p5EAxwYbKoQPIF0Tdu-V5S1mnyAn6RVj/view?usp=sharing");
            }
        });
        rl_2008_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1Qtat9tYpkMWvrmKzgRtZxgR2tkBlVwgo/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2007_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1UiuC0EFFepCdsg2-kOOIn-ApuTJGGZSa/view?usp=sharing");
            }
        });
        rl_2007_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("https://drive.google.com/file/d/1UjbgiFbiQtV80hAGF1u5migQ9Q7gIv6f/view?usp=sharing");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2006_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("");
            }
        });
        rl_2006_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("");
            }
        });
        //---------------------------------------------------------------------------------------------------------------
        rl_2005_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("");
            }
        });
        rl_2005_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startViewing("");
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