package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AgricultureActivity extends AppCompatActivity implements View.OnClickListener {
    private Button agriculture1Button,agriculture2Button, agriculture3Button,agriculture4Button,agriculture5Button,agriculture6Button;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("কৃষি তথ্য");
        agriculture1Button=(Button)findViewById(R.id.Ag1ButtonId);
        agriculture2Button=(Button) findViewById(R.id.Ag2ButtonId);
        agriculture3Button=(Button) findViewById(R.id.Ag3ButtonId);
        agriculture4Button=(Button) findViewById(R.id.Ag4ButtonId);
        agriculture5Button=(Button) findViewById(R.id.Ag5ButtonId);
        agriculture6Button=(Button) findViewById(R.id.Ag6ButtonId);
        agriculture1Button.setOnClickListener(this);
        agriculture2Button.setOnClickListener(this);
        agriculture3Button.setOnClickListener(this);
        agriculture4Button.setOnClickListener(this);
        agriculture5Button.setOnClickListener(this);
        agriculture6Button.setOnClickListener(this);
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
        if (v.getId()==R.id.Ag1ButtonId)
        {
            intent=new Intent(AgricultureActivity.this,AgricultureActivity1.class );
            startActivity(intent);
        }
        else if (v.getId()==R.id.Ag2ButtonId)
        {
            intent=new Intent(AgricultureActivity.this,AgricultureActivity2.class );
            startActivity(intent);
        }
        else if (v.getId()==R.id.Ag3ButtonId)
        {
            intent=new Intent(AgricultureActivity.this,AgricultureActivity3.class );
            startActivity(intent);
        }
        else if (v.getId()==R.id.Ag4ButtonId)
        {
            intent=new Intent(AgricultureActivity.this,AgricultureActivity4.class );
            startActivity(intent);
        }
        else if (v.getId()==R.id.Ag5ButtonId)
        {
            intent=new Intent(AgricultureActivity.this,AgricultureActivity5.class );
            startActivity(intent);
        }
        else if (v.getId()==R.id.Ag6ButtonId)
        {
            intent=new Intent(AgricultureActivity.this,AgricultureActivity6.class );
            startActivity(intent);
        }
    }

}