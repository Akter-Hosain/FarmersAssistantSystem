package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AgricultureActivity4 extends AppCompatActivity implements View.OnClickListener {
private Button full1Button,full2Button,full3Button;
private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("কৃষি তথ্য");
        full1Button=(Button)findViewById(R.id.Full1ButtonId);
        full2Button=(Button)findViewById(R.id.Full2ButtonId);
        full3Button=(Button)findViewById(R.id.Full3ButtonId);
        full1Button.setOnClickListener(this);
        full2Button.setOnClickListener(this);
        full3Button.setOnClickListener(this);
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
      if (v.getId()==R.id.Full1ButtonId){
          intent=new Intent(AgricultureActivity4.this,FullActivity1.class);
          startActivity(intent);
      }
      else if (v.getId()==R.id.Full2ButtonId){
          intent=new Intent(AgricultureActivity4.this,FullActivity2.class);
          startActivity(intent);
      }
      else if (v.getId()==R.id.Full3ButtonId){
          intent=new Intent(AgricultureActivity4.this,FullActivity3.class);
          startActivity(intent);
      }
    }
}