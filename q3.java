package com.example.henry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class q3 extends AppCompatActivity {

    int score;
    int tscore;
    RadioButton tr, fal;
    boolean Tr, Fal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        Intent fetchq2 = getIntent();
        int fetch = fetchq2.getIntExtra("addScore",tscore);
        tscore = fetch;
        show(tscore);
    }

    // Creates a boolean of the radio buttons for Que1
    public void setRadio() {
        tr = findViewById(R.id.ans_a);
        Tr = tr.isChecked();
        fal = findViewById(R.id.ans_b);
        Fal = fal.isChecked();

//Checks the selected option if it is correct/true
        if (Tr) {
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
        Intent submit = new Intent(this, q4.class);
        submit.putExtra("addScore",tscore);
        startActivity(submit);
    }

}
