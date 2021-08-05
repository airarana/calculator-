

package com.example.calculatoractivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    // Global Variables accessible to every method
    EditText e1, e2;
    TextView t;
    Button Add, Sub, Mul, Div;
    int num1, num2;

    @Override
    protected void onCreate(  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editTextNumber);

        // defining the edit text 2 to e2
        e2= (EditText) findViewById(R.id.editTextNumber2);

        // defining the text view to t1
        t= (TextView) findViewById(R.id.Result);

        Add= (Button) findViewById(R.id.button1);
        Sub= (Button) findViewById(R.id.button2);
        Mul= (Button) findViewById(R.id.button3);
        Div= (Button) findViewById(R.id.button4);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                int sum = num1 + num2;
                t.setText(Integer.toString(sum));
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                int sum = num1 - num2;
                t.setText(Integer.toString(sum));
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                int sum = num1 * num2;
                t.setText(Integer.toString(sum));
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                int sum = num1 / num2;
                t.setText(Integer.toString(sum));
            }
        });

    }

    public void getValues(){
        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();

        // condition to check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = "Please enter a value";
            t.setText(result);

        } else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);
        }
    }
}
