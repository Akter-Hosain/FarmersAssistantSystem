package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class AdLoginActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("এডমিন লগ ইন");

        emailEditText=findViewById(R.id.emailEditTextId);
        passwordEditText=findViewById(R.id.passwordEditTextId);
        loginButton=findViewById(R.id.loginButtonId);
        mAuth = FirebaseAuth.getInstance();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (emailEditText.getText().toString().isEmpty()){

                    emailEditText.setError("Enter Email Id");

                    return;

                }
                else{
                    emailEditText.setError(null);
                }
                if (passwordEditText.getText().toString().isEmpty()){
                    passwordEditText.setError("Enter Password");
                    return;
                }
                else {
                    passwordEditText.setError(null);
                }

                firebaseLogin();

            }

        });

    }
    private void firebaseLogin(){

        mAuth.signInWithEmailAndPassword(emailEditText.getText().toString(), passwordEditText.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {


                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(AdLoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                            Intent intent= new Intent(getApplicationContext(),CategoryActivity.class);
                            startActivity(intent);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(AdLoginActivity.this, "Login Failure", Toast.LENGTH_SHORT).show();
                        }


                    }
                });


    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}