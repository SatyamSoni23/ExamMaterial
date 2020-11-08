package com.secure.exammaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.secure.exammaterial.category.IitJeeAdvancedCategoryActivity;
import com.secure.exammaterial.category.iit_jee_category;
import com.secure.exammaterial.category.upsc_category;
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

        Intent intent = new Intent(this, ies_category.class);
        startActivity(intent);
    }
}