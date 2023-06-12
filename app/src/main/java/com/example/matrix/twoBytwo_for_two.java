package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class twoBytwo_for_two extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;
    protected EditText a1;
    protected EditText b1;
    protected EditText c1;
    protected EditText d1;

    protected Button add;
    protected Button subtract;
    protected Button multiply;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_bytwo_for_two);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.l1);
        b = (EditText) findViewById(R.id.c1);
        c = (EditText) findViewById(R.id.l3);
        d = (EditText) findViewById(R.id.c2);
        a1 = (EditText) findViewById(R.id.l5);
        b1 = (EditText) findViewById(R.id.c13);
        c1 = (EditText) findViewById(R.id.c6);
        d1 = (EditText) findViewById(R.id.c10);

        add = (Button) findViewById(R.id.add_button);
        subtract = (Button) findViewById(R.id.subtract_button);
        multiply = (Button) findViewById(R.id.multiply_button);


        // add button function
        add.setOnClickListener(new View.OnClickListener() {

            public void add() {
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();

                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);

                double a_final = a_int + a1_int;
                double b_final = b_int + b1_int;
                double c_final = c_int + c1_int;
                double d_final = d_int + d1_int;

                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);


                Intent intent = new Intent(twoBytwo_for_two.this, add_result_2x2_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                startActivity(intent);
            }

            @Override
            public void onClick(View v) {



                if (a.getText().toString().equals("") ||
                b.getText().toString().equals("") ||
                c.getText().toString().equals("") ||
                d.getText().toString().equals("") ||
                a1.getText().toString().equals("") ||
                b1.getText().toString().equals("") ||
                c1.getText().toString().equals("") ||
                d1.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-") ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-") ||
                        c1.getText().toString().equals("-") ||
                        d1.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+") ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+") ||
                        c1.getText().toString().equals("+") ||
                        d1.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }


                else {
                    add();
                }

            }
        });



        subtract.setOnClickListener(new View.OnClickListener() {

            public void subtract() {
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();

                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);

                double a_final = a_int - a1_int;
                double b_final = b_int - b1_int;
                double c_final = c_int - c1_int;
                double d_final = d_int - d1_int;

                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);


                Intent intent = new Intent(twoBytwo_for_two.this, subtract_result_2x2_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                startActivity(intent);
            }
            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-") ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-") ||
                        c1.getText().toString().equals("-") ||
                        d1.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+") ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+") ||
                        c1.getText().toString().equals("+") ||
                        d1.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }



                else {
                    subtract();
                }

            }
        });         // end of subtraction function



        // multiplication button

        multiply.setOnClickListener(new View.OnClickListener() {

            public void multiply() {
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();

                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);

                double a_final = (a_int * a1_int) + (b_int * c1_int);
                double b_final = (a_int * b1_int) + (b_int * d1_int);
                double c_final = (c_int * a1_int) + (d_int * c1_int);
                double d_final = (c_int * b1_int) + (d_int * d1_int);

                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);


                Intent intent = new Intent(twoBytwo_for_two.this, multiply_result_2x2_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                startActivity(intent);
            }
            @Override
            public void onClick(View v) {
                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-") ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-") ||
                        c1.getText().toString().equals("-") ||
                        d1.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+") ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+") ||
                        c1.getText().toString().equals("+") ||
                        d1.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }



                else {
                    multiply();
                }
            }
        });         // end of multiplication function

    }
}