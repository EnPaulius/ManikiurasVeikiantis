package com.example.moksleivis.manikiuras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //kreipimasis i paveldimos klases metoda
        setContentView(R.layout.activity_login); //susiejame xml su kodu

        Button loginButton = (Button) findViewById(R.id.logino_mygtukas);

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(LoginActivity.this, MeniuActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                LoginActivity.this.startActivity(myIntent);

            }

        });

        Button registerButton= (Button) findViewById(R.id.registracijos_mygtukas);

        registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                LoginActivity.this.startActivity(myIntent);

            }

        });
    }
}
