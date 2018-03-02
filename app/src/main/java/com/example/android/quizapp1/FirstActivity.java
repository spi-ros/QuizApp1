package com.example.android.quizapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView europe = findViewById(R.id.europe_quiz);
        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void  onClick(View view){

                Intent euroIntent = new Intent(FirstActivity.this, EuropeActivity.class);
                startActivity(euroIntent);
            }
        });

        TextView africa = findViewById(R.id.africa_quiz);
        africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void  onClick(View view){

                Intent afroIntent = new Intent(FirstActivity.this, AfricaActivity.class);
                startActivity(afroIntent);
            }
        });
    }
}
