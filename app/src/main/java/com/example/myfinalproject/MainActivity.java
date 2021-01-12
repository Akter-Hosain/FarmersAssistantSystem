package com.example.myfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button adminButton,sellerButton,customerButton,agricultureButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adminButton=(Button) findViewById(R.id.AdminButtonId);
        sellerButton=(Button)findViewById(R.id.SellerButtonId);
        customerButton=(Button)findViewById(R.id.CustomerButtonId);
        agricultureButton=(Button)findViewById(R.id.AgricultureButtonId);
        adminButton.setOnClickListener(this);
        sellerButton.setOnClickListener(this);
        customerButton.setOnClickListener(this);
        agricultureButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.SellerButtonId){
            intent=new Intent(MainActivity.this,SellersinginActivity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.CustomerButtonId){
            intent =new Intent(MainActivity.this,SellersinginActivity.class);
            startActivity(intent);
        }

      if (v.getId()==R.id.AgricultureButtonId){
            intent=new Intent(MainActivity.this,AgricultureActivity.class);
            startActivity(intent);
        } if (v.getId()==R.id.AdminButtonId){
            intent=new Intent(MainActivity.this,AdLoginActivity.class);
            startActivity(intent);
        }

     }
    }