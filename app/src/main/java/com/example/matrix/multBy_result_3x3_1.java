package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class multBy_result_3x3_1 extends AppCompatActivity {

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
        setContentView(R.layout.activity_mult_by_result_3x3_1);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.x1);
        b = (EditText) findViewById(R.id.x2);
        c = (EditText) findViewById(R.id.x3);
        d = (EditText) findViewById(R.id.x4);
        e = (EditText) findViewById(R.id.x5);
        f = (EditText) findViewById(R.id.x6);
        g = (EditText) findViewById(R.id.x7);
        h = (EditText) findViewById(R.id.x8);
        i = (EditText) findViewById(R.id.x9);

        String a_result = getIntent().getStringExtra("keyname17");
        String b_result = getIntent().getStringExtra("keyname18");
        String c_result = getIntent().getStringExtra("keyname19");
        String d_result = getIntent().getStringExtra("keyname20");
        String e_result = getIntent().getStringExtra("keyname21");
        String f_result = getIntent().getStringExtra("keyname22");
        String g_result = getIntent().getStringExtra("keyname23");
        String h_result = getIntent().getStringExtra("keyname24");
        String i_result = getIntent().getStringExtra("keyname25");


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