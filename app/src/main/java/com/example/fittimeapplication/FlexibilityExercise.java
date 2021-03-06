package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FlexibilityExercise extends AppCompatActivity {
    private Button BackToExercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexibility_exercise);
        initViews();

        BackToExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlexibilityExercise.this,ExcercisePage.class);
                startActivity(intent);
            }
        });

    }
    private void initViews() {
        BackToExercise = findViewById(R.id.BacktoExercise);
    }
}