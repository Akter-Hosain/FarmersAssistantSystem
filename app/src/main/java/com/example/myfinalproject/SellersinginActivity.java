package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class SellersinginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText emailEditText,passEditText;
    private TextView signUpTextView;
    private Button signInButton;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellersingin);
        mAuth= FirebaseAuth.getInstance();
        emailEditText=findViewById(R.id.emailEditTextId);
        passEditText=findViewById(R.id.passEditTextId);
        signUpTextView=findViewById(R.id.signUpTextViewId);
        signInButton=findViewById(R.id.login1ButtonId);
        signInButton.setOnClickListener(this);
        signUpTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.login1ButtonId:
            userLogin();
            break;
            case R.id.signUpTextViewId:
                Intent intent=new Intent(getApplicationContext(),RegistrationActivity.class);
                startActivity(intent);
                break;
        }

    }
    private void userLogin(){
        String email= emailEditText.getText().toString().trim();
        String password= passEditText.getText().toString().trim();
        if (email.isEmpty()){
            emailEditText.setError("Enter a valid address");
            emailEditText.requestFocus();
            return;
        }

        if (password.isEmpty()){
            passEditText.setError("Enter your password");
            passEditText.requestFocus();
            return;
        }
        if (password.length()<6){
            passEditText.setError("Minimum length of a password should be 6");
            passEditText.requestFocus();
            return;
        }
      mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
          @Override
          public void onComplete(@NonNull Task<AuthResult> task) {
              if (task.isSuccessful()){
                  Intent intent =new Intent(getApplicationContext(),MainPageActivity.class);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                  startActivity(intent);
              }
              else{
                  Toast.makeText(getApplicationContext(),"Login unsuccessful ",Toast.LENGTH_LONG).show();

              }
          }
      });

    }
}