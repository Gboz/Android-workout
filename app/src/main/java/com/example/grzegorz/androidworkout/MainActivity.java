package com.example.grzegorz.androidworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoadSecondActivity(View view){
//        startActivity(new Intent(MainActivity.this, SecondActivity.class));
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        startActivity(intent);
    }

    public void LoadThirdActivity(View view){
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);

        startActivity(intent);
    }
}
