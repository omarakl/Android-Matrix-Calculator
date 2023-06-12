package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class calculate_result_2x2_1 extends AppCompatActivity {

    protected TextView a;
    protected TextView b;
    protected TextView c;
    protected TextView d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_2x2);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.et_1a);
        b = (EditText) findViewById(R.id.et_2a);
        c = (EditText) findViewById(R.id.et_3a);
        d = (EditText) findViewById(R.id.et_8a);

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