package com.example.project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Button videoactivity = (Button) findViewById(R.id.button4);
        videoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this,  vid.class );

                startActivity(startIntent);
            }
        });


        Button photoactivity = (Button) findViewById(R.id.button2);
        photoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this,  pho.class );

                startActivity(startIntent);
            }
        });

        Button tamactivity = (Button) findViewById(R.id.button3);
        tamactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this,  tamus.class );

                startActivity(startIntent);
            }
        });

        Button breed = (Button) findViewById(R.id.pr);
        breed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this,  bre.class );

                startActivity(startIntent);
            }
        });

    }}