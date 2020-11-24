package com.secure.exammaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class about_us extends AppCompatActivity implements View.OnClickListener {

    ImageView youtube, instagram, facebook, twitter, pinterest, gmail, rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        init();
    }

    private void init() {
        youtube = findViewById(R.id.youtube);
        instagram = findViewById(R.id.instagram);
        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        pinterest = findViewById(R.id.pinterest);
        gmail = findViewById(R.id.gmail);
        rate = findViewById(R.id.playstore);

        youtube.setOnClickListener(this);
        instagram.setOnClickListener(this);
        facebook.setOnClickListener(this);
        twitter.setOnClickListener(this);
        pinterest.setOnClickListener(this);
        gmail.setOnClickListener(this);
        rate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case(R.id.youtube):
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UC7bYDBd9XNo9MNQPC25pwMg"));
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
                break;
            case(R.id.instagram):
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/innogenix_lab/"));
                intent.setPackage("com.instagram.android");
                startActivity(intent);
                break;
            case(R.id.facebook):
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/innogenix"));
                intent.setPackage("com.facebook.android");
                startActivity(intent);
                break;
            case(R.id.twitter):

                break;
            case(R.id.pinterest):

                break;
            case(R.id.gmail):

                break;
            case(R.id.rate_us):

                break;
        }
    }
}