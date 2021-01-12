package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nameEditText,emailEditText,passwordEditText;
    private Button loginButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        mAuth=FirebaseAuth.getInstance();
        nameEditText=findViewById(R.id.nameEditTextId);
        emailEditText=findViewById(R.id.emailEditTextId);
        passwordEditText=findViewById(R.id.passwordEditTextId);
        loginButton=findViewById(R.id.loginButtonId);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginButtonId:
                userRegister();
                break;

        }
    }
    private void userRegister(){
        String name=nameEditText.getText().toString().trim();
        String email=emailEditText.getText().toString().trim();
        String password=passwordEditText.getText().toString().trim();

        if (name.isEmpty()) {
            nameEditText.setError("Enter your name");
            nameEditText.requestFocus();
            return;
        }
            if (email.isEmpty()){
                emailEditText.setError("Enter your email address");
                emailEditText.requestFocus();
                return;
            }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailEditText.setError("Enter a valid email address");
            emailEditText.requestFocus();
            return;
        }
        if (password.isEmpty()){
            passwordEditText.setError("Enter your password");
            passwordEditText.requestFocus();
            return;

        }
        if (password.length()<6){
            passwordEditText.setError("Minimum length of a password should be 6");
            passwordEditText.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "register is successful",Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "register is not successful",Toast.LENGTH_LONG).show();

                }
            }
        });

    }
    }
