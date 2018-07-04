package com.example.henry.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class summary extends AppCompatActivity {

    int tscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        // Accepts the sent data from the past activity with intent
        Intent fetchq2 = getIntent();
        int fetch = fetchq2.getIntExtra("addScore",tscore);
        tscore = fetch;
        show(tscore);
    }




    // Displays the update of the score
    public void show(int scor) {
        TextView disp = findViewById(R.id.update);
        disp.setText(String.valueOf(scor));

    }

    public void next1(View v) {
        Intent submit = new Intent(this, MainActivity.class);
        startActivity(submit);
    }
    public void quit(View v) {
        finishAffinity();
        }


}
