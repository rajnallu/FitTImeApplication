package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ExcercisePage extends AppCompatActivity {

    private Button AerobicExcercise;
    private Button flexibilityExcercise;
    private Button StrengthResistenceExercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise_page);

        initViews();

        AerobicExcercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExcercisePage.this,AerobicExercise.class );
                startActivity(intent);
            }
        });

        flexibilityExcercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExcercisePage.this,FlexibilityExercise.class );
                startActivity(intent);
            }
        });
        StrengthResistenceExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExcercisePage.this,StrengthResistanceExercise.class );
                startActivity(intent);
            }
        });

    }

    private void initViews() {
        AerobicExcercise = findViewById(R.id.AerobicExcercise);
        flexibilityExcercise = findViewById(R.id.FlexibilityExercise);
         StrengthResistenceExercise = findViewById(R.id.StrengthResistenceExercise);
    }


}