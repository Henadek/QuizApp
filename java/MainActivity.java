package com.example.henry.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*  Creates an intent to call up the 1st Question
     */
    public void start(View view) {
        Toast.makeText(this,"Go!",Toast.LENGTH_SHORT).show();
        Intent que1 = new Intent(this,q1.class);
        startActivity(que1);
    }





}
