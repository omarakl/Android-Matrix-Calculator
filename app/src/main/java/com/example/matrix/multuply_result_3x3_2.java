package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class multuply_result_3x3_2 extends AppCompatActivity {


    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;
    protected EditText e;
    protected EditText f;
    protected EditText g;
    protected EditText h;
    protected EditText i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multuply_result_3x3_2);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.qa1);
        b = (EditText) findViewById(R.id.qa2);
        c = (EditText) findViewById(R.id.qa3);
        d = (EditText) findViewById(R.id.qa4);
        e = (EditText) findViewById(R.id.qa5);
        f = (EditText) findViewById(R.id.qa6);
        g = (EditText) findViewById(R.id.qa7);
        h = (EditText) findViewById(R.id.qa8);
        i = (EditText) findViewById(R.id.qa9);

        String a_result = getIntent().getStringExtra("keyname1");
        String b_result = getIntent().getStringExtra("keyname2");
        String c_result = getIntent().getStringExtra("keyname3");
        String d_result = getIntent().getStringExtra("keyname4");
        String e_result = getIntent().getStringExtra("keyname5");
        String f_result = getIntent().getStringExtra("keyname6");
        String g_result = getIntent().getStringExtra("keyname7");
        String h_result = getIntent().getStringExtra("keyname8");
        String i_result = getIntent().getStringExtra("keyname9");


        a.setText(a_result);
        b.setText(b_result);
        c.setText(c_result);
        d.setText(d_result);
        e.setText(e_result);
        f.setText(f_result);
        g.setText(g_result);
        h.setText(h_result);
        i.setText(i_result);
    }
}