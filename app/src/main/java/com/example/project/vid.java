package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class vid extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        Button photoactivity = (Button) findViewById(R.id.button2);
        photoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(vid.this, pho.class);

                startActivity(startIntent);
            }
        });

        Button tamactivity = (Button) findViewById(R.id.button3);
        tamactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(vid.this, tamus.class);

                startActivity(startIntent);
            }
        });

        Button cute = (Button) findViewById(R.id.cut);
        cute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtu.be/y0sF5xhGreA?si=TafNVX3ksmB_7Ogk ";
                Uri webaddress = Uri.parse(url);

                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                startActivity(gotogoogle);


            }
        });

        Button fu = (Button) findViewById(R.id.fun);
        fu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtu.be/JxS5E-kZc2s?si=6tIeHMFzemH_Hm-p ";
                Uri webaddress = Uri.parse(url);

                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                startActivity(gotogoogle);


            }
        });

        Button crazy = (Button) findViewById(R.id.craz);
        crazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtu.be/IZPdFrzyGAM?si=NwGkEs0wsqwy8L6F ";
                Uri webaddress = Uri.parse(url);

                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                startActivity(gotogoogle);

            }
        });
        Button pr = (Button) findViewById(R.id.pr);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(vid.this,  bre.class );

                startActivity(startIntent);
            }
        });

        Button facts = (Button) findViewById(R.id.fac);
        facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mygavet.com/services/cats/blog/50-cat-facts-you-probably-didnt-know ";
                Uri webaddress = Uri.parse(url);

                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                startActivity(gotogoogle);

            }
        });

        ImageView gifImageView = (ImageView) findViewById(R.id.imageView6);
        Button showGifButton = (Button) findViewById(R.id.button7);

        showGifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gifImageView.setVisibility(View.VISIBLE);
                Glide.with(vid.this)
                        .asGif()
                        .load(R.drawable.cat)
                        .into(gifImageView);
            }
        });

    }}
