package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class threeBythree_for_two extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;
    protected EditText e;
    protected EditText f;
    protected EditText g;
    protected EditText h;
    protected EditText i;
    protected EditText a1;
    protected EditText b1;
    protected EditText c1;
    protected EditText d1;
    protected EditText e1;
    protected EditText f1;
    protected EditText g1;
    protected EditText h1;
    protected EditText i1;

    protected Button add;
    protected Button subtract;
    protected Button multiply;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_bythree_for_two);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.g1);
        b = (EditText) findViewById(R.id.g2);
        c = (EditText) findViewById(R.id.g3);
        d = (EditText) findViewById(R.id.g4);
        e = (EditText) findViewById(R.id.g5);
        f = (EditText) findViewById(R.id.g6);
        g = (EditText) findViewById(R.id.g7);
        h = (EditText) findViewById(R.id.g8);
        i = (EditText) findViewById(R.id.g9);
        a1 = (EditText) findViewById(R.id.g10);
        b1 = (EditText) findViewById(R.id.g11);
        c1 = (EditText) findViewById(R.id.g12);
        d1 = (EditText) findViewById(R.id.g13);
        e1 = (EditText) findViewById(R.id.g14);
        f1 = (EditText) findViewById(R.id.g15);
        g1 = (EditText) findViewById(R.id.g16);
        h1 = (EditText) findViewById(R.id.g17);
        i1 = (EditText) findViewById(R.id.g18);

        add = (Button) findViewById(R.id.add_button);
        subtract = (Button) findViewById(R.id.subtract_button);
        multiply = (Button) findViewById(R.id.multiply_button);




        add.setOnClickListener(new View.OnClickListener() {

            public void add() {
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();
                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();
                String e1_input = e1.getText().toString();
                String f1_input = f1.getText().toString();
                String g1_input = g1.getText().toString();
                String h1_input = h1.getText().toString();
                String i1_input = i1.getText().toString();

                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int e_int = Integer.parseInt(e_input);
                int f_int = Integer.parseInt(f_input);
                int g_int = Integer.parseInt(g_input);
                int h_int = Integer.parseInt(h_input);
                int i_int = Integer.parseInt(i_input);
                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);
                int e1_int = Integer.parseInt(e1_input);
                int f1_int = Integer.parseInt(f1_input);
                int g1_int = Integer.parseInt(g1_input);
                int h1_int = Integer.parseInt(h1_input);
                int i1_int = Integer.parseInt(i1_input);

                double a_final = a_int + a1_int;
                double b_final = b_int + b1_int;
                double c_final = c_int + c1_int;
                double d_final = d_int + d1_int;
                double e_final = e_int + e1_int;
                double f_final = f_int + f1_int;
                double g_final = g_int + g1_int;
                double h_final = h_int + h1_int;
                double i_final = i_int + i1_int;

                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);
                String e_result = String.valueOf(e_final);
                String f_result = String.valueOf(f_final);
                String g_result = String.valueOf(g_final);
                String h_result = String.valueOf(h_final);
                String i_result = String.valueOf(i_final);


                Intent intent = new Intent(threeBythree_for_two.this, add_result_3x3_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                intent.putExtra("keyname5", e_result);
                intent.putExtra("keyname6", f_result);
                intent.putExtra("keyname7", g_result);
                intent.putExtra("keyname8", h_result);
                intent.putExtra("keyname9", i_result);
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
                        i.getText().toString().equals("") ||
                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("") ||
                        e1.getText().toString().equals("") ||
                        f1.getText().toString().equals("") ||
                        g1.getText().toString().equals("") ||
                        h1.getText().toString().equals("") ||
                        i1.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-")  ||
                        c1.getText().toString().equals("-")  ||
                        d1.getText().toString().equals("-") ||
                        e1.getText().toString().equals("-") ||
                        f1.getText().toString().equals("-") ||
                        g1.getText().toString().equals("-") ||
                        h1.getText().toString().equals("-") ||
                        i1.getText().toString().equals("-") ) {
                    Toast.makeText(threeBythree_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+")  ||
                        c1.getText().toString().equals("+")  ||
                        d1.getText().toString().equals("+") ||
                        e1.getText().toString().equals("+") ||
                        f1.getText().toString().equals("+") ||
                        g1.getText().toString().equals("+") ||
                        h1.getText().toString().equals("+") ||
                        i1.getText().toString().equals("+") ) {
                    Toast.makeText(threeBythree_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else {
                    add();
                }

            }
        });         // end of add function



        // subtraction function

        subtract.setOnClickListener(new View.OnClickListener() {

            public void subtract() {
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();
                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();
                String e1_input = e1.getText().toString();
                String f1_input = f1.getText().toString();
                String g1_input = g1.getText().toString();
                String h1_input = h1.getText().toString();
                String i1_input = i1.getText().toString();

                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int e_int = Integer.parseInt(e_input);
                int f_int = Integer.parseInt(f_input);
                int g_int = Integer.parseInt(g_input);
                int h_int = Integer.parseInt(h_input);
                int i_int = Integer.parseInt(i_input);
                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);
                int e1_int = Integer.parseInt(e1_input);
                int f1_int = Integer.parseInt(f1_input);
                int g1_int = Integer.parseInt(g1_input);
                int h1_int = Integer.parseInt(h1_input);
                int i1_int = Integer.parseInt(i1_input);

                double a_final = a_int - a1_int;
                double b_final = b_int - b1_int;
                double c_final = c_int - c1_int;
                double d_final = d_int - d1_int;
                double e_final = e_int - e1_int;
                double f_final = f_int - f1_int;
                double g_final = g_int - g1_int;
                double h_final = h_int - h1_int;
                double i_final = i_int - i1_int;

                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);
                String e_result = String.valueOf(e_final);
                String f_result = String.valueOf(f_final);
                String g_result = String.valueOf(g_final);
                String h_result = String.valueOf(h_final);
                String i_result = String.valueOf(i_final);


                Intent intent = new Intent(threeBythree_for_two.this, add_result_3x3_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                intent.putExtra("keyname5", e_result);
                intent.putExtra("keyname6", f_result);
                intent.putExtra("keyname7", g_result);
                intent.putExtra("keyname8", h_result);
                intent.putExtra("keyname9", i_result);
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
                        i.getText().toString().equals("") ||
                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("") ||
                        e1.getText().toString().equals("") ||
                        f1.getText().toString().equals("") ||
                        g1.getText().toString().equals("") ||
                        h1.getText().toString().equals("") ||
                        i1.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-")  ||
                        c1.getText().toString().equals("-")  ||
                        d1.getText().toString().equals("-") ||
                        e1.getText().toString().equals("-") ||
                        f1.getText().toString().equals("-") ||
                        g1.getText().toString().equals("-") ||
                        h1.getText().toString().equals("-") ||
                        i1.getText().toString().equals("-") ) {
                    Toast.makeText(threeBythree_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+")  ||
                        c1.getText().toString().equals("+")  ||
                        d1.getText().toString().equals("+") ||
                        e1.getText().toString().equals("+") ||
                        f1.getText().toString().equals("+") ||
                        g1.getText().toString().equals("+") ||
                        h1.getText().toString().equals("+") ||
                        i1.getText().toString().equals("+") ) {
                    Toast.makeText(threeBythree_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }



                else {
                    subtract();
                }

            }
        });             // end of subtraction function



        multiply.setOnClickListener(new View.OnClickListener() {

            public void multiply() {
                String a_input = a.getText().toString();
                String b_input = b.getText().toString();
                String c_input = c.getText().toString();
                String d_input = d.getText().toString();
                String e_input = e.getText().toString();
                String f_input = f.getText().toString();
                String g_input = g.getText().toString();
                String h_input = h.getText().toString();
                String i_input = i.getText().toString();
                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();
                String e1_input = e1.getText().toString();
                String f1_input = f1.getText().toString();
                String g1_input = g1.getText().toString();
                String h1_input = h1.getText().toString();
                String i1_input = i1.getText().toString();

                int a_int = Integer.parseInt(a_input);
                int b_int = Integer.parseInt(b_input);
                int c_int = Integer.parseInt(c_input);
                int d_int = Integer.parseInt(d_input);
                int e_int = Integer.parseInt(e_input);
                int f_int = Integer.parseInt(f_input);
                int g_int = Integer.parseInt(g_input);
                int h_int = Integer.parseInt(h_input);
                int i_int = Integer.parseInt(i_input);
                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);
                int e1_int = Integer.parseInt(e1_input);
                int f1_int = Integer.parseInt(f1_input);
                int g1_int = Integer.parseInt(g1_input);
                int h1_int = Integer.parseInt(h1_input);
                int i1_int = Integer.parseInt(i1_input);

                double a_final = (a_int * a1_int) + (b_int * d1_int) + (c_int * g1_int);
                double b_final = (a_int * b1_int) + (b_int * e1_int) + (c_int * h1_int);
                double c_final = (a_int * c1_int) + (b_int * f1_int) + (c_int * i1_int);
                double d_final = (d_int * a1_int) + (e_int * d1_int) + (f_int * g1_int);
                double e_final = (d_int * b1_int) + (e_int * e1_int) + (f_int * h1_int);
                double f_final = (d_int * c1_int) + (e_int * f1_int) + (f_int * i1_int);
                double g_final = (g_int * a1_int) + (h_int * d1_int) + (i_int * g1_int);
                double h_final = (g_int * b1_int) + (h_int * e1_int) + (i_int * h1_int);
                double i_final = (g_int * c1_int) + (h_int * f1_int) + (i_int * i1_int);

                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);
                String e_result = String.valueOf(e_final);
                String f_result = String.valueOf(f_final);
                String g_result = String.valueOf(g_final);
                String h_result = String.valueOf(h_final);
                String i_result = String.valueOf(i_final);


                Intent intent = new Intent(threeBythree_for_two.this, multuply_result_3x3_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                intent.putExtra("keyname5", e_result);
                intent.putExtra("keyname6", f_result);
                intent.putExtra("keyname7", g_result);
                intent.putExtra("keyname8", h_result);
                intent.putExtra("keyname9", i_result);
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
                        i.getText().toString().equals("") ||
                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("") ||
                        e1.getText().toString().equals("") ||
                        f1.getText().toString().equals("") ||
                        g1.getText().toString().equals("") ||
                        h1.getText().toString().equals("") ||
                        i1.getText().toString().equals("")

                ) {

                    Toast.makeText(threeBythree_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-")  ||
                        c1.getText().toString().equals("-")  ||
                        d1.getText().toString().equals("-") ||
                        e1.getText().toString().equals("-") ||
                        f1.getText().toString().equals("-") ||
                        g1.getText().toString().equals("-") ||
                        h1.getText().toString().equals("-") ||
                        i1.getText().toString().equals("-") ) {
                    Toast.makeText(threeBythree_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+")  ||
                        c1.getText().toString().equals("+")  ||
                        d1.getText().toString().equals("+") ||
                        e1.getText().toString().equals("+") ||
                        f1.getText().toString().equals("+") ||
                        g1.getText().toString().equals("+") ||
                        h1.getText().toString().equals("+") ||
                        i1.getText().toString().equals("+") ) {
                    Toast.makeText(threeBythree_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }


                else {
                    multiply();
                }

            }
        });



    }
}