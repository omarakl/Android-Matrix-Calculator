package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class fourByfour_for_two extends AppCompatActivity {

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

    protected EditText a1;
    protected EditText b1;
    protected EditText c1;
    protected EditText d1;
    protected EditText e1;
    protected EditText f1;
    protected EditText g1;
    protected EditText h1;
    protected EditText i1;
    protected EditText j1;
    protected EditText k1;
    protected EditText l1;
    protected EditText m1;
    protected EditText n1;
    protected EditText o1;
    protected EditText p1;


    protected Button add;
    protected Button subtract;
    protected Button multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_byfour_for_two);
        getSupportActionBar().hide();

        add = (Button) findViewById(R.id.add_button);
        subtract = (Button) findViewById(R.id.subtract_button);
        multiply = (Button) findViewById(R.id.multiply_button);

        a = (EditText) findViewById(R.id.c1);
        b = (EditText) findViewById(R.id.c2);
        c = (EditText) findViewById(R.id.c3);
        d = (EditText) findViewById(R.id.c4);
        e = (EditText) findViewById(R.id.c5);
        f = (EditText) findViewById(R.id.c6);
        g = (EditText) findViewById(R.id.c7);
        h = (EditText) findViewById(R.id.c8);
        i = (EditText) findViewById(R.id.c9);
        j = (EditText) findViewById(R.id.c10);
        k = (EditText) findViewById(R.id.c11);
        l = (EditText) findViewById(R.id.c12);
        m = (EditText) findViewById(R.id.c13);
        n = (EditText) findViewById(R.id.c14);
        o = (EditText) findViewById(R.id.c15);
        p = (EditText) findViewById(R.id.c16);

        a1 = (EditText) findViewById(R.id.c17);
        b1 = (EditText) findViewById(R.id.c18);
        c1 = (EditText) findViewById(R.id.c19);
        d1 = (EditText) findViewById(R.id.c20);
        e1 = (EditText) findViewById(R.id.c21);
        f1 = (EditText) findViewById(R.id.c22);
        g1 = (EditText) findViewById(R.id.c23);
        h1 = (EditText) findViewById(R.id.c24);
        i1 = (EditText) findViewById(R.id.c25);
        j1 = (EditText) findViewById(R.id.c26);
        k1 = (EditText) findViewById(R.id.c27);
        l1 = (EditText) findViewById(R.id.c28);
        m1 = (EditText) findViewById(R.id.c29);
        n1 = (EditText) findViewById(R.id.c30);
        o1 = (EditText) findViewById(R.id.c31);
        p1 = (EditText) findViewById(R.id.c32);



        // add function


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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();
                String e1_input = e1.getText().toString();
                String f1_input = f1.getText().toString();
                String g1_input = g1.getText().toString();
                String h1_input = h1.getText().toString();
                String i1_input = i1.getText().toString();
                String j1_input = j1.getText().toString();
                String k1_input = k1.getText().toString();
                String l1_input = l1.getText().toString();
                String m1_input = m1.getText().toString();
                String n1_input = n1.getText().toString();
                String o1_input = o1.getText().toString();
                String p1_input = p1.getText().toString();


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

                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);
                int e1_int = Integer.parseInt(e1_input);
                int f1_int = Integer.parseInt(f1_input);
                int g1_int = Integer.parseInt(g1_input);
                int h1_int = Integer.parseInt(h1_input);
                int i1_int = Integer.parseInt(i1_input);
                int j1_int = Integer.parseInt(j1_input);
                int k1_int = Integer.parseInt(k1_input);
                int l1_int = Integer.parseInt(l1_input);
                int m1_int = Integer.parseInt(m1_input);
                int n1_int = Integer.parseInt(n1_input);
                int o1_int = Integer.parseInt(o1_input);
                int p1_int = Integer.parseInt(p1_input);




                double a_final = a_int + a1_int;
                double b_final = b_int + b1_int;
                double c_final = c_int + c1_int;
                double d_final = d_int + d1_int;
                double e_final = e_int + e1_int;
                double f_final = f_int + f1_int;
                double g_final = g_int + g1_int;
                double h_final = h_int + h1_int;
                double i_final = i_int + i1_int;
                double j_final = j_int + j1_int;
                double k_final = k_int + k1_int;
                double l_final = l_int + l1_int;
                double m_final = m_int + m1_int;
                double n_final = n_int + n1_int;
                double o_final = o_int + o1_int;
                double p_final = p_int + p1_int;



                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);
                String e_result = String.valueOf(e_final);
                String f_result = String.valueOf(f_final);
                String g_result = String.valueOf(g_final);
                String h_result = String.valueOf(h_final);
                String i_result = String.valueOf(i_final);
                String j_result = String.valueOf(j_final);
                String k_result = String.valueOf(k_final);
                String l_result = String.valueOf(l_final);
                String m_result = String.valueOf(m_final);
                String n_result = String.valueOf(n_final);
                String o_result = String.valueOf(o_final);
                String p_result = String.valueOf(p_final);


                Intent intent = new Intent(fourByfour_for_two.this, add_result_4x4_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                intent.putExtra("keyname5", e_result);
                intent.putExtra("keyname6", f_result);
                intent.putExtra("keyname7", g_result);
                intent.putExtra("keyname8", h_result);
                intent.putExtra("keyname9", i_result);
                intent.putExtra("keyname10", j_result);
                intent.putExtra("keyname11", k_result);
                intent.putExtra("keyname12", l_result);
                intent.putExtra("keyname13", m_result);
                intent.putExtra("keyname14", n_result);
                intent.putExtra("keyname15", o_result);
                intent.putExtra("keyname16", p_result);
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
                        p.getText().toString().equals("") ||


                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("") ||
                        e1.getText().toString().equals("") ||
                        f1.getText().toString().equals("") ||
                        g1.getText().toString().equals("") ||
                        h1.getText().toString().equals("") ||
                        i1.getText().toString().equals("") ||
                        j1.getText().toString().equals("") ||
                        k1.getText().toString().equals("") ||
                        l1.getText().toString().equals("") ||
                        m1.getText().toString().equals("") ||
                        n1.getText().toString().equals("") ||
                        o1.getText().toString().equals("") ||
                        p1.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }



                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-")  ||
                        e.getText().toString().equals("-")  ||
                        f.getText().toString().equals("-")  ||
                        g.getText().toString().equals("-")  ||
                        h.getText().toString().equals("-")  ||
                        i.getText().toString().equals("-")  ||
                        j.getText().toString().equals("-")  ||
                        k.getText().toString().equals("-")  ||
                        l.getText().toString().equals("-")  ||
                        m.getText().toString().equals("-")  ||
                        n.getText().toString().equals("-")  ||
                        o.getText().toString().equals("-")  ||
                        p.getText().toString().equals("-")  ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-") ||
                        c1.getText().toString().equals("-") ||
                        d1.getText().toString().equals("-") ||
                        e1.getText().toString().equals("-") ||
                        f1.getText().toString().equals("-") ||
                        g1.getText().toString().equals("-") ||
                        h1.getText().toString().equals("-") ||
                        i1.getText().toString().equals("-") ||
                        j1.getText().toString().equals("-") ||
                        k1.getText().toString().equals("-") ||
                        l1.getText().toString().equals("-") ||
                        m1.getText().toString().equals("-") ||
                        n1.getText().toString().equals("-") ||
                        o1.getText().toString().equals("-") ||
                        p1.getText().toString().equals("-") ) {
                    Toast.makeText(fourByfour_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+")  ||
                        e.getText().toString().equals("+")  ||
                        f.getText().toString().equals("+")  ||
                        g.getText().toString().equals("+")  ||
                        h.getText().toString().equals("+")  ||
                        i.getText().toString().equals("+")  ||
                        j.getText().toString().equals("+")  ||
                        k.getText().toString().equals("+")  ||
                        l.getText().toString().equals("+")  ||
                        m.getText().toString().equals("+")  ||
                        n.getText().toString().equals("+")  ||
                        o.getText().toString().equals("+")  ||
                        p.getText().toString().equals("+")  ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+") ||
                        c1.getText().toString().equals("+") ||
                        d1.getText().toString().equals("+") ||
                        e1.getText().toString().equals("+") ||
                        f1.getText().toString().equals("+") ||
                        g1.getText().toString().equals("+") ||
                        h1.getText().toString().equals("+") ||
                        i1.getText().toString().equals("+") ||
                        j1.getText().toString().equals("+") ||
                        k1.getText().toString().equals("+") ||
                        l1.getText().toString().equals("+") ||
                        m1.getText().toString().equals("+") ||
                        n1.getText().toString().equals("+") ||
                        o1.getText().toString().equals("+") ||
                        p1.getText().toString().equals("+") ) {
                    Toast.makeText(fourByfour_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();
                String e1_input = e1.getText().toString();
                String f1_input = f1.getText().toString();
                String g1_input = g1.getText().toString();
                String h1_input = h1.getText().toString();
                String i1_input = i1.getText().toString();
                String j1_input = j1.getText().toString();
                String k1_input = k1.getText().toString();
                String l1_input = l1.getText().toString();
                String m1_input = m1.getText().toString();
                String n1_input = n1.getText().toString();
                String o1_input = o1.getText().toString();
                String p1_input = p1.getText().toString();


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

                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);
                int e1_int = Integer.parseInt(e1_input);
                int f1_int = Integer.parseInt(f1_input);
                int g1_int = Integer.parseInt(g1_input);
                int h1_int = Integer.parseInt(h1_input);
                int i1_int = Integer.parseInt(i1_input);
                int j1_int = Integer.parseInt(j1_input);
                int k1_int = Integer.parseInt(k1_input);
                int l1_int = Integer.parseInt(l1_input);
                int m1_int = Integer.parseInt(m1_input);
                int n1_int = Integer.parseInt(n1_input);
                int o1_int = Integer.parseInt(o1_input);
                int p1_int = Integer.parseInt(p1_input);




                double a_final = a_int - a1_int;
                double b_final = b_int - b1_int;
                double c_final = c_int - c1_int;
                double d_final = d_int - d1_int;
                double e_final = e_int - e1_int;
                double f_final = f_int - f1_int;
                double g_final = g_int - g1_int;
                double h_final = h_int - h1_int;
                double i_final = i_int - i1_int;
                double j_final = j_int - j1_int;
                double k_final = k_int - k1_int;
                double l_final = l_int - l1_int;
                double m_final = m_int - m1_int;
                double n_final = n_int - n1_int;
                double o_final = o_int - o1_int;
                double p_final = p_int - p1_int;



                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);
                String e_result = String.valueOf(e_final);
                String f_result = String.valueOf(f_final);
                String g_result = String.valueOf(g_final);
                String h_result = String.valueOf(h_final);
                String i_result = String.valueOf(i_final);
                String j_result = String.valueOf(j_final);
                String k_result = String.valueOf(k_final);
                String l_result = String.valueOf(l_final);
                String m_result = String.valueOf(m_final);
                String n_result = String.valueOf(n_final);
                String o_result = String.valueOf(o_final);
                String p_result = String.valueOf(p_final);


                Intent intent = new Intent(fourByfour_for_two.this, subtract_result_4x4_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                intent.putExtra("keyname5", e_result);
                intent.putExtra("keyname6", f_result);
                intent.putExtra("keyname7", g_result);
                intent.putExtra("keyname8", h_result);
                intent.putExtra("keyname9", i_result);
                intent.putExtra("keyname10", j_result);
                intent.putExtra("keyname11", k_result);
                intent.putExtra("keyname12", l_result);
                intent.putExtra("keyname13", m_result);
                intent.putExtra("keyname14", n_result);
                intent.putExtra("keyname15", o_result);
                intent.putExtra("keyname16", p_result);
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
                        p.getText().toString().equals("") ||
                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("") ||
                        e1.getText().toString().equals("") ||
                        f1.getText().toString().equals("") ||
                        g1.getText().toString().equals("") ||
                        h1.getText().toString().equals("") ||
                        i1.getText().toString().equals("") ||
                        j1.getText().toString().equals("") ||
                        k1.getText().toString().equals("") ||
                        l1.getText().toString().equals("") ||
                        m1.getText().toString().equals("") ||
                        n1.getText().toString().equals("") ||
                        o1.getText().toString().equals("") ||
                        p1.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-")  ||
                        e.getText().toString().equals("-")  ||
                        f.getText().toString().equals("-")  ||
                        g.getText().toString().equals("-")  ||
                        h.getText().toString().equals("-")  ||
                        i.getText().toString().equals("-")  ||
                        j.getText().toString().equals("-")  ||
                        k.getText().toString().equals("-")  ||
                        l.getText().toString().equals("-")  ||
                        m.getText().toString().equals("-")  ||
                        n.getText().toString().equals("-")  ||
                        o.getText().toString().equals("-")  ||
                        p.getText().toString().equals("-")  ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-") ||
                        c1.getText().toString().equals("-") ||
                        d1.getText().toString().equals("-") ||
                        e1.getText().toString().equals("-") ||
                        f1.getText().toString().equals("-") ||
                        g1.getText().toString().equals("-") ||
                        h1.getText().toString().equals("-") ||
                        i1.getText().toString().equals("-") ||
                        j1.getText().toString().equals("-") ||
                        k1.getText().toString().equals("-") ||
                        l1.getText().toString().equals("-") ||
                        m1.getText().toString().equals("-") ||
                        n1.getText().toString().equals("-") ||
                        o1.getText().toString().equals("-") ||
                        p1.getText().toString().equals("-") ) {
                    Toast.makeText(fourByfour_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+")  ||
                        e.getText().toString().equals("+")  ||
                        f.getText().toString().equals("+")  ||
                        g.getText().toString().equals("+")  ||
                        h.getText().toString().equals("+")  ||
                        i.getText().toString().equals("+")  ||
                        j.getText().toString().equals("+")  ||
                        k.getText().toString().equals("+")  ||
                        l.getText().toString().equals("+")  ||
                        m.getText().toString().equals("+")  ||
                        n.getText().toString().equals("+")  ||
                        o.getText().toString().equals("+")  ||
                        p.getText().toString().equals("+")  ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+") ||
                        c1.getText().toString().equals("+") ||
                        d1.getText().toString().equals("+") ||
                        e1.getText().toString().equals("+") ||
                        f1.getText().toString().equals("+") ||
                        g1.getText().toString().equals("+") ||
                        h1.getText().toString().equals("+") ||
                        i1.getText().toString().equals("+") ||
                        j1.getText().toString().equals("+") ||
                        k1.getText().toString().equals("+") ||
                        l1.getText().toString().equals("+") ||
                        m1.getText().toString().equals("+") ||
                        n1.getText().toString().equals("+") ||
                        o1.getText().toString().equals("+") ||
                        p1.getText().toString().equals("+") ) {
                    Toast.makeText(fourByfour_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }




                else {
                    subtract();
                }

            }
        });         // end of subtraction function




        // multiplication function


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
                String j_input = j.getText().toString();
                String k_input = k.getText().toString();
                String l_input = l.getText().toString();
                String m_input = m.getText().toString();
                String n_input = n.getText().toString();
                String o_input = o.getText().toString();
                String p_input = p.getText().toString();

                String a1_input = a1.getText().toString();
                String b1_input = b1.getText().toString();
                String c1_input = c1.getText().toString();
                String d1_input = d1.getText().toString();
                String e1_input = e1.getText().toString();
                String f1_input = f1.getText().toString();
                String g1_input = g1.getText().toString();
                String h1_input = h1.getText().toString();
                String i1_input = i1.getText().toString();
                String j1_input = j1.getText().toString();
                String k1_input = k1.getText().toString();
                String l1_input = l1.getText().toString();
                String m1_input = m1.getText().toString();
                String n1_input = n1.getText().toString();
                String o1_input = o1.getText().toString();
                String p1_input = p1.getText().toString();


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

                int a1_int = Integer.parseInt(a1_input);
                int b1_int = Integer.parseInt(b1_input);
                int c1_int = Integer.parseInt(c1_input);
                int d1_int = Integer.parseInt(d1_input);
                int e1_int = Integer.parseInt(e1_input);
                int f1_int = Integer.parseInt(f1_input);
                int g1_int = Integer.parseInt(g1_input);
                int h1_int = Integer.parseInt(h1_input);
                int i1_int = Integer.parseInt(i1_input);
                int j1_int = Integer.parseInt(j1_input);
                int k1_int = Integer.parseInt(k1_input);
                int l1_int = Integer.parseInt(l1_input);
                int m1_int = Integer.parseInt(m1_input);
                int n1_int = Integer.parseInt(n1_input);
                int o1_int = Integer.parseInt(o1_input);
                int p1_int = Integer.parseInt(p1_input);




                double a_final = (a_int * a1_int) + (b_int * e1_int) + (c_int * i1_int) + (d_int * m1_int);
                double b_final = (a_int * b1_int) + (b_int * f1_int) + (c_int * j1_int) + (d_int * n1_int);
                double c_final = (a_int * c1_int) + (b_int * g1_int) + (c_int * k1_int) + (d_int * o1_int);
                double d_final = (a_int * d1_int) + (b_int * h1_int) + (c_int * l1_int) + (d_int * p1_int);

                double e_final = (e_int * a1_int) + (f_int * e1_int) + (g_int * i1_int) + (h_int * m1_int);
                double f_final = (e_int * b1_int) + (f_int * f1_int) + (g_int * j1_int) + (h_int * n1_int);
                double g_final = (e_int * c1_int) + (f_int * g1_int) + (g_int * k1_int) + (h_int * o1_int);
                double h_final = (e_int * d1_int) + (f_int * h1_int) + (g_int * l1_int) + (h_int * p1_int);

                double i_final = (i_int * a1_int) + (j_int * e1_int) + (k_int * i1_int) + (l_int * m1_int);
                double j_final = (i_int * b1_int) + (j_int * f1_int) + (k_int * j1_int) + (l_int * n1_int);
                double k_final = (i_int * c1_int) + (j_int * g1_int) + (k_int * k1_int) + (l_int * o1_int);
                double l_final = (i_int * d1_int) + (j_int * h1_int) + (k_int * l1_int) + (l_int * p1_int);

                double m_final = (m_int * a1_int) + (n_int * e1_int) + (o_int * i1_int) + (p_int * m1_int);
                double n_final = (m_int * b1_int) + (n_int * f1_int) + (o_int * j1_int) + (p_int * n1_int);
                double o_final = (m_int * c1_int) + (n_int * g1_int) + (o_int * k1_int) + (p_int * o1_int);
                double p_final = (m_int * d1_int) + (n_int * h1_int) + (o_int * l1_int) + (p_int * p1_int);



                String a_result = String.valueOf(a_final);
                String b_result = String.valueOf(b_final);
                String c_result = String.valueOf(c_final);
                String d_result = String.valueOf(d_final);
                String e_result = String.valueOf(e_final);
                String f_result = String.valueOf(f_final);
                String g_result = String.valueOf(g_final);
                String h_result = String.valueOf(h_final);
                String i_result = String.valueOf(i_final);
                String j_result = String.valueOf(j_final);
                String k_result = String.valueOf(k_final);
                String l_result = String.valueOf(l_final);
                String m_result = String.valueOf(m_final);
                String n_result = String.valueOf(n_final);
                String o_result = String.valueOf(o_final);
                String p_result = String.valueOf(p_final);


                Intent intent = new Intent(fourByfour_for_two.this, multiply_result_4x4_2.class);
                intent.putExtra("keyname1", a_result);
                intent.putExtra("keyname2", b_result);
                intent.putExtra("keyname3", c_result);
                intent.putExtra("keyname4", d_result);
                intent.putExtra("keyname5", e_result);
                intent.putExtra("keyname6", f_result);
                intent.putExtra("keyname7", g_result);
                intent.putExtra("keyname8", h_result);
                intent.putExtra("keyname9", i_result);
                intent.putExtra("keyname10", j_result);
                intent.putExtra("keyname11", k_result);
                intent.putExtra("keyname12", l_result);
                intent.putExtra("keyname13", m_result);
                intent.putExtra("keyname14", n_result);
                intent.putExtra("keyname15", o_result);
                intent.putExtra("keyname16", p_result);
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
                        p.getText().toString().equals("") ||
                        a1.getText().toString().equals("") ||
                        b1.getText().toString().equals("") ||
                        c1.getText().toString().equals("") ||
                        d1.getText().toString().equals("") ||
                        e1.getText().toString().equals("") ||
                        f1.getText().toString().equals("") ||
                        g1.getText().toString().equals("") ||
                        h1.getText().toString().equals("") ||
                        i1.getText().toString().equals("") ||
                        j1.getText().toString().equals("") ||
                        k1.getText().toString().equals("") ||
                        l1.getText().toString().equals("") ||
                        m1.getText().toString().equals("") ||
                        n1.getText().toString().equals("") ||
                        o1.getText().toString().equals("") ||
                        p1.getText().toString().equals("")

                ) {

                    Toast.makeText(fourByfour_for_two.this, "All input boxes should be filled !", Toast.LENGTH_SHORT).show();
                }


                else if (a.getText().toString().equals("-") ||
                        b.getText().toString().equals("-")  ||
                        c.getText().toString().equals("-")  ||
                        d.getText().toString().equals("-")  ||
                        e.getText().toString().equals("-")  ||
                        f.getText().toString().equals("-")  ||
                        g.getText().toString().equals("-")  ||
                        h.getText().toString().equals("-")  ||
                        i.getText().toString().equals("-")  ||
                        j.getText().toString().equals("-")  ||
                        k.getText().toString().equals("-")  ||
                        l.getText().toString().equals("-")  ||
                        m.getText().toString().equals("-")  ||
                        n.getText().toString().equals("-")  ||
                        o.getText().toString().equals("-")  ||
                        p.getText().toString().equals("-")  ||
                        a1.getText().toString().equals("-") ||
                        b1.getText().toString().equals("-") ||
                        c1.getText().toString().equals("-") ||
                        d1.getText().toString().equals("-") ||
                        e1.getText().toString().equals("-") ||
                        f1.getText().toString().equals("-") ||
                        g1.getText().toString().equals("-") ||
                        h1.getText().toString().equals("-") ||
                        i1.getText().toString().equals("-") ||
                        j1.getText().toString().equals("-") ||
                        k1.getText().toString().equals("-") ||
                        l1.getText().toString().equals("-") ||
                        m1.getText().toString().equals("-") ||
                        n1.getText().toString().equals("-") ||
                        o1.getText().toString().equals("-") ||
                        p1.getText().toString().equals("-") ) {
                    Toast.makeText(fourByfour_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }

                else if (a.getText().toString().equals("+") ||
                        b.getText().toString().equals("+")  ||
                        c.getText().toString().equals("+")  ||
                        d.getText().toString().equals("+")  ||
                        e.getText().toString().equals("+")  ||
                        f.getText().toString().equals("+")  ||
                        g.getText().toString().equals("+")  ||
                        h.getText().toString().equals("+")  ||
                        i.getText().toString().equals("+")  ||
                        j.getText().toString().equals("+")  ||
                        k.getText().toString().equals("+")  ||
                        l.getText().toString().equals("+")  ||
                        m.getText().toString().equals("+")  ||
                        n.getText().toString().equals("+")  ||
                        o.getText().toString().equals("+")  ||
                        p.getText().toString().equals("+")  ||
                        a1.getText().toString().equals("+") ||
                        b1.getText().toString().equals("+") ||
                        c1.getText().toString().equals("+") ||
                        d1.getText().toString().equals("+") ||
                        e1.getText().toString().equals("+") ||
                        f1.getText().toString().equals("+") ||
                        g1.getText().toString().equals("+") ||
                        h1.getText().toString().equals("+") ||
                        i1.getText().toString().equals("+") ||
                        j1.getText().toString().equals("+") ||
                        k1.getText().toString().equals("+") ||
                        l1.getText().toString().equals("+") ||
                        m1.getText().toString().equals("+") ||
                        n1.getText().toString().equals("+") ||
                        o1.getText().toString().equals("+") ||
                        p1.getText().toString().equals("+") ) {
                    Toast.makeText(fourByfour_for_two.this, "Invalid Input !", Toast.LENGTH_SHORT).show();
                }



                else {
                    multiply();
                }

            }
        });


    }
}