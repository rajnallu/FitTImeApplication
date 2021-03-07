package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StrengthResistanceExercise extends AppCompatActivity {
    private Button backtoExercise2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength_resistance_exercise);
        initViews();

        backtoExercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StrengthResistanceExercise.this,ExcercisePage.class);
                startActivity(intent);
            }
        });
    }
    private void initViews() {
        backtoExercise2 = findViewById(R.id.backtoExercise2);
    }
}