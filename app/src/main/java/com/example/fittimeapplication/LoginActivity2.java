package com.example.fittimeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity2 extends AppCompatActivity {

    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        initViews();

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity2.this,surveryPage1.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        buttonLogin = findViewById(R.id.buttonLogin);
    }
}