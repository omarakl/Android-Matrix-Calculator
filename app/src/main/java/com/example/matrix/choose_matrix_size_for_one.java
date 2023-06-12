package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose_matrix_size_for_one extends AppCompatActivity {

    private Button twoBytwo;
    private Button threeBythree;
    private Button fourByfour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_matrix_size_for_one);
        getSupportActionBar().hide();

        twoBytwo = (Button) findViewById(R.id.twoBytwoButton);
        threeBythree = (Button) findViewById(R.id.threeBythreeButton);
        fourByfour = (Button) findViewById(R.id.fourByfourButton);


        twoBytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_two_by_two();
            }

            public void open_two_by_two() {
                startActivity( new Intent(choose_matrix_size_for_one.this, twoBytwo.class));
            }
        });




        threeBythree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_three_by_three();
            }

            public void open_three_by_three() {
                startActivity( new Intent(choose_matrix_size_for_one.this, threeBythree.class));
            }
        });

         fourByfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_four_by_four();
            }

            public void open_four_by_four() {
                startActivity( new Intent(choose_matrix_size_for_one.this, fourByfour.class));
            }
        });


    }
}