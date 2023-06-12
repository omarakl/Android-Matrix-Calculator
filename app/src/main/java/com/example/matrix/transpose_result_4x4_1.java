package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class transpose_result_4x4_1 extends AppCompatActivity {

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
        setContentView(R.layout.activity_transpose_result_4x4_1);
        getSupportActionBar().hide();


        a = (EditText) findViewById(R.id.u1);
        b = (EditText) findViewById(R.id.u2);
        c = (EditText) findViewById(R.id.u3);
        d = (EditText) findViewById(R.id.u4);
        e = (EditText) findViewById(R.id.u5);
        f = (EditText) findViewById(R.id.u6);
        g = (EditText) findViewById(R.id.u7);
        h = (EditText) findViewById(R.id.u8);
        i = (EditText) findViewById(R.id.u9);
        j = (EditText) findViewById(R.id.u10);
        k = (EditText) findViewById(R.id.u11);
        l = (EditText) findViewById(R.id.u12);
        m = (EditText) findViewById(R.id.u13);
        n = (EditText) findViewById(R.id.u14);
        o = (EditText) findViewById(R.id.u15);
        p = (EditText) findViewById(R.id.u16);


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
        b.setText(e_result);
        c.setText(i_result);
        d.setText(m_result);
        e.setText(b_result);
        f.setText(f_result);
        g.setText(j_result);
        h.setText(n_result);
        i.setText(c_result);
        j.setText(g_result);
        k.setText(k_result);
        l.setText(o_result);
        m.setText(d_result);
        n.setText(h_result);
        o.setText(l_result);
        p.setText(p_result);

    }
}