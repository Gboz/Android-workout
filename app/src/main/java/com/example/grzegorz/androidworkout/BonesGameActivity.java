package com.example.grzegorz.androidworkout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;

import java.util.ArrayList;

public class BonesGameActivity extends AppCompatActivity {

    CheckBox cB1, cB2, cB3, cB4, cB5;
    Button playerAction;
    ArrayList score = new ArrayList();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bones_game);

        cB1 = (CheckBox) findViewById(R.id.cB1);
        cB2 = (CheckBox) findViewById(R.id.cB2);
        cB3 = (CheckBox) findViewById(R.id.cB3);
        cB4 = (CheckBox) findViewById(R.id.cB4);
        cB5 = (CheckBox) findViewById(R.id.cB5);
        playerAction = (Button) findViewById(R.id.playerButton);
        listView = (ListView) findViewById(R.id.list_of_scores);

        playerAction.setText("Wyrzuć");
        playerAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cB1.setText(randomThrowRange(1, 6));
                score.add(cB1.getText());
                cB2.setText(randomThrowRange(1, 6));
                score.add(cB2.getText());
                cB3.setText(randomThrowRange(1, 6));
                score.add(cB3.getText());
                cB4.setText(randomThrowRange(1, 6));
                score.add(cB4.getText());
                cB5.setText(randomThrowRange(1, 6));
                score.add(cB5.getText());
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, score);
        listView.setAdapter(adapter);
    }

    public String randomThrowRange(int min, int max) {
        int range = (max - min) + 1;
        int result = ((int)(Math.random() * range) + min);
        String s = Integer.toString(result);
        return s;
    }

}
