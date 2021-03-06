package com.secure.exammaterial.category;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.secure.exammaterial.R;
import com.secure.exammaterial.home;
import com.secure.exammaterial.login;
import com.secure.exammaterial.update_password;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.cisf;
import com.secure.exammaterial.upsc.civil_main;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class upsc_category extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialCardView rl_civil_pre, rl_civil_main, rl_nda, rl_cisf, rl_cds, rl_cgs, rl_es, rl_ifs;

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
        setContentView(R.layout.activity_upsc_category);

        init();

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(upsc_category.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(upsc_category.this);

        rl_civil_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upsc_category.this, civil_pre.class);
                startActivity(intent);
            }
        });
        rl_civil_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upsc_category.this, civil_main.class);
                startActivity(intent);
            }
        });
        rl_nda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upsc_category.this, nda_nae.class);
                startActivity(intent);
            }
        });
        rl_cisf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upsc_category.this, cisf.class);
                startActivity(intent);
            }
        });
        rl_cds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upsc_category.this, cds.class);
                startActivity(intent);
            }
        });
        rl_cgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upsc_category.this, cgs_category.class);
                startActivity(intent);
            }
        });
        rl_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(upsc_category.this, ies_category.class);
                startActivity(intent);
            }
        });
        rl_ifs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(upsc_category.this);
                alertDialogBuilder.setMessage("Sorry, These Category will be soon added.");

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }

    private void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        rl_civil_pre = findViewById(R.id.rl_civil_pre);
        rl_civil_main = findViewById(R.id.rl_civil_main);
        rl_nda = findViewById(R.id.rl_nda);
        rl_cisf = findViewById(R.id.rl_cisf);
        rl_cds = findViewById(R.id.rl_cds);
        rl_cgs = findViewById(R.id.rl_CGS);
        rl_es = findViewById(R.id.rl_es);
        rl_ifs = findViewById(R.id.rl_ifs);

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