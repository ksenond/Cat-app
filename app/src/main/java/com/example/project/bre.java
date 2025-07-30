package com.example.project;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;

public class bre extends AppCompatActivity {
    ListView myListView;
    String[] items;
    String[] description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breeds);

        Button videoactivity = (Button) findViewById(R.id.button4);
        videoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(bre.this,  vid.class );

                startActivity(startIntent);
            }
        });


        Button photoactivity = (Button) findViewById(R.id.button2);
        photoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(bre.this,  pho.class );

                startActivity(startIntent);
            }
        });

        Button tamactivity = (Button) findViewById(R.id.button3);
        tamactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(bre.this,  tamus.class );

                startActivity(startIntent);
            }
        });

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.breeds);
        description = res.getStringArray(R.array.description);

        itemadapter itemadapter = new itemadapter(this, items, description);
        myListView.setAdapter(itemadapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showpic =
                        new Intent(getApplicationContext(), detailactivity.class);
                showpic.putExtra("com.example.INDEX", i);
                startActivity(showpic);
            }
        });



    }}