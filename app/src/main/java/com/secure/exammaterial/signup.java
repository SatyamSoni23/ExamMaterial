package com.secure.exammaterial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
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

public class signup extends AppCompatActivity {

    MaterialTextView login;
    private FirebaseAuth mAuth;
    private TextInputEditText email, password, cnf_password;
    MaterialButton signup_button;
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
        setContentView(R.layout.activity_signup);

        init();
        mAuth = FirebaseAuth.getInstance();

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl2.setAlpha((float) 0.3);
                AlphaAnimation alpha = new AlphaAnimation(1.0F, 1.0F);
                alpha.setFillAfter(true);
                progress_bar.startAnimation(alpha);

                if(email.getText().toString().isEmpty()){
                    Toast.makeText(signup.this, "Please enter email", Toast.LENGTH_SHORT).show();
                    alpha = new AlphaAnimation(0.0F, 0.0F);
                    alpha.setDuration(0);
                    alpha.setFillAfter(true);
                    rl2.setAlpha((float) 1);
                    progress_bar.startAnimation(alpha);
                    return;
                }
                else if(password.getText().toString().isEmpty()){
                    Toast.makeText(signup.this, "Please enter password", Toast.LENGTH_SHORT).show();
                    alpha = new AlphaAnimation(0.0F, 0.0F);
                    alpha.setDuration(0);
                    alpha.setFillAfter(true);
                    rl2.setAlpha((float) 1);
                    progress_bar.startAnimation(alpha);
                    return;
                }
                if(password.getText().toString().length() < 8){
                    Toast.makeText(signup.this, "Password must be greater than 8 character", Toast.LENGTH_SHORT).show();
                    alpha = new AlphaAnimation(0.0F, 0.0F);
                    alpha.setDuration(0);
                    alpha.setFillAfter(true);
                    rl2.setAlpha((float) 1);
                    progress_bar.startAnimation(alpha);
                    return;
                }
                if(!(password.getText().toString().equals(cnf_password.getText().toString()))){
                    Toast.makeText(signup.this, "Confirm password not match with your password", Toast.LENGTH_SHORT).show();
                    alpha = new AlphaAnimation(0.0F, 0.0F);
                    alpha.setDuration(0);
                    alpha.setFillAfter(true);
                    rl2.setAlpha((float) 1);
                    progress_bar.startAnimation(alpha);
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    updateUI(user);
                                }
                                else{
                                    Toast.makeText(signup.this, "Sorry, you are offline",
                                            Toast.LENGTH_SHORT).show();
                                    updateUI(null);
                                }
                            }
                        });
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        cnf_password = findViewById(R.id.cnf_password);
        signup_button = findViewById(R.id.signup_button);
        progress_bar = findViewById(R.id.progress_bar);
        rl2 = findViewById(R.id.rl2);
    }
}