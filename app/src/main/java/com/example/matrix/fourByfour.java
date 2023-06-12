package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class fourByfour extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;
    protected EditText e;
    protected EditText f;
    protected EditText g;
    protected EditText h;
    protected EditText i;
    protected EditText j;
    protected EditText k;
    protected EditText l;
    protected EditText m;
    protected EditText n;
    protected EditText o;
    protected EditText p;
    protected EditText power;
    protected EditText multNum;
    protected EditText divideNum;
    protected Button calculate;
    protected Button transpose;
    protected Button multiplyBy;
    protected Button inverse;
    protected Button divideBy;
    protected Button determinant;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_byfour);
        getSupportActionBar().hide();


        calculate = (Button) findViewById(R.id.calculateButton_op);
        transpose = (Button) findViewById(R.id.transposeButton_op);
        multiplyBy = (Button) findViewById(R.id.multiplyByButton_op);
        inverse = (Button) findViewById(R.id.inverse_button);
        divideBy = (Button) findViewById(R.id.divideBy_button);
        determinant = (Button) findViewById(R.id.determinant_button);

        a = (EditText) findViewById(R.id.t1);
        b = (EditText) findViewById(R.id.t2);
        c = (EditText) findViewById(R.id.t3);
        d = (EditText) findViewById(R.id.t4);
        e = (EditText) findViewById(R.id.t5);
        f = (EditText) findViewById(R.id.t6);
        g = (EditText) findViewById(R.id.t7);
        h = (EditText) findViewById(R.id.t8);
        i = (EditText) findViewById(R.id.t9);
        j = (EditText) findViewById(R.id.t10);
        k = (EditText) findViewById(R.id.t11);
        l = (EditText) findViewById(R.id.t12);
        m = (EditText) findViewById(R.id.t13);
        n = (EditText) findViewById(R.id.t14);
        o = (EditText) findViewById(R.id.t15);
        p = (EditText) findViewById(R.id.t16);

        power = (EditText) findViewById(R.id.t_power);
        multNum = (EditText) findViewById(R.id.afp_mltp);
        divideNum = (EditText) findViewById(R.id.divideNumber);



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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();
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
                int j_int = Integer.parseInt(j_input);
                int k_int = Integer.parseInt(k_input);
                int l_int = Integer.parseInt(l_input);
                int m_int = Integer.parseInt(m_input);
                int n_int = Integer.parseInt(n_input);
                int o_int = Integer.parseInt(o_input);
                int p_int = Integer.parseInt(p_input);

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
                int j_res = (int) Math.pow(j_int, power_int);
                int k_res = (int) Math.pow(k_int, power_int);
                int l_res = (int) Math.pow(l_int, power_int);
                int m_res = (int) Math.pow(m_int, power_int);
                int n_res = (int) Math.pow(n_int, power_int);
                int o_res = (int) Math.pow(o_int, power_int);
                int p_res = (int) Math.pow(p_int, power_int);

                String a_final = String.valueOf(a_res);
                String b_final = String.valueOf(b_res);
                String c_final = String.valueOf(c_res);
                String d_final = String.valueOf(d_res);
                String e_final = String.valueOf(e_res);
                String f_final = String.valueOf(f_res);
                String g_final = String.valueOf(g_res);
                String h_final = String.valueOf(h_res);
                String i_final = String.valueOf(i_res);
                String j_final = String.valueOf(j_res);
                String k_final = String.valueOf(k_res);
                String l_final = String.valueOf(l_res);
                String m_final = String.valueOf(m_res);
                String n_final = String.valueOf(n_res);
                String o_final = String.valueOf(o_res);
                String p_final = String.valueOf(p_res);


                Intent intent = new Intent(fourByfour.this, calculate_result_4x4_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                intent.putExtra("keyname5", e_final);
                intent.putExtra("keyname6", f_final);
                intent.putExtra("keyname7", g_final);
                intent.putExtra("keyname8", h_final);
                intent.putExtra("keyname9", i_final);
                intent.putExtra("keyname10", j_final);
                intent.putExtra("keyname11", k_final);
                intent.putExtra("keyname12", l_final);
                intent.putExtra("keyname13", m_final);
                intent.putExtra("keyname14", n_final);
                intent.putExtra("keyname15", o_final);
                intent.putExtra("keyname16", p_final);
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
                        j.getText().toString().equals("") ||
                        k.getText().toString().equals("") ||
                        l.getText().toString().equals("") ||
                        m.getText().toString().equals("") ||
                        n.getText().toString().equals("") ||
                        o.getText().toString().equals("") ||
                        p.getText().toString().equals("")


                ) {

                    Toast.makeText(fourByfour.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-")||
                        b.getText().toString().equals("-") ||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        j.getText().toString().equals("-") ||
                        k.getText().toString().equals("-") ||
                        l.getText().toString().equals("-") ||
                        m.getText().toString().equals("-") ||
                        n.getText().toString().equals("-") ||
                        o.getText().toString().equals("-") ||
                        p.getText().toString().equals("-") ||
                        power.getText().toString().equals("-")


                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }



                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+") ||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        j.getText().toString().equals("+") ||
                        k.getText().toString().equals("+") ||
                        l.getText().toString().equals("+") ||
                        m.getText().toString().equals("+") ||
                        n.getText().toString().equals("+") ||
                        o.getText().toString().equals("+") ||
                        p.getText().toString().equals("+") ||
                        power.getText().toString().equals("+")


                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }



                else {
                    calculate_function();
                }
            }

                   // end of button calculate function


        });



        // end of button calculate function

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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

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
                int j_int = Integer.parseInt(j_input);
                int k_int = Integer.parseInt(k_input);
                int l_int = Integer.parseInt(l_input);
                int m_int = Integer.parseInt(m_input);
                int n_int = Integer.parseInt(n_input);
                int o_int = Integer.parseInt(o_input);
                int p_int = Integer.parseInt(p_input);
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
                int j_res = (int) Math.pow(j_int, power_int);
                int k_res = (int) Math.pow(k_int, power_int);
                int l_res = (int) Math.pow(l_int, power_int);
                int m_res = (int) Math.pow(m_int, power_int);
                int n_res = (int) Math.pow(n_int, power_int);
                int o_res = (int) Math.pow(o_int, power_int);
                int p_res = (int) Math.pow(p_int, power_int);

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
                String j_final = String.valueOf(j_res);
                String k_final = String.valueOf(k_res);
                String l_final = String.valueOf(l_res);
                String m_final = String.valueOf(m_res);
                String n_final = String.valueOf(n_res);
                String o_final = String.valueOf(o_res);
                String p_final = String.valueOf(p_res);

                Intent intent = new Intent(fourByfour.this, transpose_result_4x4_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                intent.putExtra("keyname5", e_final);
                intent.putExtra("keyname6", f_final);
                intent.putExtra("keyname7", g_final);
                intent.putExtra("keyname8", h_final);
                intent.putExtra("keyname9", i_final);
                intent.putExtra("keyname10", j_final);
                intent.putExtra("keyname11", k_final);
                intent.putExtra("keyname12", l_final);
                intent.putExtra("keyname13", m_final);
                intent.putExtra("keyname14", n_final);
                intent.putExtra("keyname15", o_final);
                intent.putExtra("keyname16", p_final);
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
                        j.getText().toString().equals("") ||
                        k.getText().toString().equals("") ||
                        l.getText().toString().equals("") ||
                        m.getText().toString().equals("") ||
                        n.getText().toString().equals("") ||
                        o.getText().toString().equals("") ||
                        p.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+") ||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        j.getText().toString().equals("+") ||
                        k.getText().toString().equals("+") ||
                        l.getText().toString().equals("+") ||
                        m.getText().toString().equals("+") ||
                        n.getText().toString().equals("+") ||
                        o.getText().toString().equals("+") ||
                        p.getText().toString().equals("+") ||
                        power.getText().toString().equals("+")


                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-") ||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        j.getText().toString().equals("-") ||
                        k.getText().toString().equals("-") ||
                        l.getText().toString().equals("-") ||
                        m.getText().toString().equals("-") ||
                        n.getText().toString().equals("-") ||
                        o.getText().toString().equals("-") ||
                        p.getText().toString().equals("-") ||
                        power.getText().toString().equals("-")


                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else {
                    transpose_function();
                }
            }





        });         // end of transpose button



        // multiply by button function


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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

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
                int j_int = Integer.parseInt(j_input);
                int k_int = Integer.parseInt(k_input);
                int l_int = Integer.parseInt(l_input);
                int m_int = Integer.parseInt(m_input);
                int n_int = Integer.parseInt(n_input);
                int o_int = Integer.parseInt(o_input);
                int p_int = Integer.parseInt(p_input);
                int power_int = Integer.parseInt(power_input);

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
                double j_res = (double) Math.pow(j_int, power_int);
                double k_res = (double) Math.pow(k_int, power_int);
                double l_res = (double) Math.pow(l_int, power_int);
                double m_res = (double) Math.pow(m_int, power_int);
                double n_res = (double) Math.pow(n_int, power_int);
                double o_res = (double) Math.pow(o_int, power_int);
                double p_res = (double) Math.pow(p_int, power_int);

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
                double j_double_final = j_res * multNum_double;
                double k_double_final = k_res * multNum_double;
                double l_double_final = l_res * multNum_double;
                double m_double_final = m_res * multNum_double;
                double n_double_final = n_res * multNum_double;
                double o_double_final = o_res * multNum_double;
                double p_double_final = p_res * multNum_double;


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
                String j_final = String.valueOf(j_double_final);
                String k_final = String.valueOf(k_double_final);
                String l_final = String.valueOf(l_double_final);
                String m_final = String.valueOf(m_double_final);
                String n_final = String.valueOf(n_double_final);
                String o_final = String.valueOf(o_double_final);
                String p_final = String.valueOf(p_double_final);

                Intent intent = new Intent(fourByfour.this, multBy_result_4x4_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                intent.putExtra("keyname5", e_final);
                intent.putExtra("keyname6", f_final);
                intent.putExtra("keyname7", g_final);
                intent.putExtra("keyname8", h_final);
                intent.putExtra("keyname9", i_final);
                intent.putExtra("keyname10", j_final);
                intent.putExtra("keyname11", k_final);
                intent.putExtra("keyname12", l_final);
                intent.putExtra("keyname13", m_final);
                intent.putExtra("keyname14", n_final);
                intent.putExtra("keyname15", o_final);
                intent.putExtra("keyname16", p_final);
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
                        j.getText().toString().equals("") ||
                        k.getText().toString().equals("") ||
                        l.getText().toString().equals("") ||
                        m.getText().toString().equals("") ||
                        n.getText().toString().equals("") ||
                        o.getText().toString().equals("") ||
                        p.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+") ||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        j.getText().toString().equals("+") ||
                        k.getText().toString().equals("+") ||
                        l.getText().toString().equals("+") ||
                        m.getText().toString().equals("+") ||
                        n.getText().toString().equals("+") ||
                        o.getText().toString().equals("+") ||
                        p.getText().toString().equals("+") ||
                        power.getText().toString().equals("+") ||
                        multNum.getText().toString().equals("+")


                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-") ||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        j.getText().toString().equals("-") ||
                        k.getText().toString().equals("-") ||
                        l.getText().toString().equals("-") ||
                        m.getText().toString().equals("-") ||
                        n.getText().toString().equals("-") ||
                        o.getText().toString().equals("-") ||
                        p.getText().toString().equals("-") ||
                        power.getText().toString().equals("-") ||
                        multNum.getText().toString().equals("-")


                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }



                else if (multNum.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Choose a number to multiply the Matrix with !", Toast.LENGTH_SHORT).show();
                }

                else if (multNum.getText().toString().equals("+0") || multNum.getText().toString().equals("-0")) {
                    Toast.makeText(fourByfour.this, "Zero cannot be positive or negative !", Toast.LENGTH_SHORT).show();
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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

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
                int j_int = Integer.parseInt(j_input);
                int k_int = Integer.parseInt(k_input);
                int l_int = Integer.parseInt(l_input);
                int m_int = Integer.parseInt(m_input);
                int n_int = Integer.parseInt(n_input);
                int o_int = Integer.parseInt(o_input);
                int p_int = Integer.parseInt(p_input);
                int power_int = Integer.parseInt(power_input);

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
                double j_res = (double) Math.pow(j_int, power_int);
                double k_res = (double) Math.pow(k_int, power_int);
                double l_res = (double) Math.pow(l_int, power_int);
                double m_res = (double) Math.pow(m_int, power_int);
                double n_res = (double) Math.pow(n_int, power_int);
                double o_res = (double) Math.pow(o_int, power_int);
                double p_res = (double) Math.pow(p_int, power_int);

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
                double j_double_final = j_res / divideNum_double;
                double k_double_final = k_res / divideNum_double;
                double l_double_final = l_res / divideNum_double;
                double m_double_final = m_res / divideNum_double;
                double n_double_final = n_res / divideNum_double;
                double o_double_final = o_res / divideNum_double;
                double p_double_final = p_res / divideNum_double;


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
                String j_final = String.valueOf(j_double_final);
                String k_final = String.valueOf(k_double_final);
                String l_final = String.valueOf(l_double_final);
                String m_final = String.valueOf(m_double_final);
                String n_final = String.valueOf(n_double_final);
                String o_final = String.valueOf(o_double_final);
                String p_final = String.valueOf(p_double_final);

                Intent intent = new Intent(fourByfour.this, divideBy_result_4x4_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                intent.putExtra("keyname5", e_final);
                intent.putExtra("keyname6", f_final);
                intent.putExtra("keyname7", g_final);
                intent.putExtra("keyname8", h_final);
                intent.putExtra("keyname9", i_final);
                intent.putExtra("keyname10", j_final);
                intent.putExtra("keyname11", k_final);
                intent.putExtra("keyname12", l_final);
                intent.putExtra("keyname13", m_final);
                intent.putExtra("keyname14", n_final);
                intent.putExtra("keyname15", o_final);
                intent.putExtra("keyname16", p_final);
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
                        j.getText().toString().equals("") ||
                        k.getText().toString().equals("") ||
                        l.getText().toString().equals("") ||
                        m.getText().toString().equals("") ||
                        n.getText().toString().equals("") ||
                        o.getText().toString().equals("") ||
                        p.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+") ||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        j.getText().toString().equals("+") ||
                        k.getText().toString().equals("+") ||
                        l.getText().toString().equals("+") ||
                        m.getText().toString().equals("+") ||
                        n.getText().toString().equals("+") ||
                        o.getText().toString().equals("+") ||
                        p.getText().toString().equals("+") ||
                        power.getText().toString().equals("+") ||
                        divideNum.getText().toString().equals("+")


                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-") ||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        j.getText().toString().equals("-") ||
                        k.getText().toString().equals("-") ||
                        l.getText().toString().equals("-") ||
                        m.getText().toString().equals("-") ||
                        n.getText().toString().equals("-") ||
                        o.getText().toString().equals("-") ||
                        p.getText().toString().equals("-") ||
                        power.getText().toString().equals("-") ||
                        divideNum.getText().toString().equals("-")) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }

                else if (divideNum.getText().toString().equals("0")) {
                    Toast.makeText(fourByfour.this, "You can't divide the matrix by zero !", Toast.LENGTH_SHORT).show();
                }



                else if (divideNum.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Choose a number to multiply the Matrix with !", Toast.LENGTH_SHORT).show();
                }

                else if (divideNum.getText().toString().equals("+0") || divideNum.getText().toString().equals("-0")) {
                    Toast.makeText(fourByfour.this, "Zero cannot be positive or negative !", Toast.LENGTH_SHORT).show();
                }


                else {
                    divideBy_function();
                }
            }



        });


        // end of divideBy function

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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

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
                int j_int = Integer.parseInt(j_input);
                int k_int = Integer.parseInt(k_input);
                int l_int = Integer.parseInt(l_input);
                int m_int = Integer.parseInt(m_input);
                int n_int = Integer.parseInt(n_input);
                int o_int = Integer.parseInt(o_input);
                int p_int = Integer.parseInt(p_input);
                int power_int = Integer.parseInt(power_input);

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
                double j_res = (double) Math.pow(j_int, power_int);
                double k_res = (double) Math.pow(k_int, power_int);
                double l_res = (double) Math.pow(l_int, power_int);
                double m_res = (double) Math.pow(m_int, power_int);
                double n_res = (double) Math.pow(n_int, power_int);
                double o_res = (double) Math.pow(o_int, power_int);
                double p_res = (double) Math.pow(p_int, power_int);



                double a  = (f_res * k_res * p_res) - (f_res * l_res * o_res) - (j_res * g_res * p_res) + (j_res * h_res * o_res) + (n_res * g_res * l_res) - (n_res * h_res * k_res);
                double b  = -(b_res * k_res * p_res) + (b_res * l_res * o_res) + (j_res * c_res * p_res) - (j_res * d_res * o_res) - (n_res * c_res * l_res) + (n_res * d_res * k_res);
                double c  = (b_res * g_res * p_res) - (b_res * h_res * o_res) - (f_res * c_res * p_res) + (f_res * d_res * o_res) + (n_res * c_res * h_res) - (n_res * d_res * g_res);
                double d  = -(b_res * g_res * l_res) + (b_res * h_res * k_res) + (f_res * c_res * l_res) - (f_res * d_res * k_res) - (j_res * c_res * h_res) + (j_res * d_res * g_res);

                double e  = -(e_res * k_res * p_res) + (e_res * l_res * o_res) + (i_res * g_res * p_res) - (i_res * h_res * o_res) - (m_res * g_res * l_res) + (m_res * h_res * k_res);
                double f  = (a_res * k_res * p_res) - (a_res * l_res * o_res) - (i_res * c_res * p_res) + (i_res * d_res * o_res) + (m_res * c_res * l_res) - (m_res * d_res * k_res);
                double g  = -(a_res * g_res * p_res) + (a_res * h_res * o_res) + (e_res * c_res * p_res) - (e_res * d_res * o_res) - (m_res * c_res * h_res) + (m_res * d_res * g_res);
                double h  = (a_res * g_res * l_res) - (a_res * h_res * k_res) - (e_res * c_res * l_res) + (e_res * d_res * k_res) + (i_res * c_res * h_res) - (i_res * d_res * g_res);

                double i  = (e_res * j_res * p_res) - (e_res * l_res * n_res) - (i_res * f_res * p_res) + (i_res * h_res * n_res) + (m_res * f_res * l_res) - (m_res * h_res * j_res);
                double j  = -(a_res * j_res * p_res) + (a_res * l_res * n_res) + (i_res * b_res * p_res) - (i_res * d_res * n_res) - (m_res * b_res * l_res) + (m_res * d_res * j_res);
                double k  = (a_res * f_res * p_res) - (a_res * h_res * n_res) - (e_res * b_res * p_res) + (e_res * d_res * n_res) + (m_res * b_res * h_res) - (m_res * d_res * f_res);
                double l  = -(a_res * f_res * l_res) + (a_res * h_res * j_res) + (e_res * b_res * l_res) - (e_res * d_res * j_res) - (i_res * b_res * h_res) + (i_res * d_res * f_res);

                double m  = -(e_res * j_res * o_res) + (e_res * k_res * n_res) + (i_res * f_res * o_res) - (i_res * g_res * n_res) - (m_res * f_res * k_res) + (m_res * g_res * j_res);
                double n  = (a_res * j_res * o_res) - (a_res * k_res * n_res) - (i_res * b_res * o_res) + (i_res * c_res * n_res) + (m_res * b_res * k_res) - (m_res * c_res * j_res);
                double o  = -(a_res * f_res * o_res) + (a_res * g_res * n_res) + (e_res * b_res * o_res) - (e_res * c_res * n_res) - (m_res * b_res * g_res) + (m_res * c_res * f_res);
                double p  = (a_res * f_res * k_res) - (a_res * g_res * j_res) - (e_res * b_res * l_res) + (e_res * c_res * j_res) + (i_res * b_res * g_res) - (i_res * c_res * f_res);

                double final_result_double = (a_res * a) + (b_res * e) + (c_res * i) + (d_res * m);


                // converting the integers back to strings
                String final_result = String.valueOf(final_result_double);



                Intent intent = new Intent(fourByfour.this, determinant_result_4x4_1.class);
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
                        i.getText().toString().equals("") ||
                        j.getText().toString().equals("") ||
                        k.getText().toString().equals("") ||
                        l.getText().toString().equals("") ||
                        m.getText().toString().equals("") ||
                        n.getText().toString().equals("") ||
                        o.getText().toString().equals("") ||
                        p.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }




                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+") ||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        j.getText().toString().equals("+") ||
                        k.getText().toString().equals("+") ||
                        l.getText().toString().equals("+") ||
                        m.getText().toString().equals("+") ||
                        n.getText().toString().equals("+") ||
                        o.getText().toString().equals("+") ||
                        p.getText().toString().equals("+") ||
                        power.getText().toString().equals("+")



                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-") ||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        j.getText().toString().equals("-") ||
                        k.getText().toString().equals("-") ||
                        l.getText().toString().equals("-") ||
                        m.getText().toString().equals("-") ||
                        n.getText().toString().equals("-") ||
                        o.getText().toString().equals("-") ||
                        p.getText().toString().equals("-") ||
                        power.getText().toString().equals("-")
                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }




                else {
                    determinant_function();
                }
            }



        });



        // end of determinant function




        // inverse function


        inverse.setOnClickListener(new View.OnClickListener() {


            public void  inverse_function() {

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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

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
                int j_int = Integer.parseInt(j_input);
                int k_int = Integer.parseInt(k_input);
                int l_int = Integer.parseInt(l_input);
                int m_int = Integer.parseInt(m_input);
                int n_int = Integer.parseInt(n_input);
                int o_int = Integer.parseInt(o_input);
                int p_int = Integer.parseInt(p_input);
                int power_int = Integer.parseInt(power_input);

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
                double j_res = (double) Math.pow(j_int, power_int);
                double k_res = (double) Math.pow(k_int, power_int);
                double l_res = (double) Math.pow(l_int, power_int);
                double m_res = (double) Math.pow(m_int, power_int);
                double n_res = (double) Math.pow(n_int, power_int);
                double o_res = (double) Math.pow(o_int, power_int);
                double p_res = (double) Math.pow(p_int, power_int);



                double a  = (f_res * k_res * p_res) - (f_res * l_res * o_res) - (j_res * g_res * p_res) + (j_res * h_res * o_res) + (n_res * g_res * l_res) - (n_res * h_res * k_res);
                double b  = -(b_res * k_res * p_res) + (b_res * l_res * o_res) + (j_res * c_res * p_res) - (j_res * d_res * o_res) - (n_res * c_res * l_res) + (n_res * d_res * k_res);
                double c  = (b_res * g_res * p_res) - (b_res * h_res * o_res) - (f_res * c_res * p_res) + (f_res * d_res * o_res) + (n_res * c_res * h_res) - (n_res * d_res * g_res);
                double d  = -(b_res * g_res * l_res) + (b_res * h_res * k_res) + (f_res * c_res * l_res) - (f_res * d_res * k_res) - (j_res * c_res * h_res) + (j_res * d_res * g_res);

                double e  = -(e_res * k_res * p_res) + (e_res * l_res * o_res) + (i_res * g_res * p_res) - (i_res * h_res * o_res) - (m_res * g_res * l_res) + (m_res * h_res * k_res);
                double f  = (a_res * k_res * p_res) - (a_res * l_res * o_res) - (i_res * c_res * p_res) + (i_res * d_res * o_res) + (m_res * c_res * l_res) - (m_res * d_res * k_res);
                double g  = -(a_res * g_res * p_res) + (a_res * h_res * o_res) + (e_res * c_res * p_res) - (e_res * d_res * o_res) - (m_res * c_res * h_res) + (m_res * d_res * g_res);
                double h  = (a_res * g_res * l_res) - (a_res * h_res * k_res) - (e_res * c_res * l_res) + (e_res * d_res * k_res) + (i_res * c_res * h_res) - (i_res * d_res * g_res);

                double i  = (e_res * j_res * p_res) - (e_res * l_res * n_res) - (i_res * f_res * p_res) + (i_res * h_res * n_res) + (m_res * f_res * l_res) - (m_res * h_res * j_res);
                double j  = -(a_res * j_res * p_res) + (a_res * l_res * n_res) + (i_res * b_res * p_res) - (i_res * d_res * n_res) - (m_res * b_res * l_res) + (m_res * d_res * j_res);
                double k  = (a_res * f_res * p_res) - (a_res * h_res * n_res) - (e_res * b_res * p_res) + (e_res * d_res * n_res) + (m_res * b_res * h_res) - (m_res * d_res * f_res);
                double l  = -(a_res * f_res * l_res) + (a_res * h_res * j_res) + (e_res * b_res * l_res) - (e_res * d_res * j_res) - (i_res * b_res * h_res) + (i_res * d_res * f_res);

                double m  = -(e_res * j_res * o_res) + (e_res * k_res * n_res) + (i_res * f_res * o_res) - (i_res * g_res * n_res) - (m_res * f_res * k_res) + (m_res * g_res * j_res);
                double n  = (a_res * j_res * o_res) - (a_res * k_res * n_res) - (i_res * b_res * o_res) + (i_res * c_res * n_res) + (m_res * b_res * k_res) - (m_res * c_res * j_res);
                double o  = -(a_res * f_res * o_res) + (a_res * g_res * n_res) + (e_res * b_res * o_res) - (e_res * c_res * n_res) - (m_res * b_res * g_res) + (m_res * c_res * f_res);
                double p  = (a_res * f_res * k_res) - (a_res * g_res * j_res) - (e_res * b_res * k_res) + (e_res * c_res * j_res) + (i_res * b_res * g_res) - (i_res * c_res * f_res);

                double det = (a_res * a) + (b_res * e) + (c_res * i) + (d_res * m);
                det = 1 / det;

                a = a * det;
                b = b * det;
                c = c * det;
                d = d * det;
                e = e * det;
                f = f * det;
                g = g * det;
                h = h * det;
                i = i * det;
                j = j * det;
                k = k * det;
                l = l * det;
                m = m * det;
                n = n * det;
                o = o * det;
                p = p * det;


                String a_final = String.valueOf(a);
                String b_final = String.valueOf(b);
                String c_final = String.valueOf(c);
                String d_final = String.valueOf(d);
                String e_final = String.valueOf(e);
                String f_final = String.valueOf(f);
                String g_final = String.valueOf(g);
                String h_final = String.valueOf(h);
                String i_final = String.valueOf(i);
                String j_final = String.valueOf(j);
                String k_final = String.valueOf(k);
                String l_final = String.valueOf(l);
                String m_final = String.valueOf(m);
                String n_final = String.valueOf(n);
                String o_final = String.valueOf(o);
                String p_final = String.valueOf(p);

                Intent intent = new Intent(fourByfour.this, inverse_result_4x4_1.class);
                intent.putExtra("keyname1", a_final);
                intent.putExtra("keyname2", b_final);
                intent.putExtra("keyname3", c_final);
                intent.putExtra("keyname4", d_final);
                intent.putExtra("keyname5", e_final);
                intent.putExtra("keyname6", f_final);
                intent.putExtra("keyname7", g_final);
                intent.putExtra("keyname8", h_final);
                intent.putExtra("keyname9", i_final);
                intent.putExtra("keyname10", j_final);
                intent.putExtra("keyname11", k_final);
                intent.putExtra("keyname12", l_final);
                intent.putExtra("keyname13", m_final);
                intent.putExtra("keyname14", n_final);
                intent.putExtra("keyname15", o_final);
                intent.putExtra("keyname16", p_final);

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
                        j.getText().toString().equals("") ||
                        k.getText().toString().equals("") ||
                        l.getText().toString().equals("") ||
                        m.getText().toString().equals("") ||
                        n.getText().toString().equals("") ||
                        o.getText().toString().equals("") ||
                        p.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                } else if (power.getText().toString().equals("")) {
                    Toast.makeText(fourByfour.this, "Power cannot be null !", Toast.LENGTH_SHORT).show();
                }




                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+") ||
                        c.getText().toString().equals("+") ||
                        d.getText().toString().equals("+") ||
                        e.getText().toString().equals("+") ||
                        f.getText().toString().equals("+") ||
                        g.getText().toString().equals("+") ||
                        h.getText().toString().equals("+") ||
                        i.getText().toString().equals("+") ||
                        j.getText().toString().equals("+") ||
                        k.getText().toString().equals("+") ||
                        l.getText().toString().equals("+") ||
                        m.getText().toString().equals("+") ||
                        n.getText().toString().equals("+") ||
                        o.getText().toString().equals("+") ||
                        p.getText().toString().equals("+") ||
                        power.getText().toString().equals("+")



                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-") ||
                        c.getText().toString().equals("-") ||
                        d.getText().toString().equals("-") ||
                        e.getText().toString().equals("-") ||
                        f.getText().toString().equals("-") ||
                        g.getText().toString().equals("-") ||
                        h.getText().toString().equals("-") ||
                        i.getText().toString().equals("-") ||
                        j.getText().toString().equals("-") ||
                        k.getText().toString().equals("-") ||
                        l.getText().toString().equals("-") ||
                        m.getText().toString().equals("-") ||
                        n.getText().toString().equals("-") ||
                        o.getText().toString().equals("-") ||
                        p.getText().toString().equals("-") ||
                        power.getText().toString().equals("-")
                ) {

                    Toast.makeText(fourByfour.this, "Invalid input !", Toast.LENGTH_SHORT).show();
                }




                else {
                    inverse_function();
                }
            }



        });



    }

}