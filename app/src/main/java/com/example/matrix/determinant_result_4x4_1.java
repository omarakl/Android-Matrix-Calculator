package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class determinant_result_4x4_1 extends AppCompatActivity {

    protected EditText determinantRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinant_result_4x4_1);
        getSupportActionBar().hide();

        determinantRes = (EditText) findViewById(R.id.det_result);

        String a_result = getIntent().getStringExtra("keyname1");

        determinantRes.setText(a_result);
    }
}