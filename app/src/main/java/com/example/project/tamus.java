package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class tamus extends AppCompatActivity {
    private static final int PICK_IMAGE_REQUEST = 1;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tamara);
        EditText num1 = (EditText) findViewById(R.id.edit);
        Button videoactivity = (Button) findViewById(R.id.button4);

        videoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(tamus.this,  vid.class );

                startActivity(startIntent);
            }
        });
        Button pr = (Button) findViewById(R.id.pr);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(tamus.this,  bre.class );

                startActivity(startIntent);
            }
        });

        Button photoactivity = (Button) findViewById(R.id.button2);
        photoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(tamus.this,  pho.class );

                startActivity(startIntent);
            }
        });
        // ADD THIS BELOW your existing onCreate and class code





        imageView = findViewById(R.id.photoedit);
        Button pickImageButton = findViewById(R.id.button);

        pickImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_REQUEST);
            }
        });
    }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
                Uri selectedImage = data.getData();
                imageView.setImageURI(selectedImage);
            }
        }



    }