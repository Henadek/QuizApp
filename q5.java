package com.example.henry.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class q5 extends AppCompatActivity {

    int score;
    int tscore;
    RadioButton albatross, ruby, tern, vulture;
    boolean Albatross, Ruby, Tern, Vulture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        // Accepts the sent data from the past activity with intent
        Intent fetchq2 = getIntent();
        int fetch = fetchq2.getIntExtra("addScore",tscore);
        tscore = fetch;
        show(tscore);
    }

    // Creates a boolean of the radio buttons for Que1
    public void setRadio() {
        albatross = findViewById(R.id.ans_a);
        Albatross = albatross.isChecked();
        ruby = findViewById(R.id.ans_b);
        Ruby = ruby.isChecked();
        tern = findViewById(R.id.ans_c);
        Tern = tern.isChecked();
        vulture = findViewById(R.id.ans_d);
        Vulture = vulture.isChecked();

//Checks the selected option if it is correct/true
        if (Ruby) {
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
        show(tscore);
        Intent submit = new Intent(this, summary.class);
        submit.putExtra("addScore",tscore);
        startActivity(submit);
    }

}
