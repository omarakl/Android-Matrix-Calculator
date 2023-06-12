package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class calculate_result_3x3_1 extends AppCompatActivity {

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
        setContentView(R.layout.activity_calculate_result_3x3_1);
        getSupportActionBar().hide();


        a = (EditText) findViewById(R.id.et_1a);
        b = (EditText) findViewById(R.id.et_2a);
        c = (EditText) findViewById(R.id.et_3a);
        d = (EditText) findViewById(R.id.et_4a);
        e = (EditText) findViewById(R.id.et_5a);
        f = (EditText) findViewById(R.id.et_6a);
        g = (EditText) findViewById(R.id.et_7a);
        h = (EditText) findViewById(R.id.et_8a);
        i = (EditText) findViewById(R.id.et_9a);

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