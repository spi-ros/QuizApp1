package com.example.android.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView europe = findViewById(R.id.europe_quiz);
        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void  onClick(View view){

                Intent euroIntent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(euroIntent);
            }
        });

        TextView africa = findViewById(R.id.africa_quiz);
        africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void  onClick(View view){

                Intent afroIntent = new Intent(FirstActivity.this, FourthActivity.class);
                startActivity(afroIntent);
            }
        });
    }
}
