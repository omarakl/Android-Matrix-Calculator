package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class inverse_result_2x2_1 extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverse_result_2x2_1);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.et_1a);
        b = (EditText) findViewById(R.id.et_2a);
        c = (EditText) findViewById(R.id.et_3a);
        d = (EditText) findViewById(R.id.et_8a);


        String a_result = getIntent().getStringExtra("keyname9");
        String b_result = getIntent().getStringExtra("keyname10");
        String c_result = getIntent().getStringExtra("keyname11");
        String d_result = getIntent().getStringExtra("keyname12");

        a.setText(d_result);
        b.setText(b_result);
        c.setText(c_result);
        d.setText(a_result);


    }
}