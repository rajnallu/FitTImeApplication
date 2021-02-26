package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class surveryPage1 extends AppCompatActivity {

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survery_page1);

        initViews();

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(surveryPage1.this,SurveyPage2.class );
                startActivity(intent);
            }
        });

    }

    private void initViews() { buttonNext = findViewById(R.id.buttonNext);}

}