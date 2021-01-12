package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AgricultureActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button agriculturealuButton1,agriculturealuButton2,agriculturealuButton3;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("কৃষি তথ্য");
        agriculturealuButton1=(Button)findViewById(R.id.Alu2ButtonId);
        agriculturealuButton2=(Button)findViewById(R.id.Alu3ButtonId);
        agriculturealuButton3=(Button)findViewById(R.id.Alu4ButtonId);
        agriculturealuButton1.setOnClickListener(this);
        agriculturealuButton2.setOnClickListener(this);
        agriculturealuButton3.setOnClickListener(this);
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
        if (v.getId()==R.id.Alu2ButtonId){
            intent=new Intent(AgricultureActivity2.this,AgriculturealuActivity1.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.Alu3ButtonId){
            intent=new Intent(AgricultureActivity2.this,AgriculturealuActivity2.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.Alu4ButtonId){
            intent=new Intent(AgricultureActivity2.this,AgriculturealuActivity3.class);
            startActivity(intent);
        }
    }
}