package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class divideBy_result_4x4_1 extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide_by_result_4x4_1);
        getSupportActionBar().hide();


        a = (EditText) findViewById(R.id.xs1);
        b = (EditText) findViewById(R.id.xs2);
        c = (EditText) findViewById(R.id.xs3);
        d = (EditText) findViewById(R.id.xs4);
        e = (EditText) findViewById(R.id.xs5);
        f = (EditText) findViewById(R.id.xs6);
        g = (EditText) findViewById(R.id.xs7);
        h = (EditText) findViewById(R.id.xs8);
        i = (EditText) findViewById(R.id.xs9);
        j = (EditText) findViewById(R.id.xs10);
        k = (EditText) findViewById(R.id.xs11);
        l = (EditText) findViewById(R.id.xs12);
        m = (EditText) findViewById(R.id.xs13);
        n = (EditText) findViewById(R.id.xs14);
        o = (EditText) findViewById(R.id.xs15);
        p = (EditText) findViewById(R.id.xs16);


        String a_result = getIntent().getStringExtra("keyname1");
        String b_result = getIntent().getStringExtra("keyname2");
        String c_result = getIntent().getStringExtra("keyname3");
        String d_result = getIntent().getStringExtra("keyname4");
        String e_result = getIntent().getStringExtra("keyname5");
        String f_result = getIntent().getStringExtra("keyname6");
        String g_result = getIntent().getStringExtra("keyname7");
        String h_result = getIntent().getStringExtra("keyname8");
        String i_result = getIntent().getStringExtra("keyname9");
        String j_result = getIntent().getStringExtra("keyname10");
        String k_result = getIntent().getStringExtra("keyname11");
        String l_result = getIntent().getStringExtra("keyname12");
        String m_result = getIntent().getStringExtra("keyname13");
        String n_result = getIntent().getStringExtra("keyname14");
        String o_result = getIntent().getStringExtra("keyname15");
        String p_result = getIntent().getStringExtra("keyname16");


        a.setText(a_result);
        b.setText(b_result);
        c.setText(c_result);
        d.setText(d_result);
        e.setText(e_result);
        f.setText(f_result);
        g.setText(g_result);
        h.setText(h_result);
        i.setText(i_result);
        j.setText(j_result);
        k.setText(k_result);
        l.setText(l_result);
        m.setText(m_result);
        n.setText(n_result);
        o.setText(o_result);
        p.setText(p_result);

    }
}