package com.example.grzegorz.androidworkout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView displayMessage = (TextView) findViewById(R.id.showMessage);
        displayMessage.setText(getIntent().getExtras().getString("textmessage"));
    }
}
