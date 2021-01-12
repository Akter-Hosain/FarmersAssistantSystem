package com.example.myfinalproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomerAdapter extends ArrayAdapter<SaveData> {

    private Activity context;
    private List<SaveData> saveDataList;

    public CustomerAdapter( Activity context,  List<SaveData> saveDataList) {
        super(context, R.layout.list_layout, saveDataList);
        this.context = context;
        this.saveDataList = saveDataList;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
      View view=  layoutInflater.inflate(R.layout.list_layout,null,true);
      SaveData saveData=saveDataList.get(position);
      TextView t=view.findViewById(R.id.proNameTextViewId);
      TextView t1=view.findViewById(R.id.proPriceTextViewId);
      TextView t2=view.findViewById(R.id.dateTextViewId);

        t.setText("পণ্যের নাম : "+ saveData.getName());
        t1.setText("পণ্যের দাম : "+ saveData.getPrice());
        t2.setText("সময় : "+ saveData.getDate());

        return view;
    }
}
