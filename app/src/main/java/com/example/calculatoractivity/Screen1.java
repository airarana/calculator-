
        package com.example.calculatoractivity;



import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;



public class Screen1 extends AppCompatActivity {



    // define the variable

    Button send_button;

    EditText send_text1;
    EditText send_text2;
    @Override

    protected void onCreate(Bundle savedInstanceState)

    {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen1);

        send_button = (Button)findViewById(R.id.send_button_id);

        send_text1 = (EditText)findViewById(R.id.send_text_id1);
        send_text2 = (EditText)findViewById(R.id.send_text_id2);




        // add the OnClickListener in sender button

        // after clicked this button following Instruction will run

        send_button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v)

            {



                // get the value which input by user in EditText

                // and convert it to string

                String text1 = send_text1.getText().toString();
                String text2 = send_text2.getText().toString();


                // Create the Intent object of this class Context() to Second_activity class


                Intent intent = new Intent(getApplicationContext(),Screen2.class);



                // now by putExtra method put the value in key, value pair

                // key is message_key by this key we will receive the value, and put the string



                intent.putExtra("message_key1", text1);
                intent.putExtra("message_key2", text2);


                // start the Intent

                startActivity(intent);

            }

        });

    }

}