package com.example.android.quizapp1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 *
 *
 * Created by Spi_ros on 20/01/2018.
 */

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Snackbar snackbar = Snackbar.make(this.findViewById(R.id.myCoordinatorLayout),
                R.string.snackBar,
                Snackbar.LENGTH_INDEFINITE);
        snackbar.show();

       TextView t1 = findViewById(R.id.text1);
       TextView t2 = findViewById(R.id.text2);
       TextView t4 = findViewById(R.id.text4);
       TextView t5 = findViewById(R.id.text5);
       TextView t6 = findViewById(R.id.text6);
       TextView t7 = findViewById(R.id.text7);
       TextView t8 = findViewById(R.id.text8);
       TextView t9 = findViewById(R.id.text9);
       TextView t10 = findViewById(R.id.text10);
       TextView t11 = findViewById(R.id.text11);
       TextView t12 = findViewById(R.id.text12);
       TextView t13 = findViewById(R.id.text13);
       TextView t14 = findViewById(R.id.text14);
       TextView t15 = findViewById(R.id.text15);

        Intent i = this.getIntent();

        if (i != null) {
            String strData = i.getExtras().getString("Uniqid");

            if (strData.equals("From_Activity_Second")) {

                final LinearLayout linearLayout = findViewById(R.id.score_layout);
                linearLayout.setBackgroundResource(R.drawable.europe_watercolor_1);
                linearLayout.getBackground().setAlpha(125);

                final String result1 = i.getExtras().getString("STRING_I_NEED_1");
                final String result3 = i.getExtras().getString("STRING_I_NEED_3");
                final String result4 = i.getExtras().getString("STRING_I_NEED_4");
                final String result5 = i.getExtras().getString("STRING_I_NEED_5");
                final String result6 = i.getExtras().getString("STRING_I_NEED_6");
                final String result7 = i.getExtras().getString("STRING_I_NEED_7");
                final String result8 = i.getExtras().getString("STRING_I_NEED_8");

                String answer1 = i.getExtras().getString("STRING_ANSWER_1");
                String answer2 = i.getExtras().getString("STRING_ANSWER_2");
                String answer3 = i.getExtras().getString("STRING_ANSWER_3");
                String answer4 = i.getExtras().getString("STRING_ANSWER_4");
                String answer5 = i.getExtras().getString("STRING_ANSWER_5");
                String answer6 = i.getExtras().getString("STRING_ANSWER_6");

                t1.setText(result1);
                t2.setText(R.string.answers);
                t5.setText(answer1);
                t5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result3, Toast.LENGTH_SHORT).show();
                    }
                });
                t7.setText(answer2);
                t7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result4, Toast.LENGTH_SHORT).show();
                    }
                });
                t9.setText(answer3);
                t9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result5, Toast.LENGTH_SHORT).show();
                    }
                });
                t11.setText(answer4);
                t11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result6, Toast.LENGTH_SHORT).show();
                    }
                });
                t13.setText(answer5);
                t13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result7, Toast.LENGTH_SHORT).show();
                    }
                });
                t15.setText(answer6);
                t15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result8, Toast.LENGTH_SHORT).show();
                    }
                });
                t4.setText(R.string.question_1);
                t6.setText(R.string.question_2);
                t8.setText(R.string.question_3);
                t10.setText(R.string.question_4);
                t12.setText(R.string.question_5);
                t14.setText(R.string.question_6);
            }

            if (strData.equals("From_Activity_Fourth")) {

                final LinearLayout linearLayout = findViewById(R.id.score_layout);
                linearLayout.setBackgroundResource(R.drawable.african_masks);
                linearLayout.getBackground().setAlpha(125);

                final String result1 = i.getExtras().getString("STRING_I_NEED_1");
                final String result3 = i.getExtras().getString("STRING_I_NEED_3");
                final String result4 = i.getExtras().getString("STRING_I_NEED_4");
                final String result5 = i.getExtras().getString("STRING_I_NEED_5");
                final String result6 = i.getExtras().getString("STRING_I_NEED_6");
                final String result7 = i.getExtras().getString("STRING_I_NEED_7");
                final String result8 = i.getExtras().getString("STRING_I_NEED_8");

                String answer1 = i.getExtras().getString("STRING_ANSWER_1");
                String answer2 = i.getExtras().getString("STRING_ANSWER_2");
                String answer3 = i.getExtras().getString("STRING_ANSWER_3");
                String answer4 = i.getExtras().getString("STRING_ANSWER_4");
                String answer5 = i.getExtras().getString("STRING_ANSWER_5");
                String answer6 = i.getExtras().getString("STRING_ANSWER_6");

                t1.setText(result1);
                t2.setText(R.string.answers);
                t5.setText(answer1);
                t5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result3, Toast.LENGTH_SHORT).show();
                    }
                });
                t7.setText(answer2);
                t7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result4, Toast.LENGTH_SHORT).show();
                    }
                });
                t9.setText(answer3);
                t9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result5, Toast.LENGTH_SHORT).show();
                    }
                });
                t11.setText(answer4);
                t11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result6, Toast.LENGTH_SHORT).show();
                    }
                });
                t13.setText(answer5);
                t13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result7, Toast.LENGTH_SHORT).show();
                    }
                });
                t15.setText(answer6);
                t15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ThirdActivity.this, result8, Toast.LENGTH_SHORT).show();
                    }
                });
                t4.setText(R.string.question_1);
                t6.setText(R.string.question_2);
                t8.setText(R.string.question_3);
                t10.setText(R.string.question_4);
                t12.setText(R.string.question_5);
                t14.setText(R.string.question_6);
            }
        }
    }
}
