package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AgricultureActivity1 extends AppCompatActivity implements View.OnClickListener {
    private Button agriculture11Button,agriculture12Button,agriculture13Button,agriculture14Button,agriculture15Button,agriculture16Button,agriculture17Button,agriculture18Button,agriculture19Button,agriculture20Button;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("কৃষি তথ্য");
        agriculture11Button=(Button)findViewById(R.id.Dhan1ButtonId);
        agriculture12Button=(Button)findViewById(R.id.Dhan2ButtonId);
        agriculture13Button=(Button)findViewById(R.id.Dhan3ButtonId);
        agriculture14Button=(Button)findViewById(R.id.Dhan4ButtonId);
        agriculture15Button=(Button)findViewById(R.id.Dhan5ButtonId);
        agriculture16Button=(Button)findViewById(R.id.Dhan6ButtonId);
        agriculture17Button=(Button)findViewById(R.id.Dhan7ButtonId);
        agriculture18Button=(Button)findViewById(R.id.Dhan8ButtonId);
        agriculture19Button=(Button)findViewById(R.id.Dhan9ButtonId);
        agriculture20Button=(Button)findViewById(R.id.Dhan10ButtonId);

        agriculture11Button.setOnClickListener(this);
        agriculture12Button.setOnClickListener(this);
        agriculture13Button.setOnClickListener(this);
        agriculture14Button.setOnClickListener(this);
        agriculture15Button.setOnClickListener(this);
        agriculture16Button.setOnClickListener(this);
        agriculture17Button.setOnClickListener(this);
        agriculture18Button.setOnClickListener(this);
        agriculture19Button.setOnClickListener(this);
        agriculture20Button.setOnClickListener(this);

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
        if (v.getId()==R.id.Dhan1ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivit11.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.Dhan2ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity12.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan3ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity13.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan4ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity14.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan5ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity15.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan6ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity16.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan7ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity17.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan8ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity18.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan9ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity19.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.Dhan10ButtonId){
            intent=new Intent(AgricultureActivity1.this,AgricultureActivity20.class);
            startActivity(intent);
        }
    }
}