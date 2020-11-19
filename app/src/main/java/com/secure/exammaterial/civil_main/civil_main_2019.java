package com.secure.exammaterial.civil_main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.FirebaseAuth;
import com.secure.exammaterial.R;
import com.secure.exammaterial.category.IitJeeAdvancedCategoryActivity;
import com.secure.exammaterial.category.gate_category;
import com.secure.exammaterial.category.iit_jee_category;
import com.secure.exammaterial.category.neet_category;
import com.secure.exammaterial.cgs.cgs_2014;
import com.secure.exammaterial.doc_viewer;
import com.secure.exammaterial.home;
import com.secure.exammaterial.login;
import com.secure.exammaterial.pdf_viewer;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.civil_main;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class civil_main_2019 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    MaterialTextView gen;
    MaterialTextView l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20,
                     l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34;
    MaterialTextView o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20,
                     o21, o22, o23, o24, o25, o26, o27, o28, o29, o30, o31, o32, o33, o34, o35, o36, o37, o38, o39,
                     o40, o41, o42, o43, o44, o45, o46, o47, o48, o49, o50;
    MaterialTextView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18;
    MaterialTextView g1, g2, g3, g4;

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
        setContentView(R.layout.activity_civil_main_2019);

        init();

        mAuth = FirebaseAuth.getInstance();

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(civil_main_2019.this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(civil_main_2019.this);


    }

    private void init() {
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation_view);

        gen = findViewById(R.id.gen);

        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        l4 = findViewById(R.id.l4);
        l5 = findViewById(R.id.l5);
        l6 = findViewById(R.id.l6);
        l7 = findViewById(R.id.l7);
        l8 = findViewById(R.id.l8);
        l9 = findViewById(R.id.l9);
        l10 = findViewById(R.id.l10);
        l11 = findViewById(R.id.l11);
        l12 = findViewById(R.id.l12);
        l13 = findViewById(R.id.l13);
        l14 = findViewById(R.id.l14);
        l15 = findViewById(R.id.l15);
        l16 = findViewById(R.id.l16);
        l17 = findViewById(R.id.l17);
        l18 = findViewById(R.id.l18);
        l19 = findViewById(R.id.l19);
        l20 = findViewById(R.id.l20);
        l21 = findViewById(R.id.l21);
        l22 = findViewById(R.id.l22);
        l23 = findViewById(R.id.l23);
        l24 = findViewById(R.id.l24);
        l25 = findViewById(R.id.l25);
        l26 = findViewById(R.id.l26);
        l27 = findViewById(R.id.l27);
        l28 = findViewById(R.id.l28);
        l29 = findViewById(R.id.l29);
        l30 = findViewById(R.id.l30);
        l31 = findViewById(R.id.l31);
        l32 = findViewById(R.id.l32);
        l33 = findViewById(R.id.l33);
        l34 = findViewById(R.id.l34);

        o1 = findViewById(R.id.o1);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        o4 = findViewById(R.id.o4);
        o5 = findViewById(R.id.o5);
        o6 = findViewById(R.id.o6);
        o7 = findViewById(R.id.o7);
        o8 = findViewById(R.id.o8);
        o9 = findViewById(R.id.o9);
        o10 = findViewById(R.id.o10);
        o11 = findViewById(R.id.o11);
        o12 = findViewById(R.id.o12);
        o13 = findViewById(R.id.o13);
        o14 = findViewById(R.id.o14);
        o15 = findViewById(R.id.o15);
        o16 = findViewById(R.id.o16);
        o17 = findViewById(R.id.o17);
        o18 = findViewById(R.id.o18);
        o19 = findViewById(R.id.o19);
        o20 = findViewById(R.id.o20);
        o21 = findViewById(R.id.o21);
        o22 = findViewById(R.id.o22);
        o23 = findViewById(R.id.o23);
        o24 = findViewById(R.id.o24);
        o25 = findViewById(R.id.o25);
        o26 = findViewById(R.id.o26);
        o27 = findViewById(R.id.o27);
        o28 = findViewById(R.id.o28);
        o29 = findViewById(R.id.o29);
        o30 = findViewById(R.id.o30);
        o31 = findViewById(R.id.o31);
        o32 = findViewById(R.id.o32);
        o33 = findViewById(R.id.o33);
        o34 = findViewById(R.id.o34);
        o35 = findViewById(R.id.o35);
        o36 = findViewById(R.id.o36);
        o37 = findViewById(R.id.o37);
        o38 = findViewById(R.id.o38);
        o39 = findViewById(R.id.o39);
        o40 = findViewById(R.id.o40);
        o41 = findViewById(R.id.o41);
        o42 = findViewById(R.id.o42);
        o43 = findViewById(R.id.o43);
        o44 = findViewById(R.id.o44);
        o45 = findViewById(R.id.o45);
        o46 = findViewById(R.id.o46);
        o47 = findViewById(R.id.o47);
        o48 = findViewById(R.id.o48);
        o49 = findViewById(R.id.o49);
        o50 = findViewById(R.id.o50);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c9 = findViewById(R.id.c9);
        c10 = findViewById(R.id.c10);
        c11 = findViewById(R.id.c11);
        c12 = findViewById(R.id.c12);
        c13 = findViewById(R.id.c13);
        c14 = findViewById(R.id.c14);
        c15 = findViewById(R.id.c15);
        c16 = findViewById(R.id.c16);
        c17 = findViewById(R.id.c17);
        c18 = findViewById(R.id.c18);

        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);

        gen.setOnClickListener(this);

        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
        l5.setOnClickListener(this);
        l6.setOnClickListener(this);
        l7.setOnClickListener(this);
        l8.setOnClickListener(this);
        l9.setOnClickListener(this);
        l10.setOnClickListener(this);
        l11.setOnClickListener(this);
        l12.setOnClickListener(this);
        l13.setOnClickListener(this);
        l14.setOnClickListener(this);
        l15.setOnClickListener(this);
        l16.setOnClickListener(this);
        l17.setOnClickListener(this);
        l18.setOnClickListener(this);
        l19.setOnClickListener(this);
        l20.setOnClickListener(this);
        l21.setOnClickListener(this);
        l22.setOnClickListener(this);
        l23.setOnClickListener(this);
        l24.setOnClickListener(this);
        l25.setOnClickListener(this);
        l26.setOnClickListener(this);
        l27.setOnClickListener(this);
        l28.setOnClickListener(this);
        l29.setOnClickListener(this);
        l30.setOnClickListener(this);
        l31.setOnClickListener(this);
        l32.setOnClickListener(this);
        l33.setOnClickListener(this);
        l34.setOnClickListener(this);

        o1.setOnClickListener(this);
        o2.setOnClickListener(this);
        o3.setOnClickListener(this);
        o4.setOnClickListener(this);
        o5.setOnClickListener(this);
        o6.setOnClickListener(this);
        o7.setOnClickListener(this);
        o8.setOnClickListener(this);
        o9.setOnClickListener(this);
        o10.setOnClickListener(this);
        o11.setOnClickListener(this);
        o12.setOnClickListener(this);
        o13.setOnClickListener(this);
        o14.setOnClickListener(this);
        o15.setOnClickListener(this);
        o16.setOnClickListener(this);
        o17.setOnClickListener(this);
        o18.setOnClickListener(this);
        o19.setOnClickListener(this);
        o20.setOnClickListener(this);
        o21.setOnClickListener(this);
        o22.setOnClickListener(this);
        o23.setOnClickListener(this);
        o24.setOnClickListener(this);
        o25.setOnClickListener(this);
        o26.setOnClickListener(this);
        o27.setOnClickListener(this);
        o28.setOnClickListener(this);
        o29.setOnClickListener(this);
        o30.setOnClickListener(this);
        o31.setOnClickListener(this);
        o32.setOnClickListener(this);
        o33.setOnClickListener(this);
        o34.setOnClickListener(this);
        o35.setOnClickListener(this);
        o36.setOnClickListener(this);
        o37.setOnClickListener(this);
        o38.setOnClickListener(this);
        o39.setOnClickListener(this);
        o40.setOnClickListener(this);
        o41.setOnClickListener(this);
        o42.setOnClickListener(this);
        o43.setOnClickListener(this);
        o44.setOnClickListener(this);
        o45.setOnClickListener(this);
        o46.setOnClickListener(this);
        o47.setOnClickListener(this);
        o48.setOnClickListener(this);
        o49.setOnClickListener(this);
        o50.setOnClickListener(this);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);
        c11.setOnClickListener(this);
        c12.setOnClickListener(this);
        c13.setOnClickListener(this);
        c14.setOnClickListener(this);
        c15.setOnClickListener(this);
        c16.setOnClickListener(this);
        c17.setOnClickListener(this);
        c18.setOnClickListener(this);

        g1.setOnClickListener(this);
        g2.setOnClickListener(this);
        g3.setOnClickListener(this);
        g4.setOnClickListener(this);
    }

    void startViewing(String url_res){
        Intent intent = new Intent(this, doc_viewer.class);
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
            case R.id.gen:
                startViewing("https://www.upsc.gov.in/sites/default/files/QP-CSM19-Essay.pdf");
                break;
                
            case R.id.l1:
                startViewing("https://www.upsc.gov.in/sites/default/files/QP-CSM19-AssameseLiterature-I.pdf");
                break;
            case R.id.l2:
                startViewing("https://www.upsc.gov.in/sites/default/files/QP-CSM19-AssameseLiterature-II.pdf");
                break;
            case R.id.l3:
                startViewing("https://www.upsc.gov.in/sites/default/files/QP-CSM19-BengaliLiterature-I.pdf");
                break;
            case R.id.l4:
                startViewing("https://www.upsc.gov.in/sites/default/files/QP-CSM19-BengaliLiterature-II.pdf");
                break;
            case R.id.l5:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-EnglishLiterature-I.pdf");
                break;
            case R.id.l6:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-EnglishLiterature-II.pdf");
                break;
            case R.id.l7:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-GujaratiLiterature-I.pdf");
                break;
            case R.id.l8:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-GujaratiLiterature-II.pdf");
                break;
            case R.id.l9:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-HindiLiterature-I.pdf");
                break;
            case R.id.l10:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-HindiLiterature-II.pdf");
                break;
            case R.id.l11:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-KannadaLiterature-I.pdf");
                break;
            case R.id.l12:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-KannadaLiterature-II.pdf");
                break;
            case R.id.l13:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MaithiliLiterature-I.pdf");
                break;
            case R.id.l14:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MaithiliLiterature-II.pdf");
                break;
            case R.id.l15:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MalayalamLiterature-I.pdf");
                break;
            case R.id.l16:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MalayalamLiterature-II.pdf");
                break;
            case R.id.l17:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-ManipuriLiterature-I.pdf");
                break;
            case R.id.l18:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-ManipuriLiterature-II.pdf");
                break;
            case R.id.l19:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MarathiLiterature-I.pdf");
                break;
            case R.id.l20:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MarathiLiterature-II.pdf");
                break;
            case R.id.l21:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-OriyaLiterature-I.pdf");
                break;
            case R.id.l22:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-OriyaLiterature-II.pdf");
                break;
            case R.id.l23:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-PunjabiLiterature-I.pdf");
                break;
            case R.id.l24:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-PunjabiLiterature-II.pdf");
                break;
            case R.id.l25:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-SanskritLiterature-I.pdf");
                break;
            case R.id.l26:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-SanskritLiterature-II.pdf");
                break;
            case R.id.l27:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-SindhiLiterature-I.pdf");
                break;
            case R.id.l28:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-SindhiLiterature-II.pdf");
                break;
            case R.id.l29:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-TamilLiterature-I.pdf");
                break;
            case R.id.l30:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-TamilLiterature-II.pdf");
                break;
            case R.id.l31:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-TeluguLiterature-I.pdf");
                break;
            case R.id.l32:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-TeluguLiterature-II.pdf");
                break;
            case R.id.l33:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-rduLiterature-I.pdf");
                break;
            case R.id.l34:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-UrduLiterature-II.pdf");
                break;

            case R.id.o1:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Agriculture-I.pdf");
                break;
            case R.id.o2:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Agriculture-II.pdf");
                break;
            case R.id.o3:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-AnimalHusbVetSc-I.pdf");
                break;
            case R.id.o4:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-AnimalHusbVetSc-II.pdf");
                break;
            case R.id.o5:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Anthropology-I.pdf");
                break;
            case R.id.o6:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Anthropology-II.pdf");
                break;
            case R.id.o7:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Botany-I.pdf");
                break;
            case R.id.o8:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Botany-II.pdf");
                break;
            case R.id.o9:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Chemistry-I.pdf");
                break;
            case R.id.o10:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Chemistry-II.pdf");
                break;
            case R.id.o11:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-CivilEngg-I.pdf");
                break;
            case R.id.o12:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-CivilEngg-II.pdf");
                break;
            case R.id.o13:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-CommercaAccnt-I.pdf");
                break;
            case R.id.o14:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-CommercaAccnt-II.pdf");
                break;
            case R.id.o15:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Economics-I.pdf");
                break;
            case R.id.o16:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Economics-II.pdf");
                break;
            case R.id.o17:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-ElectricalEngg-I.pdf");
                break;
            case R.id.o18:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-ElectricalEngg-II.pdf");
                break;
            case R.id.o19:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Geography-I.pdf");
                break;
            case R.id.o20:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Geography-II.pdf");
                break;
            case R.id.o21:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Geology-I.pdf");
                break;
            case R.id.o22:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Geology-II.pdf");
                break;
            case R.id.o23:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-History-I.pdf");
                break;
            case R.id.o24:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-History-II.pdf");
                break;
            case R.id.o25:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Law-I.pdf");
                break;
            case R.id.o26:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Law-II.pdf");
                break;
            case R.id.o27:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Management-I.pdf");
                break;
            case R.id.o28:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Management-II.pdf");
                break;
            case R.id.o29:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Mathematics-I.pdf");
                break;
            case R.id.o30:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Mathematics-II.pdf");
                break;
            case R.id.o31:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MechEngg-I.pdf");
                break;
            case R.id.o32:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MechEngg-II.pdf");
                break;
            case R.id.o33:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MedicalSc-I.pdf");
                break;
            case R.id.o34:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MedicalSc-II.pdf");
                break;
            case R.id.o35:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Philosophy-I.pdf");
                break;
            case R.id.o36:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Philosophy-II.pdf");
                break;
            case R.id.o37:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Physics-I.pdf");
                break;
            case R.id.o38:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Physics-II.pdf");
                break;
            case R.id.o39:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-PolScIR-I.pdf");
                break;
            case R.id.o40:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-PolScIR-II.pdf");
                break;
            case R.id.o41:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Psychology-I.pdf");
                break;
            case R.id.o42:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Psychology-II.pdf");
                break;
            case R.id.o43:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-PublAdmn-I.pdf");
                break;
            case R.id.o44:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-PublAdmn-II.pdf");
                break;
            case R.id.o45:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Sociology-I.pdf");
                break;
            case R.id.o46:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Sociology-II.pdf");
                break;
            case R.id.o47:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Statistics-I.pdf");
                break;
            case R.id.o48:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Statistics-II.pdf");
                break;
            case R.id.o49:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Zoology-I.pdf");
                break;
            case R.id.o50:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-Zoology-II.pdf");
                break;

            case R.id.c1:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-EnglishCompulsory.pdf");
                break;
            case R.id.c2:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-AssameseCompulory.pdf");
                break;
            case R.id.c3:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-BengaliCompulory.pdf");
                break;
            case R.id.c4:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-DogriCompulory.pdf");
                break;
            case R.id.c5:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-GujaratiCompulory.pdf");
                break;
            case R.id.c6:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-HindiCompulory.pdf");
                break;
            case R.id.c7:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-KannadaCompulory.pdf");
                break;
            case R.id.c8:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MaithiliCompulory.pdf");
                break;
            case R.id.c9:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MalayalamCompulory.pdf");
                break;
            case R.id.c10:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-MarathiCompulory.pdf");
                break;
            case R.id.c11:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-NepaliCompulory.pdf");
                break;
            case R.id.c12:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-OriyaCompulory.pdf");
                break;
            case R.id.c13:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-PunjabiCompulory.pdf");
                break;
            case R.id.c14:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-SanskritCompulory.pdf");
                break;
            case R.id.c15:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-SindhiCompuloryDev.pdf");
                break;
            case R.id.c16:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-TamilCompulory.pdf");
                break;
            case R.id.c17:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-TeluguCompulory.pdf");
                break;
            case R.id.c18:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-UrduCompulory.pdf");
                break;

            case R.id.g1:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-GeneralStudies-I.pdf");
                break;
            case R.id.g2:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-GeneralStudies-II.pdf");
                break;
            case R.id.g3:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-GeneralStudies-III.pdf");
                break;
            case R.id.g4:
                startViewing("HTTPS://www.upsc.gov.in/sites/default/files/QP-CSM19-GeneralStudies-IV.pdf");
                break;

            default:
                break;
        }
    }
}