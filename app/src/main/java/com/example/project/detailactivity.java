package com.example.project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class detailactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);


        Button videoactivity = (Button) findViewById(R.id.button4);
        videoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(detailactivity.this,  vid.class );

                startActivity(startIntent);
            }
        });


        Button photoactivity = (Button) findViewById(R.id.button2);
        photoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(detailactivity.this,  pho.class );

                startActivity(startIntent);
            }
        });

        Button tamactivity = (Button) findViewById(R.id.button3);
        tamactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(detailactivity.this,  tamus.class );

                startActivity(startIntent);
            }
        });
        Button breed = (Button) findViewById(R.id.pr);
        breed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(detailactivity.this,  bre.class );

                startActivity(startIntent);
            }
        });

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.INDEX", -1);
        if (index > -1){
            int pic = setImage(index);
            ImageView img = (ImageView) findViewById(R.id.imageView3);
            scaleImg(img, pic);
        }


    }
    private int setImage(int index) {
        switch (index) {
            case 0:
                return R.drawable.bengal;
            case 1:
                return R.drawable.persian;
            case 2:
                return R.drawable.siamese;
            case 3:
                return R.drawable.mainecoon;
            case 4:
                return R.drawable.sphinx;
            case 5:
                return R.drawable.ragdoll;
            case 6:
                return R.drawable.britishshorthair;
            case 7:
                return R.drawable.russianblue;
            case 8:
                return R.drawable.scottishfold;
            case 9:
                return R.drawable.abyssian;

            default: return -1;
        }

    }

    private void scaleImg(ImageView img, int pic){
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();
        if (imgWidth > screenWidth){
            int ratio = Math.round((float) imgWidth / (float) screenWidth);
            options.inSampleSize = ratio;
        }
        options.inJustDecodeBounds = false;
        Bitmap scaleImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaleImg);
    }
}

