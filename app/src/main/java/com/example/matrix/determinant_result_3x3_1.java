package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class determinant_result_3x3_1 extends AppCompatActivity {

    protected EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinant_result_3x3_1);
        getSupportActionBar().hide();


        result = (EditText) findViewById(R.id.detResult_3x3_1);

        String a_result = getIntent().getStringExtra("keyname1");

        result.setText(a_result);

    }
}