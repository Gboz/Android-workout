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
        playerAction.setText("Wyrzuć");

        playerAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cB1.setText(randomThrowRange(1, 6));
                cB2.setText(randomThrowRange(1, 6));
                cB3.setText(randomThrowRange(1, 6));
                cB4.setText(randomThrowRange(1, 6));
                cB5.setText(randomThrowRange(1, 6));
            }
        });
    }

    public String randomThrowRange(int min, int max) {
        int range = (max - min) + 1;
        int result = ((int)(Math.random() * range) + min);
        String s = Integer.toString(result);
        return s;
    }

}
