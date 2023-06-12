package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class multBy_result_2x2_1 extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult_by_result_2x2_1);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.et_1a);
        b = (EditText) findViewById(R.id.et_2a);
        c = (EditText) findViewById(R.id.et_3a);
        d = (EditText) findViewById(R.id.et_8a);

        String a_result = getIntent().getStringExtra("keyname13");
        String b_result = getIntent().getStringExtra("keyname14");
        String c_result = getIntent().getStringExtra("keyname15");
        String d_result = getIntent().getStringExtra("keyname16");

        a.setText(a_result);
        b.setText(b_result);
        c.setText(c_result);
        d.setText(d_result);
    }
}