package com.example.grzegorz.androidworkout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class BonesGameActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;
    Button throwBones, pass;
    ArrayList<Integer> score = new ArrayList<>();
    TextView debug1, debug2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bones_game);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        throwBones = (Button) findViewById(R.id.throwBones);
        pass = (Button) findViewById(R.id.pass_button);
        debug1 = (TextView) findViewById(R.id.debug1);
        debug2 = (TextView) findViewById(R.id.debug2);

        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        pass.setEnabled(false);

        throwBones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText(randomThrowRange(1, 6));
                score.add(stringToInteger((String) button1.getText()));
                button2.setText(randomThrowRange(1, 6));
                score.add(stringToInteger((String) button2.getText()));
                button3.setText(randomThrowRange(1, 6));
                score.add(stringToInteger((String) button3.getText()));
                button4.setText(randomThrowRange(1, 6));
                score.add(stringToInteger((String) button4.getText()));
                button5.setText(randomThrowRange(1, 6));
                score.add(stringToInteger((String) button5.getText()));

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                pass.setEnabled(true);

                debug1.setText(score.toString());
                debug2.setText("" + sumAllElements(score));

                throwBones.setEnabled(false);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(randomThrowRange(1, 6));
                score.set(0, a);
                String number = String.valueOf(a);
                button1.setText(number);
                debug1.setText(score.toString());
                button1.setEnabled(false);
                debug2.setText("" + sumAllElements(score));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(randomThrowRange(1, 6));
                score.set(1, a);
                String number = String.valueOf(a);
                button2.setText(number);
                debug1.setText(score.toString());
                button2.setEnabled(false);
                debug2.setText("" + sumAllElements(score));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(randomThrowRange(1, 6));
                score.set(2, a);
                String number = String.valueOf(a);
                button3.setText(number);
                debug1.setText(score.toString());
                button3.setEnabled(false);
                debug2.setText("" + sumAllElements(score));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(randomThrowRange(1, 6));
                score.set(3, a);
                String number = String.valueOf(a);
                button4.setText(number);
                debug1.setText(score.toString());
                button4.setEnabled(false);
                debug2.setText("" + sumAllElements(score));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(randomThrowRange(1, 6));
                score.set(4, a);
                String number = String.valueOf(a);
                button5.setText(number);
                debug1.setText(score.toString());
                button5.setEnabled(false);
                debug2.setText("" + sumAllElements(score));
            }
        });

    }

    public String randomThrowRange(int min, int max) {
        int range = (max - min) + 1;
        int result = ((int)(Math.random() * range) + min);
        String s = Integer.toString(result);
        return s;
    }

    public Integer stringToInteger(String s) {
        Integer integer = null;
        try {
            integer = integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Wrong format number!!!");
        }
        return integer;
    }

    public int sumAllElements(ArrayList al) {
        int sum = 0;
        Integer a = (Integer) al.get(0);
        Integer b = (Integer) al.get(1);
        Integer c = (Integer) al.get(2);
        Integer d = (Integer) al.get(3);
        Integer e = (Integer) al.get(4);
        sum += a + b + c + d + e;

        return sum;
    }

    public void passWindow(View arg0) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(BonesGameActivity.this);
        builder.setMessage("Are you sure to pass?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                endGame();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
