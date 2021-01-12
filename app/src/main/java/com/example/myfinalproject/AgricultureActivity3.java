package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AgricultureActivity3 extends AppCompatActivity implements View.OnClickListener {
private Button agricultureveg1Button,agricultureveg2Button,agricultureveg3Button,agricultureveg4Button,agricultureveg5Button;
private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("কৃষি তথ্য");
        agricultureveg1Button=(Button)findViewById(R.id.Veg1ButtonId);
        agricultureveg2Button=(Button)findViewById(R.id.Veg3ButtonId);
        agricultureveg3Button=(Button)findViewById(R.id.Veg4ButtonId);
        agricultureveg4Button=(Button)findViewById(R.id.Veg5ButtonId);
        agricultureveg5Button=(Button)findViewById(R.id.Veg6ButtonId);

        agricultureveg1Button.setOnClickListener(this);
        agricultureveg2Button.setOnClickListener(this);
        agricultureveg3Button.setOnClickListener(this);
        agricultureveg4Button.setOnClickListener(this);
        agricultureveg5Button.setOnClickListener(this);
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
     if (v.getId()==R.id.Veg1ButtonId){
         intent=new Intent(AgricultureActivity3.this,VegetableActivity.class);
         startActivity(intent);
     }
     else if (v.getId()==R.id.Veg3ButtonId){
         intent=new Intent(AgricultureActivity3.this,VegetableActivity1.class);
         startActivity(intent);
     }
     else if (v.getId()==R.id.Veg4ButtonId){
         intent=new Intent(AgricultureActivity3.this,VegetableActivity2.class);
         startActivity(intent);
     }
     else if (v.getId()==R.id.Veg5ButtonId){
         intent=new Intent(AgricultureActivity3.this,VegetableActivity3.class);
         startActivity(intent);
     }
     else if (v.getId()==R.id.Veg6ButtonId){
         intent=new Intent(AgricultureActivity3.this,vegetableActivity4.class);
         startActivity(intent);
     }


    }
}