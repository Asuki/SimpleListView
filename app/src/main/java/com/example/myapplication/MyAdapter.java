package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<MyData> {
    private ArrayList<MyData> dataSet;
    private  Context context;
    private  int resource;


    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MyData> dataSet) {
        super(context, resource, dataSet);

        this.context = context;
        this.resource = resource;
        this.dataSet = dataSet;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = inflater.inflate(resource, parent, false);

        TextView textView = rowView.findViewById(R.id.textView);
        CheckBox checkBox = rowView.findViewById(R.id.checkBox);

        textView.setText(dataSet.get(position).myText);
        checkBox.setChecked(dataSet.get(position).myBool);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // do something here
            }
        });

        return rowView;
    }
}
