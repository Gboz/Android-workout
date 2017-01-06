package com.example.grzegorz.androidworkout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class BonesGameActivity extends AppCompatActivity {

    CheckBox cB1, cB2, cB3, cB4, cB5;
    Button playerAction;

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

        playerAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cB1.setText("1");
                cB2.setText("2");
                cB3.setText("3");
                cB4.setText("4");
                cB5.setText("5");
            }
        });

        cB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cB1.setText("Test");
                if (cB1.getText() == "Test") {
                    cB1.setText("Dupa");
                } else {
                    cB1.setText("Oko");
                }
            }
        });

    }



}
