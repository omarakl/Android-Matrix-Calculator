package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class transpose_result_3x3_1 extends AppCompatActivity {

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
        setContentView(R.layout.activity_trasnspose_result_3x3_1);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.z1);
        b = (EditText) findViewById(R.id.z2);
        c = (EditText) findViewById(R.id.z3);
        d = (EditText) findViewById(R.id.z4);
        e = (EditText) findViewById(R.id.z5);
        f = (EditText) findViewById(R.id.z6);
        g = (EditText) findViewById(R.id.z7);
        h = (EditText) findViewById(R.id.z8);
        i = (EditText) findViewById(R.id.z9);


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
        b.setText(d_result);
        c.setText(g_result);
        d.setText(b_result);
        e.setText(e_result);
        f.setText(h_result);
        g.setText(c_result);
        h.setText(f_result);
        i.setText(i_result);
    }
}