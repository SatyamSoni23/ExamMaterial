package com.secure.exammaterial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.secure.exammaterial.category.IitJeeAdvancedCategoryActivity;
import com.secure.exammaterial.category.gate_category;
import com.secure.exammaterial.category.iit_jee_category;
import com.secure.exammaterial.category.neet_category;
import com.secure.exammaterial.category.upsc_category;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.civil_main;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    public static String url = null;
    FirebaseAuth mAuth;

    MaterialCardView jee_main, jee_advanced, civil_pre, civil_main, upsc, cat, neet, gate, cds, cgs, nda, ies;

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
        setContentView(R.layout.activity_home);

        init();

        MainActivity.flag = true;

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(home.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(home.this);
    }
    void init(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        jee_main = findViewById(R.id.jee_main_category);
        jee_advanced = findViewById(R.id.jee_advanced_category);
        civil_pre = findViewById(R.id.civil_pre_category);
        civil_main = findViewById(R.id.civil_main_category);
        upsc = findViewById(R.id.upsc_category);
        cat = findViewById(R.id.cat_category);
        neet = findViewById(R.id.neet_category);
        gate = findViewById(R.id.gate_category);
        cds = findViewById(R.id.cds_category);
        cgs = findViewById(R.id.cgs_category);
        nda = findViewById(R.id.nda_category);
        ies = findViewById(R.id.ies_category);

        jee_main.setOnClickListener(this);
        jee_advanced.setOnClickListener(this);
        civil_pre.setOnClickListener(this);
        civil_main.setOnClickListener(this);
        upsc.setOnClickListener(this);
        cat.setOnClickListener(this);
        neet.setOnClickListener(this);
        gate.setOnClickListener(this);
        cds.setOnClickListener(this);
        cgs.setOnClickListener(this);
        nda.setOnClickListener(this);
        ies.setOnClickListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_home){
            start_nav_activity(home.class);
        }
        else if(id == R.id.civil_pre_nav){
            start_nav_activity(com.secure.exammaterial.upsc.civil_pre.class);
        }
        else if(id == R.id.civil_main_nav){
            start_nav_activity(com.secure.exammaterial.upsc.civil_main.class);
        }
        else if(id == R.id.nda_nav){
            start_nav_activity(nda_nae.class);
        }
        else if(id == R.id.cds_nav){
            start_nav_activity(com.secure.exammaterial.upsc.cds.class);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.jee_main_category:
                start_nav_activity(iit_jee_category.class);
                break;
            case R.id.jee_advanced_category:
                start_nav_activity(IitJeeAdvancedCategoryActivity.class);
                break;
            case R.id.civil_pre_category:
                start_nav_activity(civil_pre.class);
                break;
            case R.id.civil_main_category:
                start_nav_activity(civil_main.class);
                break;
            case R.id.upsc_category:
                start_nav_activity(upsc_category.class);
                break;
            case R.id.cat_category:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(home.this);
                alertDialogBuilder.setMessage("Sorry, These Category will be soon added.");
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                break;
            case R.id.neet_category:
                start_nav_activity(neet_category.class);
                break;
            case R.id.gate_category:
                start_nav_activity(gate_category.class);
                break;
            case R.id.cds_category:
                start_nav_activity(cds.class);
                break;
            case R.id.cgs_category:
                start_nav_activity(cgs_category.class);
                break;
            case R.id.nda_category:
                start_nav_activity(nda_nae.class);
                break;
            case R.id.ies_category:
                start_nav_activity(ies_category.class);
                break;
            default:
                break;
        }
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            home.this.finish();
            moveTaskToBack(true);
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}