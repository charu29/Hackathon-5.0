package com.example.application.militarytraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ms1,ms2,ms3,ms4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ms1= (Button) findViewById(R.id.ms1);
        ms2= (Button) findViewById(R.id.ms2);
        ms3= (Button) findViewById(R.id.ms3);
        ms4= (Button) findViewById(R.id.ms4);

        ms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,m1.class);
                startActivity(in);
                finish();
            }
        });

        ms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,m2.class);
                startActivity(in);
                finish();

            }
        });

        ms3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,m3.class);
                startActivity(in);
                finish();

            }
        });

        ms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,m1.class);
                startActivity(in);
                finish();

            }
        });

        ms4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,m4.class);
                startActivity(in);
                finish();

            }
        });

    }
}
