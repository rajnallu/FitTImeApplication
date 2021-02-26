package com.example.fittimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SurveyPage2 extends AppCompatActivity {

    private Button SURVEYPAGE2NEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_page2);

        initViews();

        SURVEYPAGE2NEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SurveyPage2.this,GoalsPage.class );
                startActivity(intent);
            }
        });
    }

    private void initViews() { SURVEYPAGE2NEXT = findViewById(R.id.SURVEYPAGE2NEXT);}
}