package com.example.grzegorz.androidworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    ListView listView;
    String[] lessons = {
            "Wstęp",
            "Diagram przypadków użycia",
            "Diagram klas",
            "Diagram czynności",
            "Diagram maszyny stanowej",
            "Diagram interakcji",
            "Diagram sekwencji",
            "Diagram komunikacji",
            "Diagram harmonogrowania",
            "Diagram sterowania interakcją",
            "Diagramy wdrożeniowe",
            "Diagram pakietów"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = (ListView) findViewById(R.id.list_of_lessons);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lessons);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent introductionIntent = new Intent(SecondActivity.this, Introduction.class);
                        startActivity(introductionIntent);
                        break;
                    case 1:
                        Intent dpuIntent = new Intent(SecondActivity.this, UseCaseDiagram.class);
                        startActivity(dpuIntent);
                        break;
                    default:
                        break;
                }
            }
        });

    }

}
