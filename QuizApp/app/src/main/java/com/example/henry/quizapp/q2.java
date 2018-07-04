package com.example.henry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class q2 extends AppCompatActivity {

    int score = 0;
    int tscore;
    RadioButton one, two, three, four;
    boolean One, Two, Three, Four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Intent fetchq1 = getIntent();
        int fetch = fetchq1.getIntExtra("addScore",tscore);
        tscore = fetch;
        show(tscore);

    }


    // Creates a boolean of the radio buttons for Que1
    public void setRadio() {
        one = findViewById(R.id.ans_a);
        One = one.isChecked();
        two = findViewById(R.id.ans_b);
        Two = two.isChecked();
        three = findViewById(R.id.ans_c);
        Three = three.isChecked();
        four = findViewById(R.id.ans_d);
        Four = four.isChecked();

//Checks the selected option if it is correct/true
        if (Four) {
            score = 5;
            tscore = tscore + score;
        }
    }


    // Displays the update of the score
    public void show(int scor) {
        TextView disp = findViewById(R.id.update);
        disp.setText(String.valueOf(scor));

    }

    public void next1(View v) {
        setRadio();
        Intent submit = new Intent(this, q3.class);
        submit.putExtra("addScore",tscore);
        startActivity(submit);
    }
}
