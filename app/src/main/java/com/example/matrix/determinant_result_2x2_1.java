package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class determinant_result_2x2_1 extends AppCompatActivity {

    protected EditText detResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinant_result_2x2_1);
        getSupportActionBar().hide();

        detResult = (EditText) findViewById(R.id.editTextTextPersonName);

        String a_result = getIntent().getStringExtra("keyname1");

        detResult.setText(a_result);
    }
}