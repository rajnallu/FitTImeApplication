package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GoalsPage extends AppCompatActivity {
    private Button goalsNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_page);

        initViews();

        goalsNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoalsPage.this,ScreenTimeLimits.class );
                startActivity(intent);
            }
        });
    }
    private void initViews() { goalsNext = findViewById(R.id.goalsNext);}
}