package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_result_2x2_2 extends AppCompatActivity {

    protected EditText a;
    protected EditText b;
    protected EditText c;
    protected EditText d;
    protected Button performOp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_result_2x2_2);
        getSupportActionBar().hide();

        a = (EditText) findViewById(R.id.y1);
        b = (EditText) findViewById(R.id.y2);
        c = (EditText) findViewById(R.id.y3);
        d = (EditText) findViewById(R.id.y4);
        performOp = (Button) findViewById(R.id.opButton2x2);

        String a_result = getIntent().getStringExtra("keyname1");
        String b_result = getIntent().getStringExtra("keyname2");
        String c_result = getIntent().getStringExtra("keyname3");
        String d_result = getIntent().getStringExtra("keyname4");

        a.setText(a_result);
        b.setText(b_result);
        c.setText(c_result);
        d.setText(d_result);

//        performOp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(add_result_2x2_2.this, twoBytwo_for.class);
//                intent.putExtra("keyname1", a.getText().toString());
//                intent.putExtra("keyname2", b.getText().toString());
//                intent.putExtra("keyname3", c.getText().toString());
//                intent.putExtra("keyname4", d.getText().toString());
//
//                startActivity(intent);
//            }
//        });


    }
}