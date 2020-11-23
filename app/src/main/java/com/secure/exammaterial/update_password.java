package com.secure.exammaterial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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

public class update_password extends AppCompatActivity {

    private FirebaseAuth mAuth;
    public TextInputEditText email;
    MaterialButton login_button;
    RelativeLayout progress_bar;
    RelativeLayout rl2;

    private void updateUI() {
        AlphaAnimation alpha = new AlphaAnimation(0.0F, 0.0F);
        alpha.setDuration(0);
        alpha.setFillAfter(true);
        rl2.setAlpha((float) 1);
        progress_bar.startAnimation(alpha);
        onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);

        init();

        mAuth = FirebaseAuth.getInstance();

        AlphaAnimation alpha = new AlphaAnimation(0.0F, 0.0F);
        alpha.setDuration(0);
        alpha.setFillAfter(true);
        rl2.setAlpha((float) 1);
        progress_bar.startAnimation(alpha);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl2.setAlpha((float) 0.3);
                final AlphaAnimation[] alpha = {new AlphaAnimation(1.0F, 1.0F)};
                alpha[0].setFillAfter(true);
                progress_bar.startAnimation(alpha[0]);


                if(email.getText().toString().isEmpty()){
                    Toast.makeText(update_password.this, "please enter email", Toast.LENGTH_SHORT).show();
                    alpha[0] = new AlphaAnimation(0.0F, 0.0F);
                    alpha[0].setDuration(0);
                    alpha[0].setFillAfter(true);
                    rl2.setAlpha((float) 1);
                    progress_bar.startAnimation(alpha[0]);
                    return;
                }
                String emails = email.getText().toString();

                FirebaseUser currentUser = mAuth.getCurrentUser();
                if(currentUser != null){
                    String sys_email = currentUser.getEmail();
                    if(!sys_email.equals(emails)){
                        Toast.makeText(update_password.this, "Please enter correct email", Toast.LENGTH_SHORT).show();
                        alpha[0] = new AlphaAnimation(0.0F, 0.0F);
                        alpha[0].setDuration(0);
                        alpha[0].setFillAfter(true);
                        rl2.setAlpha((float) 1);
                        progress_bar.startAnimation(alpha[0]);
                        return;
                    }
                }

                mAuth.sendPasswordResetEmail(emails)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(update_password.this, "Password reset link send to your registered email", Toast.LENGTH_SHORT).show();
                                    updateUI();
                                }
                                else{
                                    Toast.makeText(update_password.this, "Email not registered", Toast.LENGTH_SHORT).show();
                                    alpha[0] = new AlphaAnimation(0.0F, 0.0F);
                                    alpha[0].setDuration(0);
                                    alpha[0].setFillAfter(true);
                                    rl2.setAlpha((float) 1);
                                    progress_bar.startAnimation(alpha[0]);
                                }
                            }
                        });
            }
        });
    }

    private void init() {
        email = findViewById(R.id.email);
        login_button = findViewById(R.id.login_button);
        progress_bar = findViewById(R.id.progress_bar);
        rl2 = findViewById(R.id.rl2);
    }

}