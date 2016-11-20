package com.example.grzegorz.androidworkout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String[] values = new String[] {"Wstęp", "Lekcja 1", "Lekcja 2", "Lekcja 3"};
        ListView listView = (ListView) findViewById(R.id.list_of_lessons);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);
    }
}
