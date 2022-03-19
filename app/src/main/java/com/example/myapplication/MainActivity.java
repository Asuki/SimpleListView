package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter adapter;
    Button button;
    ArrayList<MyData> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyData data1 = new MyData("TextADDED", true);
                myList.add(data1);
                adapter.notifyDataSetChanged();
            }
        });
        test();
    }

    private void test() {


        MyData data1 = new MyData("Text1", true);
        MyData data2 = new MyData("Text2", false);

        myList.add(data1);
        myList.add(data2);

        adapter = new MyAdapter(getBaseContext(), R.layout.my_list, myList);
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);

    }

}