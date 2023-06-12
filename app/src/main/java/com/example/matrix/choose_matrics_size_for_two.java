package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class choose_matrics_size_for_two extends AppCompatActivity {

    protected Button twoBytwo;
    protected Button threeBythree;
    protected Button fourByfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_matrics_size_for_two);
        getSupportActionBar().hide();


        twoBytwo = (Button) findViewById(R.id.twoBytwo);
        threeBythree = (Button) findViewById(R.id.threeBythree);
        fourByfour = (Button) findViewById(R.id.fourByfour);


        twoBytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_twoBytwo();
            }

            public void  open_twoBytwo() {
                Intent intent = new Intent(getApplicationContext(), twoBytwo_for_two.class);
                startActivity(intent);

            }
        });


        threeBythree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_threeBythree();
            }

            public void  open_threeBythree() {
                Intent intent = new Intent(getApplicationContext(), threeBythree_for_two.class);
                startActivity(intent);

            }
        });


        fourByfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_fourByfour();
            }

            public void  open_fourByfour() {
                Intent intent = new Intent(getApplicationContext(), fourByfour_for_two.class);
                startActivity(intent);

            }
        });


    }
}