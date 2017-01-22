package com.example.grzegorz.androidworkout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class BonesGameActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;
    Button button11, button22, button33, button44, button55;
    Button throwBones1, pass;
    Button throwBones2, pass2;
    ArrayList<Integer> score = new ArrayList<>();
    ArrayList<Integer> score2 = new ArrayList<>();
    TextView debug1, debug2;
    TextView debug11, debug22;
    TextView scoreFirstPlayer, scoreSecondPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bones_game);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        throwBones1 = (Button) findViewById(R.id.throwBones1);
        pass = (Button) findViewById(R.id.pass_button1);
        debug1 = (TextView) findViewById(R.id.debug1);
        debug2 = (TextView) findViewById(R.id.debug2);
        scoreFirstPlayer = (TextView) findViewById(R.id.scoreFirstPlayer);

        button11 = (Button) findViewById(R.id.button11);
        button22 = (Button) findViewById(R.id.button22);
        button33 = (Button) findViewById(R.id.button33);
        button44 = (Button) findViewById(R.id.button44);
        button55 = (Button) findViewById(R.id.button55);
        throwBones2 = (Button) findViewById(R.id.throwBones2);
        pass2 = (Button) findViewById(R.id.pass_button2);
        debug11 = (TextView) findViewById(R.id.debug11);
        debug22 = (TextView) findViewById(R.id.debug22);
        scoreSecondPlayer = (TextView) findViewById(R.id.scoreSecondPlayer);

        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        pass.setEnabled(false);

        button11.setEnabled(false);
        button22.setEnabled(false);
        button33.setEnabled(false);
        button44.setEnabled(false);
        button55.setEnabled(false);
        pass2.setEnabled(false);

        //first player
        throwBones1.setOnClickListener(new View.OnClickListener() {
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

                throwBones1.setEnabled(false);
                throwBones1.setTextColor(Color.GRAY);
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
                button1.setTextColor(Color.GRAY);
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
                button2.setTextColor(Color.GRAY);
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
                button3.setTextColor(Color.GRAY);
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
                button4.setTextColor(Color.GRAY);
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
                button5.setTextColor(Color.GRAY);
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                scoreFirstPlayer.setText("" + sumAllElements(score));
                pass.setEnabled(false);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                pass.setTextColor(Color.GRAY);
            }
        });

        //second player
        throwBones2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setText(randomThrowRange(1, 6));
                score2.add(stringToInteger((String) button11.getText()));
                button22.setText(randomThrowRange(1, 6));
                score2.add(stringToInteger((String) button22.getText()));
                button33.setText(randomThrowRange(1, 6));
                score2.add(stringToInteger((String) button33.getText()));
                button44.setText(randomThrowRange(1, 6));
                score2.add(stringToInteger((String) button44.getText()));
                button55.setText(randomThrowRange(1, 6));
                score2.add(stringToInteger((String) button55.getText()));

                button11.setEnabled(true);
                button22.setEnabled(true);
                button33.setEnabled(true);
                button44.setEnabled(true);
                button55.setEnabled(true);
                pass2.setEnabled(true);

                debug11.setText(score2.toString());
                debug22.setText("" + sumAllElements(score2));

                throwBones2.setEnabled(false);
                throwBones2.setTextColor(Color.GRAY);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = Integer.parseInt(randomThrowRange(1, 6));
                score2.set(0, b);
                String number = String.valueOf(b);
                button11.setText(number);
                debug11.setText(score2.toString());
                button11.setEnabled(false);
                debug22.setText("" + sumAllElements(score2));
                button11.setTextColor(Color.GRAY);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = Integer.parseInt(randomThrowRange(1, 6));
                score2.set(1, b);
                String number = String.valueOf(b);
                button22.setText(number);
                debug11.setText(score2.toString());
                button22.setEnabled(false);
                debug22.setText("" + sumAllElements(score2));
                button22.setTextColor(Color.GRAY);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = Integer.parseInt(randomThrowRange(1, 6));
                score2.set(2, b);
                String number = String.valueOf(b);
                button33.setText(number);
                debug11.setText(score2.toString());
                button33.setEnabled(false);
                debug22.setText("" + sumAllElements(score2));
                button33.setTextColor(Color.GRAY);
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = Integer.parseInt(randomThrowRange(1, 6));
                score2.set(3, b);
                String number = String.valueOf(b);
                button44.setText(number);
                debug11.setText(score2.toString());
                button44.setEnabled(false);
                debug22.setText("" + sumAllElements(score2));
                button44.setTextColor(Color.GRAY);
            }
        });

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = Integer.parseInt(randomThrowRange(1, 6));
                score2.set(4, b);
                String number = String.valueOf(b);
                button55.setText(number);
                debug11.setText(score2.toString());
                button55.setEnabled(false);
                debug22.setText("" + sumAllElements(score2));
                button55.setTextColor(Color.GRAY);
            }
        });

        pass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                scoreSecondPlayer.setText("" + sumAllElements(score2));
                pass2.setEnabled(false);
                button11.setEnabled(false);
                button22.setEnabled(false);
                button33.setEnabled(false);
                button44.setEnabled(false);
                button55.setEnabled(false);
                if (sumAllElements(score) > sumAllElements(score2)) {
                    scoreFirstPlayer.setText("Win");
                } else if (sumAllElements(score) < sumAllElements(score2)) {
                    scoreSecondPlayer.setText("Win");
                } else {
                    scoreFirstPlayer.setText("Remis");
                    scoreSecondPlayer.setText("Remis");
                }
                pass2.setTextColor(Color.GRAY);
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

//Obsługa okna dialogowego

//    public void passWindow(View arg0) {
//        final AlertDialog.Builder builder = new AlertDialog.Builder(BonesGameActivity.this);
//        builder.setMessage("Are you sure to pass?");
//        builder.setCancelable(true);
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
////                endGame();
//            }
//        });
//        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.cancel();
//            }
//        });
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//    }

//Metoda zwracająca losową wartość boolean

//    public boolean randomPlayer() {
//        Random randomBoolean = new Random();
//        return randomBoolean.nextBoolean();
//    }

}
