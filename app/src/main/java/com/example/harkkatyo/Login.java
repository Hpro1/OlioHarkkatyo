package com.example.harkkatyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = (TextView) findViewById(R.id.kayttaja);
        TextView password = (TextView) findViewById(R.id.salasana);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.login);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(Login.this, "Onnistui", Toast.LENGTH_SHORT);

                    loginbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(startIntent);
                        }
                    });
                }

                else {
                    Toast.makeText(Login.this, "admin admin", Toast.LENGTH_SHORT);
                }
            }
        });

    }
}