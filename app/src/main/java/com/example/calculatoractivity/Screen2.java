package com.example.calculatoractivity;



import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;



public class Screen2 extends AppCompatActivity {


    TextView receive_id1;
    TextView receive_id2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen2);


        receive_id1 = (TextView) findViewById(R.id.receive_id1);
        receive_id2 = (TextView) findViewById(R.id.receive_id2);


        // create the get Intent object

        Intent intent = getIntent();


        // receive the value by getStringExtra() method

        // and key must be same which is send by first activity

        String str1 = intent.getStringExtra("message_key1");
        String str2 = intent.getStringExtra("message_key2");


        // display the string into textView

        receive_id1.setText(str1);
        receive_id2.setText(str2);
    }
}