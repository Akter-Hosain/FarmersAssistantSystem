package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AgricultureActivity5 extends AppCompatActivity implements View.OnClickListener {
    private Button sar1Button,sar2Button,sar3Button,sar4Button;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("কৃষি তথ্য");
        sar1Button=(Button)findViewById(R.id.Sar1ButtonId);
        sar2Button=(Button)findViewById(R.id.Sar2ButtonId);
        sar3Button=(Button)findViewById(R.id.Sar3ButtonId);
        sar4Button=(Button)findViewById(R.id.Sar4ButtonId);
        sar1Button.setOnClickListener(this);
        sar2Button.setOnClickListener(this);
        sar3Button.setOnClickListener(this);
        sar4Button.setOnClickListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
     if (v.getId()==R.id.Sar1ButtonId){
         intent=new Intent(AgricultureActivity5.this,SarActivity1.class);
         startActivity(intent);
     }
     else if (v.getId()==R.id.Sar2ButtonId){
         intent=new Intent(AgricultureActivity5.this,SarActivity2.class);
         startActivity(intent);
     }
     else if (v.getId()==R.id.Sar3ButtonId){
         intent=new Intent(AgricultureActivity5.this,SarActivity3.class);
         startActivity(intent);
     }
     else if (v.getId()==R.id.Sar4ButtonId){
         intent=new Intent(AgricultureActivity5.this,SarActivity4.class);
         startActivity(intent);
     }
    }
}