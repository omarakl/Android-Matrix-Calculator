package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose_matrices_number extends AppCompatActivity {

    private Button oneMatrix;
    private Button twoMatrices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_matrices_number);
        getSupportActionBar().hide();

        oneMatrix = (Button) findViewById(R.id.oneMatrixOperation);
        twoMatrices = (Button) findViewById(R.id.twoMatricesOperation);


        // 1 Matrix Button
        oneMatrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_choose_matrix_size_for_one();
            }

            public void  open_choose_matrix_size_for_one() {
                Intent fp = new Intent(getApplicationContext(),choose_matrix_size_for_one.class);
                startActivity(fp);

            }
        });



        // 2 Matrices Button

        twoMatrices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_choose_matrix_size_for_two();
            }

            public void  open_choose_matrix_size_for_two() {
                startActivity( new Intent(choose_matrices_number.this, choose_matrics_size_for_two.class));

            }
        });



    }
}