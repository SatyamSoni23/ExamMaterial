package com.secure.exammaterial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {

    MaterialTextView signup;
    private FirebaseAuth mAuth;
    private TextInputEditText email, password;
    MaterialButton login_button;
    RelativeLayout progress_bar;
    RelativeLayout rl2;

    @Override
    protected void onStart() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
        super.onStart();
    }

    private void updateUI(FirebaseUser currentUser) {
        if(currentUser != null) {
            String email = currentUser.getEmail();
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
        }
        AlphaAnimation alpha = new AlphaAnimation(0.0F, 0.0F);
        alpha.setDuration(0);
        alpha.setFillAfter(true);
        rl2.setAlpha((float) 1);
        progress_bar.startAnimation(alpha);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        mAuth = FirebaseAuth.getInstance();
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl2.setAlpha((float) 0.3);
                AlphaAnimation alpha = new AlphaAnimation(1.0F, 1.0F);
                alpha.setFillAfter(true);
                progress_bar.startAnimation(alpha);


                if(email.getText().toString().isEmpty()){
                    Toast.makeText(login.this, "please enter email", Toast.LENGTH_SHORT).show();
                    alpha = new AlphaAnimation(0.0F, 0.0F);
                    alpha.setDuration(0);
                    alpha.setFillAfter(true);
                    rl2.setAlpha((float) 1);
                    progress_bar.startAnimation(alpha);
                    return;
                }
                else if(password.getText().toString().isEmpty()){
                    Toast.makeText(login.this, "please enter password", Toast.LENGTH_SHORT).show();
                    alpha = new AlphaAnimation(0.0F, 0.0F);
                    alpha.setDuration(0);
                    alpha.setFillAfter(true);
                    rl2.setAlpha((float) 1);
                    progress_bar.startAnimation(alpha);
                    return;
                }
                mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    updateUI(user);
                                }
                                else{
                                    Toast.makeText(login.this, "Wrong email or password", Toast.LENGTH_SHORT).show();
                                    updateUI(null);
                                }
                            }
                        });
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        signup = findViewById(R.id.signup);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login_button = findViewById(R.id.login_button);
        progress_bar = findViewById(R.id.progress_bar);
        rl2 = findViewById(R.id.rl2);
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
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