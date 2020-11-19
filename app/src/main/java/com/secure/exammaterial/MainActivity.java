package com.secure.exammaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.secure.exammaterial.category.IitJeeAdvancedCategoryActivity;
import com.secure.exammaterial.category.gate_category;
import com.secure.exammaterial.category.iit_jee_category;
import com.secure.exammaterial.category.neet_category;
import com.secure.exammaterial.category.upsc_category;
import com.secure.exammaterial.civil_main.civil_main_2014;
import com.secure.exammaterial.civil_main.civil_main_2015;
import com.secure.exammaterial.civil_main.civil_main_2016;
import com.secure.exammaterial.civil_main.civil_main_2017;
import com.secure.exammaterial.civil_main.civil_main_2018;
import com.secure.exammaterial.civil_main.civil_main_2019;
import com.secure.exammaterial.gate.gate_web_view;
import com.secure.exammaterial.ies.ies_2020;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.cgs_category;
import com.secure.exammaterial.upsc.cisf;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.cms;
import com.secure.exammaterial.upsc.ies_category;
import com.secure.exammaterial.upsc.nda_nae;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}