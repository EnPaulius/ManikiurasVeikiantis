package com.example.moksleivis.manikiuras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeniuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu);

        Button newPostButton = (Button) findViewById(R.id.naujas_irasas);

        newPostButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MeniuActivity.this, New_post.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MeniuActivity.this.startActivity(myIntent);

            }

        });

        Button searchButton = (Button) findViewById(R.id.paieska);

        searchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MeniuActivity.this, Search.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MeniuActivity.this.startActivity(myIntent);

            }

        });
    }
}

