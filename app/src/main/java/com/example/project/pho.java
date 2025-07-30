package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class pho extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        Button videoactivity = (Button) findViewById(R.id.button4);
        videoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(pho.this,  vid.class );

                startActivity(startIntent);
            }
        });

        Button tamactivity = (Button) findViewById(R.id.button3);
        tamactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(pho.this,  tamus.class );

                startActivity(startIntent);
            }
        });

        Button pr = (Button) findViewById(R.id.pr);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(pho.this,  bre.class );

                startActivity(startIntent);
            }
        });

        Button i1 = (Button) findViewById(R.id.b1);
        ImageView no = (ImageView) findViewById(R.id.imag1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no.setVisibility(View.VISIBLE);
                i1.setVisibility(View.INVISIBLE);
            }
        });

        Button i2 = (Button) findViewById(R.id.b2);
        ImageView no2 = (ImageView) findViewById(R.id.imag2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no2.setVisibility(View.VISIBLE);
                i2.setVisibility(View.INVISIBLE);
            }
        });

        Button i3 = (Button) findViewById(R.id.b3);
        ImageView no3 = (ImageView) findViewById(R.id.imag3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no3.setVisibility(View.VISIBLE);
                i3.setVisibility(View.INVISIBLE);
            }
        });

        Button i4 = (Button) findViewById(R.id.b4);
        ImageView no4 = (ImageView) findViewById(R.id.imag4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no4.setVisibility(View.VISIBLE);
                i4.setVisibility(View.INVISIBLE);
            }
        });

        Button i5 = (Button) findViewById(R.id.b5);
        ImageView no5 = (ImageView) findViewById(R.id.imag5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no5.setVisibility(View.VISIBLE);
                i5.setVisibility(View.INVISIBLE);
            }
        });

        Button i6 = (Button) findViewById(R.id.b6);
        ImageView no6 = (ImageView) findViewById(R.id.imag6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no6.setVisibility(View.VISIBLE);
                i6.setVisibility(View.INVISIBLE);
            }
        });

        Button i7 = (Button) findViewById(R.id.b7);
        ImageView no7 = (ImageView) findViewById(R.id.imag7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no7.setVisibility(View.VISIBLE);
                i7.setVisibility(View.INVISIBLE);
            }
        });

        Button i8 = (Button) findViewById(R.id.b8);
        ImageView no8 = (ImageView) findViewById(R.id.imag8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no8.setVisibility(View.VISIBLE);
                i8.setVisibility(View.INVISIBLE);
            }
        });

        Button i9 = (Button) findViewById(R.id.b9);
        ImageView no9 = (ImageView) findViewById(R.id.imag9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no9.setVisibility(View.VISIBLE);
                i9.setVisibility(View.INVISIBLE);
            }
        });


    }
}
