package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AerobicExercise extends AppCompatActivity {
    private Button backtoExercise3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerobic_exercise);
        initViews();

        backtoExercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AerobicExercise.this,ExcercisePage.class);
                startActivity(intent);
            }
        });
    }
    private void initViews() {
        backtoExercise3 = findViewById(R.id.backtoExercise3);
    }
}