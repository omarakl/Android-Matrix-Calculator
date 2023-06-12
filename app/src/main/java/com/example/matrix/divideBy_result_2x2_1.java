package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class divideBy_result_2x2_1 extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide_by_result_2x2_1);
        getSupportActionBar().hide();


        a = (EditText) findViewById(R.id.xz1);
        b = (EditText) findViewById(R.id.xz2);
        c = (EditText) findViewById(R.id.xz3);
        d = (EditText) findViewById(R.id.xz4);


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