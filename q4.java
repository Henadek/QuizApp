package com.example.henry.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class q4 extends AppCompatActivity {

    int score;
    int tscore;
    RadioButton toad, bullfrog, goliath, dartfrog;
    boolean Toad, bullFrog, Goliath, dartFrog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        Intent fetchq2 = getIntent();
        int fetch = fetchq2.getIntExtra("addScore",tscore);
        tscore = fetch;
        show(tscore);
    }

    // Creates a boolean of the radio buttons for Que1
    public void setRadio() {
        toad = findViewById(R.id.ans_a);
        Toad = toad.isChecked();
        bullfrog = findViewById(R.id.ans_b);
        bullFrog = bullfrog.isChecked();
        goliath = findViewById(R.id.ans_c);
        Goliath = goliath.isChecked();
        dartfrog = findViewById(R.id.ans_d);
        dartFrog = dartfrog.isChecked();

//Checks the selected option if it is csorrect/true
        if (Goliath) {
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
        Intent submit = new Intent(this, q5.class);
        submit.putExtra("addScore",tscore);
        startActivity(submit);
    }

}
