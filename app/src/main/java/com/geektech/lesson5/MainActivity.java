package com.geektech.lesson5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NameAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<String> names = new ArrayList<>();
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Erbol");
        names.add("Marat");
        names.add("Marat");
        names.add("Marat");
        names.add("Marat");
        names.add("Marat");
        names.add("Marat");
        names.add("Marat");
        names.add("Marat");
        names.add("Marat");
        adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}