package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class threeBythree extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;
    protected EditText e;
    protected EditText f;
    protected EditText g;
    protected EditText h;
    protected EditText i;

    protected EditText power;
    protected EditText multNum;
    protected EditText divideNum;

    protected Button calculate;
    protected Button transpose;
    protected Button multiplyBy;
    protected Button divideBy;
    protected Button inverse;
    protected Button determinant;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_bythree);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.afp1);
        b = (EditText) findViewById(R.id.et2);
        c = (EditText) findViewById(R.id.afp2);
        d = (EditText) findViewById(R.id.et4);
        e = (EditText) findViewById(R.id.et5);
        f = (EditText) findViewById(R.id.afp4);
        g = (EditText) findViewById(R.id.afp3);
        h = (EditText) findViewById(R.id.et8);
        i = (EditText) findViewById(R.id.et9);

        power = (EditText) findViewById(R.id.apf_power);
        multNum = (EditText) findViewById(R.id.afp_mltp);
        divideNum = (EditText) findViewById(R.id.divide_Num);

        calculate = (Button) findViewById(R.id.calculateButton_op);
        transpose = (Button) findViewById(R.id.transposeButton_op);
        multiplyBy = (Button) findViewById(R.id.multiplyByButton_op);
        divideBy = (Button) findViewById(R.id.dividebyButton);
        determinant = (Button) findViewById(R.id.DeterminantButton);
        inverse = (Button) findViewById(R.id.InverseButton);




        a = (EditText) findViewById(R.id.afp1);
        b = (EditText) findViewById(R.id.et2);
        c = (EditText) findViewById(R.id.afp2);
        d = (EditText) findViewById(R.id.et4);
        e = (EditText) findViewById(R.id.et5);
        f = (EditText) findViewById(R.id.afp4);
        g = (EditText) findViewById(R.id.afp3);
        h = (EditText) findViewById(R.id.et8);
        i = (EditText) findViewById(R.id.et9);




        // calculate button function ..
        calculate.setOnClickListener(new View.OnClickListener() {

            public void  calculate_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();

                String power_input = power.getText().toString();

                // converting the input into integers
                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int e_int = Integer.parseInt(e_input);
                int f_int = Integer.parseInt(f_input);
                int g_int = Integer.parseInt(g_input);
                int h_int = Integer.parseInt(h_input);
                int i_int = Integer.parseInt(i_input);
                int power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                int a_res = (int) Math.pow(a_int, power_int);
                int b_res = (int) Math.pow(b_int, power_int);
                int c_res = (int) Math.pow(c_int, power_int);
                int d_res = (int) Math.pow(d_int, power_int);
                int e_res = (int) Math.pow(e_int, power_int);
                int f_res = (int) Math.pow(f_int, power_int);
                int g_res = (int) Math.pow(g_int, power_int);
                int h_res = (int) Math.pow(h_int, power_int);
                int i_res = (int) Math.pow(i_int, power_int);

                // converting the integers back to strings
                String a_final = String.valueOf(a_res);
                String b_final = String.valueOf(b_res);
                String c_final = String.valueOf(c_res);
                String d_final = String.valueOf(d_res);
                String e_final = String.valueOf(e_res);
                String f_final = String.valueOf(f_res);
                String g_final = String.valueOf(g_res);
                String h_final = String.valueOf(h_res);
                String i_final = String.valueOf(i_res);

                Intent intent = new Intent(getApplicationContext(), calculate_result_3x3_1.class);
                intent.putExtra("keyname17", a_final);
                intent.putExtra("keyname18", b_final);
                intent.putExtra("keyname19", c_final);
                intent.putExtra("keyname20", d_final);
                intent.putExtra("keyname21", e_final);
                intent.putExtra("keyname22", f_final);
                intent.putExtra("keyname23", g_final);
                intent.putExtra("keyname24", h_final);
                intent.putExtra("keyname25", i_final);
                startActivity(intent);


            }
            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        e.getText().toString().equals("") ||
                        f.getText().toString().equals("") ||
                        g.getText().toString().equals("") ||
                        h.getText().toString().equals("") ||
                        i.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-")||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-")||
                        d.getText().toString().equals("-")||
                        e.getText().toString().equals("-")||
                        f.getText().toString().equals("-")||
                        g.getText().toString().equals("-")||
                        h.getText().toString().equals("-")||
                        i.getText().toString().equals("-")||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

            }

                else if (a.getText().toString().equals("+")||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+")||
                        d.getText().toString().equals("+")||
                        e.getText().toString().equals("+")||
                        f.getText().toString().equals("+")||
                        g.getText().toString().equals("+")||
                        h.getText().toString().equals("+")||
                        i.getText().toString().equals("+") ) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }



                else {
                    calculate_function();
                }
            }





        });         // end of calculate Button





            // transpose button function
        transpose.setOnClickListener(new View.OnClickListener() {

            public void  transpose_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();

                String power_input = power.getText().toString();

                // converting the input into integers
                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int e_int = Integer.parseInt(e_input);
                int f_int = Integer.parseInt(f_input);
                int g_int = Integer.parseInt(g_input);
                int h_int = Integer.parseInt(h_input);
                int i_int = Integer.parseInt(i_input);
                int power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                int a_res = (int) Math.pow(a_int, power_int);
                int b_res = (int) Math.pow(b_int, power_int);
                int c_res = (int) Math.pow(c_int, power_int);
                int d_res = (int) Math.pow(d_int, power_int);
                int e_res = (int) Math.pow(e_int, power_int);
                int f_res = (int) Math.pow(f_int, power_int);
                int g_res = (int) Math.pow(g_int, power_int);
                int h_res = (int) Math.pow(h_int, power_int);
                int i_res = (int) Math.pow(i_int, power_int);

                // converting the integers back to strings
                String a_final = String.valueOf(a_res);
                String b_final = String.valueOf(b_res);
                String c_final = String.valueOf(c_res);
                String d_final = String.valueOf(d_res);
                String e_final = String.valueOf(e_res);
                String f_final = String.valueOf(f_res);
                String g_final = String.valueOf(g_res);
                String h_final = String.valueOf(h_res);
                String i_final = String.valueOf(i_res);

                Intent intent = new Intent(threeBythree.this, transpose_result_3x3_1.class);
                intent.putExtra("keyname17", a_final);
                intent.putExtra("keyname18", b_final);
                intent.putExtra("keyname19", c_final);
                intent.putExtra("keyname20", d_final);
                intent.putExtra("keyname21", e_final);
                intent.putExtra("keyname22", f_final);
                intent.putExtra("keyname23", g_final);
                intent.putExtra("keyname24", h_final);
                intent.putExtra("keyname25", i_final);
                startActivity(intent);


            }

            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        e.getText().toString().equals("") ||
                        f.getText().toString().equals("") ||
                        g.getText().toString().equals("") ||
                        h.getText().toString().equals("") ||
                        i.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-")||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-")||
                        d.getText().toString().equals("-")||
                        e.getText().toString().equals("-")||
                        f.getText().toString().equals("-")||
                        g.getText().toString().equals("-")||
                        h.getText().toString().equals("-")||
                        i.getText().toString().equals("-")||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }

                else if (a.getText().toString().equals("+")||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+")||
                        d.getText().toString().equals("+")||
                        e.getText().toString().equals("+")||
                        f.getText().toString().equals("+")||
                        g.getText().toString().equals("+")||
                        h.getText().toString().equals("+")||
                        i.getText().toString().equals("+")||
                        power.getText().toString().equals("+")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }


                else {
                    transpose_function();
                }
            }


        });





        multiplyBy.setOnClickListener(new View.OnClickListener() {

            public void  multiplyBy_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                double a_int = Double.parseDouble(a_input);
                double b_int = Double.parseDouble(b_input);
                double c_int = Double.parseDouble(c_input);
                double d_int = Double.parseDouble(d_input);
                double e_int = Double.parseDouble(e_input);
                double f_int = Double.parseDouble(f_input);
                double g_int = Double.parseDouble(g_input);
                double h_int = Double.parseDouble(h_input);
                double i_int = Double.parseDouble(i_input);
                double power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                double a_res = (double) Math.pow(a_int, power_int);
                double b_res = (double) Math.pow(b_int, power_int);
                double c_res = (double) Math.pow(c_int, power_int);
                double d_res = (double) Math.pow(d_int, power_int);
                double e_res = (double) Math.pow(e_int, power_int);
                double f_res = (double) Math.pow(f_int, power_int);
                double g_res = (double) Math.pow(g_int, power_int);
                double h_res = (double) Math.pow(h_int, power_int);
                double i_res = (double) Math.pow(i_int, power_int);

                String multNum_get = multNum.getText().toString();
                double multNum_double = Double.parseDouble(multNum_get);

                double a_double_final = a_res * multNum_double;
                double b_double_final = b_res * multNum_double;
                double c_double_final = c_res * multNum_double;
                double d_double_final = d_res * multNum_double;
                double e_double_final = e_res * multNum_double;
                double f_double_final = f_res * multNum_double;
                double g_double_final = g_res * multNum_double;
                double h_double_final = h_res * multNum_double;
                double i_double_final = i_res * multNum_double;


                // converting the integers back to strings
                String a_final = String.valueOf(a_double_final);
                String b_final = String.valueOf(b_double_final);
                String c_final = String.valueOf(c_double_final);
                String d_final = String.valueOf(d_double_final);
                String e_final = String.valueOf(e_double_final);
                String f_final = String.valueOf(f_double_final);
                String g_final = String.valueOf(g_double_final);
                String h_final = String.valueOf(h_double_final);
                String i_final = String.valueOf(i_double_final);

                Intent intent = new Intent(threeBythree.this, multBy_result_3x3_1.class);
                intent.putExtra("keyname17", a_final);
                intent.putExtra("keyname18", b_final);
                intent.putExtra("keyname19", c_final);
                intent.putExtra("keyname20", d_final);
                intent.putExtra("keyname21", e_final);
                intent.putExtra("keyname22", f_final);
                intent.putExtra("keyname23", g_final);
                intent.putExtra("keyname24", h_final);
                intent.putExtra("keyname25", i_final);
                startActivity(intent);


            }

            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        e.getText().toString().equals("") ||
                        f.getText().toString().equals("") ||
                        g.getText().toString().equals("") ||
                        h.getText().toString().equals("") ||
                        i.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (multNum.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Choose a number to multiply the Matrix with !", Toast.LENGTH_SHORT).show();
                }
                else if (a.getText().toString().equals("-")||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-")||
                        d.getText().toString().equals("-")||
                        e.getText().toString().equals("-")||
                        f.getText().toString().equals("-")||
                        g.getText().toString().equals("-")||
                        h.getText().toString().equals("-")||
                        i.getText().toString().equals("-")||
                        power.getText().toString().equals("-")||
                        multNum.getText().toString().equals("-")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }

                else if (a.getText().toString().equals("+")||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+")||
                        d.getText().toString().equals("+")||
                        e.getText().toString().equals("+")||
                        f.getText().toString().equals("+")||
                        g.getText().toString().equals("+")||
                        h.getText().toString().equals("+")||
                        i.getText().toString().equals("+")||
                        power.getText().toString().equals("+")||
                        multNum.getText().toString().equals("+")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }

                else if (multNum.getText().toString().equals("+0") || multNum.getText().toString().equals("-0")) {
                    Toast.makeText(threeBythree.this, "Zero cannot be positive or negative !", Toast.LENGTH_SHORT).show();
                }


                else {
                    multiplyBy_function();
                }
            }



        });

        // end of multiplication function


        // divideBy function


        divideBy.setOnClickListener(new View.OnClickListener() {

            public void  divideBy_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                double a_int = Double.parseDouble(a_input);
                double b_int = Double.parseDouble(b_input);
                double c_int = Double.parseDouble(c_input);
                double d_int = Double.parseDouble(d_input);
                double e_int = Double.parseDouble(e_input);
                double f_int = Double.parseDouble(f_input);
                double g_int = Double.parseDouble(g_input);
                double h_int = Double.parseDouble(h_input);
                double i_int = Double.parseDouble(i_input);
                double power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                double a_res = (double) Math.pow(a_int, power_int);
                double b_res = (double) Math.pow(b_int, power_int);
                double c_res = (double) Math.pow(c_int, power_int);
                double d_res = (double) Math.pow(d_int, power_int);
                double e_res = (double) Math.pow(e_int, power_int);
                double f_res = (double) Math.pow(f_int, power_int);
                double g_res = (double) Math.pow(g_int, power_int);
                double h_res = (double) Math.pow(h_int, power_int);
                double i_res = (double) Math.pow(i_int, power_int);

                String divideNum_get = divideNum.getText().toString();
                double divideNum_double = Double.parseDouble(divideNum_get);

                double a_double_final = a_res / divideNum_double;
                double b_double_final = b_res / divideNum_double;
                double c_double_final = c_res / divideNum_double;
                double d_double_final = d_res / divideNum_double;
                double e_double_final = e_res / divideNum_double;
                double f_double_final = f_res / divideNum_double;
                double g_double_final = g_res / divideNum_double;
                double h_double_final = h_res / divideNum_double;
                double i_double_final = i_res / divideNum_double;

                // rounding final result
                double a_final_rounded = (double) (Math.round(a_double_final*1000.0)/1000.0);
                double b_final_rounded = (double) (Math.round(b_double_final*1000.0)/1000.0);
                double c_final_rounded = (double) (Math.round(c_double_final*1000.0)/1000.0);
                double d_final_rounded = (double) (Math.round(d_double_final*1000.0)/1000.0);
                double e_final_rounded = (double) (Math.round(e_double_final*1000.0)/1000.0);
                double f_final_rounded = (double) (Math.round(f_double_final*1000.0)/1000.0);
                double g_final_rounded = (double) (Math.round(g_double_final*1000.0)/1000.0);
                double h_final_rounded = (double) (Math.round(h_double_final*1000.0)/1000.0);
                double i_final_rounded = (double) (Math.round(i_double_final*1000.0)/1000.0);


                // converting the integers back to strings
                String a_final = String.valueOf(a_final_rounded);
                String b_final = String.valueOf(b_final_rounded);
                String c_final = String.valueOf(c_final_rounded);
                String d_final = String.valueOf(d_final_rounded);
                String e_final = String.valueOf(e_final_rounded);
                String f_final = String.valueOf(f_final_rounded);
                String g_final = String.valueOf(g_final_rounded);
                String h_final = String.valueOf(h_final_rounded);
                String i_final = String.valueOf(i_final_rounded);

                Intent intent = new Intent(threeBythree.this, divideBy_result_3x3_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                intent.putExtra("keyname5", e_final);
                intent.putExtra("keyname6", f_final);
                intent.putExtra("keyname7", g_final);
                intent.putExtra("keyname8", h_final);
                intent.putExtra("keyname9", i_final);
                startActivity(intent);


            }

            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        e.getText().toString().equals("") ||
                        f.getText().toString().equals("") ||
                        g.getText().toString().equals("") ||
                        h.getText().toString().equals("") ||
                        i.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (divideNum.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Choose a number to divide the Matrix with !", Toast.LENGTH_SHORT).show();
                }

                else if (divideNum.getText().toString().equals("0")) {
                    Toast.makeText(threeBythree.this, "You can't divide the matrix by zero !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-")||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-")||
                        d.getText().toString().equals("-")||
                        e.getText().toString().equals("-")||
                        f.getText().toString().equals("-")||
                        g.getText().toString().equals("-")||
                        h.getText().toString().equals("-")||
                        i.getText().toString().equals("-")||
                        power.getText().toString().equals("-")||
                        divideNum.getText().toString().equals("-")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }

                else if (a.getText().toString().equals("+")||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+")||
                        d.getText().toString().equals("+")||
                        e.getText().toString().equals("+")||
                        f.getText().toString().equals("+")||
                        g.getText().toString().equals("+")||
                        h.getText().toString().equals("+")||
                        i.getText().toString().equals("+")||
                        power.getText().toString().equals("+")||
                        divideNum.getText().toString().equals("+")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }

                else if (divideNum.getText().toString().equals("+0") || divideNum.getText().toString().equals("-0")) {
                    Toast.makeText(threeBythree.this, "Zero cannot be positive or negative !", Toast.LENGTH_SHORT).show();
                }


                else {
                    divideBy_function();
                }
            }



        });



        // end of divide by function


        // determinant function


        determinant.setOnClickListener(new View.OnClickListener() {

            public void  determinant_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                double a_int = Double.parseDouble(a_input);
                double b_int = Double.parseDouble(b_input);
                double c_int = Double.parseDouble(c_input);
                double d_int = Double.parseDouble(d_input);
                double e_int = Double.parseDouble(e_input);
                double f_int = Double.parseDouble(f_input);
                double g_int = Double.parseDouble(g_input);
                double h_int = Double.parseDouble(h_input);
                double i_int = Double.parseDouble(i_input);
                double power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                double a_res = (double) Math.pow(a_int, power_int);
                double b_res = (double) Math.pow(b_int, power_int);
                double c_res = (double) Math.pow(c_int, power_int);
                double d_res = (double) Math.pow(d_int, power_int);
                double e_res = (double) Math.pow(e_int, power_int);
                double f_res = (double) Math.pow(f_int, power_int);
                double g_res = (double) Math.pow(g_int, power_int);
                double h_res = (double) Math.pow(h_int, power_int);
                double i_res = (double) Math.pow(i_int, power_int);



                double a = a_res * ( (e_res * i_res) - (h_res * f_res) );
                double b = b_res * ( (d_res * i_res) - (f_res * g_res) );
                double c = c_res * ( (d_res * h_res) - (e_res * g_res) );

                double final_result_double = a - b + c;


                // converting the integers back to strings
                String final_result = String.valueOf(final_result_double);


                Intent intent = new Intent(threeBythree.this, determinant_result_3x3_1.class);
                intent.putExtra("keyname1", final_result);

                startActivity(intent);


            }

            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        e.getText().toString().equals("") ||
                        f.getText().toString().equals("") ||
                        g.getText().toString().equals("") ||
                        h.getText().toString().equals("") ||
                        i.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-")||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-")||
                        d.getText().toString().equals("-")||
                        e.getText().toString().equals("-")||
                        f.getText().toString().equals("-")||
                        g.getText().toString().equals("-")||
                        h.getText().toString().equals("-")||
                        i.getText().toString().equals("-")||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }

                else if (a.getText().toString().equals("+")||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+")||
                        d.getText().toString().equals("+")||
                        e.getText().toString().equals("+")||
                        f.getText().toString().equals("+")||
                        g.getText().toString().equals("+")||
                        h.getText().toString().equals("+")||
                        i.getText().toString().equals("+")||
                        power.getText().toString().equals("+")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }


                else {
                    determinant_function();
                }
            }



        });

        // end of determinant function



        // inverse function


        inverse.setOnClickListener(new View.OnClickListener() {

            public void inverse_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                double a_int = Double.parseDouble(a_input);
                double b_int = Double.parseDouble(b_input);
                double c_int = Double.parseDouble(c_input);
                double d_int = Double.parseDouble(d_input);
                double e_int = Double.parseDouble(e_input);
                double f_int = Double.parseDouble(f_input);
                double g_int = Double.parseDouble(g_input);
                double h_int = Double.parseDouble(h_input);
                double i_int = Double.parseDouble(i_input);
                double power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                double a_res = (double) Math.pow(a_int, power_int);
                double b_res = (double) Math.pow(b_int, power_int);
                double c_res = (double) Math.pow(c_int, power_int);
                double d_res = (double) Math.pow(d_int, power_int);
                double e_res = (double) Math.pow(e_int, power_int);
                double f_res = (double) Math.pow(f_int, power_int);
                double g_res = (double) Math.pow(g_int, power_int);
                double h_res = (double) Math.pow(h_int, power_int);
                double i_res = (double) Math.pow(i_int, power_int);



                // calcultion of the determinant

                double a = a_res * ( (e_res * i_res) - (h_res * f_res) );
                double b = b_res * ( (d_res * i_res) - (f_res * g_res) );
                double c = c_res * ( (d_res * h_res) - (e_res * g_res) );

                double determinant_result_double = a - b + c;

                    // determinant calculation end



                    double a1 = (e_res * i_res) - (h_res * f_res);
                    double b1 = -(d_res * i_res) + (f_res * g_res);
                    double c1 = (d_res * h_res) - (e_res * g_res);
                    double d1 = -(b_res * i_res) + (c_res * h_res);
                    double e1 = (a_res * i_res) - (c_res * g_res);
                    double f1 = -(a_res * h_res) + (b_res * g_res);
                    double g1 = (b_res * f_res) - (c_res * e_res);
                    double h1 = -(a_res * f_res) + (c_res * d_res);
                    double i1 = (a_res * e_res) - (b_res * d_res);


                    double a_final_double = a1 * (1 / determinant_result_double);
                    double b_final_double = b1 * (1 / determinant_result_double);
                    double c_final_double = c1 * (1 / determinant_result_double);
                    double d_final_double = d1 * (1 / determinant_result_double);
                    double e_final_double = e1 * (1 / determinant_result_double);
                    double f_final_double = f1 * (1 / determinant_result_double);
                    double g_final_double = g1 * (1 / determinant_result_double);
                    double h_final_double = h1 * (1 / determinant_result_double);
                    double i_final_double = i1 * (1 / determinant_result_double);

                    double a_final_rounded = (double) (Math.round(a_final_double*1000.0)/1000.0);
                    double b_final_rounded = (double) (Math.round(b_final_double*1000.0)/1000.0);
                    double c_final_rounded = (double) (Math.round(c_final_double*1000.0)/1000.0);
                    double d_final_rounded = (double) (Math.round(d_final_double*1000.0)/1000.0);
                    double e_final_rounded = (double) (Math.round(e_final_double*1000.0)/1000.0);
                    double f_final_rounded = (double) (Math.round(f_final_double*1000.0)/1000.0);
                    double g_final_rounded = (double) (Math.round(g_final_double*1000.0)/1000.0);
                    double h_final_rounded = (double) (Math.round(h_final_double*1000.0)/1000.0);
                    double i_final_rounded = (double) (Math.round(i_final_double*1000.0)/1000.0);


                    // converting the integers back to strings
                    String a_final = String.valueOf(a_final_rounded);
                    String b_final = String.valueOf(b_final_rounded);
                    String c_final = String.valueOf(c_final_rounded);
                    String d_final = String.valueOf(d_final_rounded);
                    String e_final = String.valueOf(e_final_rounded);
                    String f_final = String.valueOf(f_final_rounded);
                    String g_final = String.valueOf(g_final_rounded);
                    String h_final = String.valueOf(h_final_rounded);
                    String i_final = String.valueOf(i_final_rounded);


                    Intent intent = new Intent(threeBythree.this, inverse_result_3x3_1.class);
                    intent.putExtra("keyname1", a_final);
                    intent.putExtra("keyname2", b_final);
                    intent.putExtra("keyname3", c_final);
                    intent.putExtra("keyname4", d_final);
                    intent.putExtra("keyname5", e_final);
                    intent.putExtra("keyname6", f_final);
                    intent.putExtra("keyname7", g_final);
                    intent.putExtra("keyname8", h_final);
                    intent.putExtra("keyname9", i_final);


                    startActivity(intent);


            }

            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("") ||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ||
                        e.getText().toString().equals("") ||
                        f.getText().toString().equals("") ||
                        g.getText().toString().equals("") ||
                        h.getText().toString().equals("") ||
                        i.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(threeBythree.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-")||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-")||
                        d.getText().toString().equals("-")||
                        e.getText().toString().equals("-")||
                        f.getText().toString().equals("-")||
                        g.getText().toString().equals("-")||
                        h.getText().toString().equals("-")||
                        i.getText().toString().equals("-")||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }

                else if (a.getText().toString().equals("+")||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+")||
                        d.getText().toString().equals("+")||
                        e.getText().toString().equals("+")||
                        f.getText().toString().equals("+")||
                        g.getText().toString().equals("+")||
                        h.getText().toString().equals("+")||
                        i.getText().toString().equals("+")||
                        power.getText().toString().equals("+")) {
                    Toast.makeText(threeBythree.this, "Invalid input !", Toast.LENGTH_SHORT).show();

                }


                else {
                    inverse_function();
                }
            }



        });


    }       // end of inverse function





}