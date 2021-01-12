package com.example.myfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CategoryActivity extends AppCompatActivity {
    private EditText proNameEditText,proPriceEditText,dateEditText;
    private Button addButton,showButton;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("এডমিন");
        databaseReference= FirebaseDatabase.getInstance().getReference("admin");
        proNameEditText=findViewById(R.id.proNameEditTextId);
        proPriceEditText=findViewById(R.id.proPriceEditTextId);
        dateEditText=findViewById(R.id.DateEditTextId);
        addButton=findViewById(R.id.AddButtonId);
        showButton=findViewById(R.id.ShowButtonId);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CategoryActivity.this,ShowDataActivity.class);
                startActivity(intent);
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });

    }
    public void saveData(){
        String name=proNameEditText.getText().toString().trim();
        String price=proPriceEditText.getText().toString().trim();
        String date=dateEditText.getText().toString().trim();
        String id=databaseReference.push().getKey();
        SaveData saveData=new SaveData(id,name,price,date);
        databaseReference.child(id).setValue(saveData);
        Toast.makeText(this,"add data",Toast.LENGTH_LONG).show();

    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}