package com.example.henry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
//import android.widget.Toast;

public class q1 extends AppCompatActivity {

    int score = 0;
    int tscore = 0;
    RadioButton hbird, ostrich, falcon, quelea;
    boolean hBird, ostRich, falCon, queLea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        show(tscore);
    }

    // Creates a boolean of the radio buttons for Que1
    public void setRadio() {
        hbird = findViewById(R.id.ans_a);
        hBird = hbird.isChecked();
        ostrich = findViewById(R.id.ans_b);
        ostRich = ostrich.isChecked();
        falcon = findViewById(R.id.ans_c);
        falCon = falcon.isChecked();
        quelea = findViewById(R.id.ans_d);
        queLea = quelea.isChecked();

//Checks the selected option if it is correct/true
        if (falCon) {
            score = 5;
            tscore = score;
        }
    }


    // Displays the update of the score
    public void show(int scor) {
        TextView disp = findViewById(R.id.update);
        disp.setText(String.valueOf(scor));

    }

    public void next1(View v) {
        setRadio();
        Intent submit = new Intent(this, q2.class);
        submit.putExtra("addScore",tscore);
        startActivity(submit);
    }

}



