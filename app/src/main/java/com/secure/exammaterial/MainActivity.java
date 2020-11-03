package com.secure.exammaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.secure.exammaterial.category.IitJeeAdvancedCategoryActivity;
import com.secure.exammaterial.category.iit_jee_category;
import com.secure.exammaterial.category.upsc_category;
import com.secure.exammaterial.upsc.cds;
import com.secure.exammaterial.upsc.civil_pre;
import com.secure.exammaterial.upsc.nda_nae;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, cds.class);
        startActivity(intent);
    }
}