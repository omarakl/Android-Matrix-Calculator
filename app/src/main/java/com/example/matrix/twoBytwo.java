package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class twoBytwo extends AppCompatActivity {

    protected Button calculate;
    protected Button transpose;
    protected Button inverse;
    protected Button multiplyBy;
    protected Button divideBy;
    protected Button determinant;

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;
    protected EditText power;
    protected EditText multNum;
    protected EditText divideNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_bytwo);
        getSupportActionBar().hide();

        calculate = (Button) findViewById(R.id.calculateButton_op);
        transpose = (Button) findViewById(R.id.transposeButton_op);
        inverse = (Button) findViewById(R.id.inverseButton_op);
        multiplyBy = (Button) findViewById(R.id.multiplyByButton_op);
        divideBy = (Button) findViewById(R.id.divideByButton_op);
        determinant = (Button) findViewById(R.id.determinantButton_op);

        a = (EditText) findViewById(R.id.afp1);
        b = (EditText) findViewById(R.id.afp2);
        c = (EditText) findViewById(R.id.afp3);
        d = (EditText) findViewById(R.id.afp4);

        power = (EditText) findViewById(R.id.apf_power);
        multNum = (EditText) findViewById(R.id.afp_mltp);
        divideNum = (EditText) findViewById(R.id.afp_dvd);



        // calculate button function ..
        calculate.setOnClickListener(new View.OnClickListener() {

            public void  calculate_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                int a_res = (int) Math.pow(a_int, power_int);
                int b_res = (int) Math.pow(b_int, power_int);
                int c_res = (int) Math.pow(c_int, power_int);
                int d_res = (int) Math.pow(d_int, power_int);

                // converting the integers back to strings
                String a_final = String.valueOf(a_res);
                String b_final = String.valueOf(b_res);
                String c_final = String.valueOf(c_res);
                String d_final = String.valueOf(d_res);

                Intent intent = new Intent(twoBytwo.this, calculate_result_2x2_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                startActivity(intent);


            }


            @Override
            public void onClick(View v) {

               if (a.getText().toString().equals("") ||
                       b.getText().toString().equals("")||
                       c.getText().toString().equals("") ||
                       d.getText().toString().equals("") ) {
                   Toast.makeText(twoBytwo.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
               }
               else if (power.getText().toString().equals("")) {
                   Toast.makeText(twoBytwo.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
               }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

               else if (a.getText().toString().equals("+") ||
                       b.getText().toString().equals("+")||
                       c.getText().toString().equals("+") ||
                       d.getText().toString().equals("+") ||
                       power.getText().toString().equals("+")) {
                   Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
               }


               else {
                    calculate_function();
               }


                }       // onClick end


        });         // end of calculate button





        transpose.setOnClickListener(new View.OnClickListener() {

            public void  transpose_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                int a_res = (int) Math.pow(a_int, power_int);
                int b_res = (int) Math.pow(b_int, power_int);
                int c_res = (int) Math.pow(c_int, power_int);
                int d_res = (int) Math.pow(d_int, power_int);

                // converting the integers back to strings
                String a_final = String.valueOf(a_res);
                String b_final = String.valueOf(b_res);
                String c_final = String.valueOf(c_res);
                String d_final = String.valueOf(d_res);

                Intent intent = new Intent(twoBytwo.this, transpose_result_2x2_1.class);
                intent.putExtra("keyname5", a_final);
                intent.putExtra("keyname6", b_final);
                intent.putExtra("keyname7", c_final);
                intent.putExtra("keyname8", d_final);
                startActivity(intent);


            }


            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("")||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ) {
                    Toast.makeText(twoBytwo.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+") ||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        power.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else {
                    transpose_function();
                }


            }



        });     // end of transpose function






        inverse.setOnClickListener(new View.OnClickListener() {

            public void  inverse_function() {


                // applying the power on the integers
                double a_res = (double) Math.pow(Double.parseDouble(a.getText().toString()), Integer.parseInt(power.getText().toString()));
                double b_res = (double) Math.pow(Double.parseDouble(b.getText().toString()), Integer.parseInt(power.getText().toString()));
                double c_res = (double) Math.pow(Double.parseDouble(c.getText().toString()), Integer.parseInt(power.getText().toString()));
                double d_res = (double) Math.pow(Double.parseDouble(d.getText().toString()), Integer.parseInt(power.getText().toString()));

                double s = (a_res * d_res) - (b_res * c_res);
                double fraction = 1 / s;

                double a_inv = fraction * a_res;
                double b_inv = fraction * (b_res * -1);
                double c_inv = fraction * (c_res * -1);
                double d_inv = fraction * d_res;

                // rounding decimals (3 digits after decimal point)
                double a_rounded = (double) (Math.round(a_inv*1000.0)/1000.0);
                double b_rounded = (double) (Math.round(b_inv*1000.0)/1000.0);
                double c_rounded = (double) (Math.round(c_inv*1000.0)/1000.0);
                double d_rounded = (double) (Math.round(d_inv*1000.0)/1000.0);

                // converting the integers back to strings
                String a_final = String.valueOf(a_rounded);
                String b_final = String.valueOf(b_rounded);
                String c_final = String.valueOf(c_rounded);
                String d_final = String.valueOf(d_rounded);

                Intent intent = new Intent(twoBytwo.this, inverse_result_2x2_1.class);
                intent.putExtra("keyname9", a_final);
                intent.putExtra("keyname10", b_final);
                intent.putExtra("keyname11", c_final);
                intent.putExtra("keyname12", d_final);
                startActivity(intent);


            }

            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("")||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("") ) {
                    Toast.makeText(twoBytwo.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }
                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        power.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else {
                    inverse_function();
                }
            }



        });         // end of inverse buton




        multiplyBy.setOnClickListener(new View.OnClickListener() {

            public void  multiplyBy_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                double a_int = Double.parseDouble(a_input);
                double b_int = Double.parseDouble(b_input);
                double c_int = Double.parseDouble(c_input);
                double d_int = Double.parseDouble(d_input);
                double power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                double a_res = (double) Math.pow(a_int, power_int);
                double b_res = (double) Math.pow(b_int, power_int);
                double c_res = (double) Math.pow(c_int, power_int);
                double d_res = (double) Math.pow(d_int, power_int);

                String multNum_get = multNum.getText().toString();
                double multNum_double = Double.parseDouble(multNum_get);

                double a_double_final = a_res * multNum_double;
                double b_double_final = b_res * multNum_double;
                double c_double_final = c_res * multNum_double;
                double d_double_final = d_res * multNum_double;


                // converting the integers back to strings
                String a_final = String.valueOf(a_double_final);
                String b_final = String.valueOf(b_double_final);
                String c_final = String.valueOf(c_double_final);
                String d_final = String.valueOf(d_double_final);

                Intent intent = new Intent(twoBytwo.this, multBy_result_2x2_1.class);
                intent.putExtra("keyname13", a_final);
                intent.putExtra("keyname14", b_final);
                intent.putExtra("keyname15", c_final);
                intent.putExtra("keyname16", d_final);
                startActivity(intent);


            }
            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("")||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("")
                        ) {
                    Toast.makeText(twoBytwo.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-")||
                        power.getText().toString().equals("-")||
                        multNum.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+")||
                        power.getText().toString().equals("+")||
                        multNum.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (multNum.getText().toString().equals("+0") || multNum.getText().toString().equals("-0")) {
                    Toast.makeText(twoBytwo.this, "Zero cannot be positive or negative !", Toast.LENGTH_SHORT).show();
                }

                else if (multNum.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo.this, "Choose a number to multiply the Matrix with !", Toast.LENGTH_SHORT).show();
                }


                else {
                    multiplyBy_function();
                }
            }



        });

        // end of multiplyBy button function




        // divideBy function


        divideBy.setOnClickListener(new View.OnClickListener() {

            public void  divideBy_function() {

                // getting input and converting it into a string ..
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String power_input = power.getText().toString();

                // converting the input into integers
                double a_int = Double.parseDouble(a_input);
                double b_int = Double.parseDouble(b_input);
                double c_int = Double.parseDouble(c_input);
                double d_int = Double.parseDouble(d_input);
                double power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                double a_res = (double) Math.pow(a_int, power_int);
                double b_res = (double) Math.pow(b_int, power_int);
                double c_res = (double) Math.pow(c_int, power_int);
                double d_res = (double) Math.pow(d_int, power_int);

                String divideNum_get = divideNum.getText().toString();
                double divideNum_double = Double.parseDouble(divideNum_get);

                double a_double_final = a_res / divideNum_double;
                double b_double_final = b_res / divideNum_double;
                double c_double_final = c_res / divideNum_double;
                double d_double_final = d_res / divideNum_double;

                double a_final_rounded = (double) (Math.round(a_double_final*1000.0)/1000.0);
                double b_final_rounded = (double) (Math.round(b_double_final*1000.0)/1000.0);
                double c_final_rounded = (double) (Math.round(c_double_final*1000.0)/1000.0);
                double d_final_rounded = (double) (Math.round(d_double_final*1000.0)/1000.0);


                // converting the integers back to strings
                String a_final = String.valueOf(a_final_rounded);
                String b_final = String.valueOf(b_final_rounded);
                String c_final = String.valueOf(c_final_rounded);
                String d_final = String.valueOf(d_final_rounded);

                Intent intent = new Intent(twoBytwo.this, divideBy_result_2x2_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                startActivity(intent);


            }
            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("")||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("")

                ) {
                    Toast.makeText(twoBytwo.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (divideNum.getText().toString().equals("0")) {
                    Toast.makeText(twoBytwo.this, "You can't divide the matrix by zero !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-")||
                        power.getText().toString().equals("-")||
                        divideNum.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (divideNum.getText().toString().equals("+0") || divideNum.getText().toString().equals("-0")) {
                    Toast.makeText(twoBytwo.this, "Zero cannot be positive or negative !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+")||
                        power.getText().toString().equals("+")||
                        divideNum.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (divideNum.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo.this, "Choose a number to divide the Matrix with !", Toast.LENGTH_SHORT).show();
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
                String power_input = power.getText().toString();

                // converting the input into integers
                double a_int = Double.parseDouble(a_input);
                double b_int = Double.parseDouble(b_input);
                double c_int = Double.parseDouble(c_input);
                double d_int = Double.parseDouble(d_input);
                double power_int = Integer.parseInt(power_input);

                // applying the power on the integers
                double a_res = (double) Math.pow(a_int, power_int);
                double b_res = (double) Math.pow(b_int, power_int);
                double c_res = (double) Math.pow(c_int, power_int);
                double d_res = (double) Math.pow(d_int, power_int);

                double det = (a_res * d_res) - (b_res * c_res);
                double det_rounded = (double) (Math.round(det*1000.0)/1000.0);

                // converting the integers back to strings
                String det_final = String.valueOf(det_rounded);


                Intent intent = new Intent(twoBytwo.this, determinant_result_2x2_1.class);
                intent.putExtra("keyname1", det_final);
                startActivity(intent);


            }
            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("") ||
                        b.getText().toString().equals("")||
                        c.getText().toString().equals("") ||
                        d.getText().toString().equals("")

                ) {
                    Toast.makeText(twoBytwo.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(twoBytwo.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-")||
                        power.getText().toString().equals("-")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+")||
                        power.getText().toString().equals("+")) {
                    Toast.makeText(twoBytwo.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else {
                    determinant_function();
                }
            }



        });


        String a_result = getIntent().getStringExtra("keyname1");
        String b_result = getIntent().getStringExtra("keyname2");
        String c_result = getIntent().getStringExtra("keyname3");
        String d_result = getIntent().getStringExtra("keyname4");

        a.setText(a_result);
        b.setText(b_result);
        c.setText(c_result);
        d.setText(d_result);




    }
}