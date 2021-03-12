package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenTimeLimits extends AppCompatActivity {
    private Button buttonSubmit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_time_limits);
        initViews();

        buttonSubmit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenTimeLimits.this,ExcercisePage.class);
                startActivity(intent);
            }
        });
    }
    private void initViews() { buttonSubmit3 = findViewById(R.id.buttonSubmit3);
    }
}