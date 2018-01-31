package com.example.android.quizapp1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

/**
 *
 * Created by Spi_ros on 19/01/2018.
 */

public class SecondActivity extends AppCompatActivity {

    int score = 0;
    String master, userAns1, userAns2, userAns3, userAns4, userAns5, userAns6, strMaster1,
            strMaster2, strMaster3, strMaster4, strMaster5, strMaster6, strMaster7, strMaster8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final ScrollView scrollView = findViewById(R.id.europe_layout);
        scrollView.setBackgroundResource(R.drawable.europe_blue);
        scrollView.getBackground().setAlpha(80);

        final RadioGroup radioGroupOne = findViewById(R.id.radio_group1);
        final RadioGroup radioGroupTwo = findViewById(R.id.radio_group2);
        final RadioButton radioOneAns1 = findViewById(R.id.radio_1_1);
        final RadioButton radioOneAns2 = findViewById(R.id.radio_1_2);
        final RadioButton radioOneAns3 = findViewById(R.id.radio_1_3);
        final RadioButton radioTwoAns1 = findViewById(R.id.radio_2_1);
        final RadioButton radioTwoAns2 = findViewById(R.id.radio_2_2);
        final RadioButton radioTwoAns3 = findViewById(R.id.radio_2_3);

        final CheckBox chkQFiveAns1 = findViewById(R.id.check_1_1);
        final CheckBox chkQFiveAns2 = findViewById(R.id.check_1_2);
        final CheckBox chkQFiveAns3 = findViewById(R.id.check_1_3);
        final CheckBox chkQSixAns1 = findViewById(R.id.check_2_1);
        final CheckBox chkQSixAns2 = findViewById(R.id.check_2_2);
        final CheckBox chkQSixAns3 = findViewById(R.id.check_2_3);

        final EditText answer3EditBox = findViewById(R.id.answer3_edit_text);
        final EditText answer4EditBox = findViewById(R.id.answer4_edit_text);

        Button SubmitScore = findViewById(R.id.submit_answers);
        SubmitScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (radioGroupOne.getCheckedRadioButtonId()) {
                    case R.id.radio_1_1:
                        userAns1 = getString(R.string.euro_user_ans_12);
                        break;
                    case R.id.radio_1_2:
                        score += 1;
                        userAns1 = getString(R.string.euro_user_ans_11);
                        break;
                    case R.id.radio_1_3:
                        userAns1 = getString(R.string.euro_user_ans_14);
                        break;
                }
                if (!radioOneAns1.isChecked() && !radioOneAns2.isChecked() && !radioOneAns3.isChecked()) {
                    userAns1 = getString(R.string.euro_user_ans_13);
                }


                switch (radioGroupTwo.getCheckedRadioButtonId()) {
                    case R.id.radio_2_1:
                        score += 1;
                        userAns2 = getString(R.string.euro_user_ans_21);
                        break;
                    case R.id.radio_2_2:
                        userAns2 = getString(R.string.euro_user_ans_22);
                        break;
                    case R.id.radio_2_3:
                        userAns2 = getString(R.string.euro_user_ans_24);
                        break;
                }
                if (!radioTwoAns1.isChecked() && !radioTwoAns2.isChecked() && !radioTwoAns3.isChecked()) {
                    userAns2 = getString(R.string.euro_user_ans_23);
                }


                if (answer3EditBox.getText().toString().contains("Brussels") || answer3EditBox.getText().toString().contains("brussels")) {
                    score += 1;
                    userAns3 = getString(R.string.euro_user_ans_31);
                } else if (answer3EditBox.getText().toString().matches("")) {
                    userAns3 = getString(R.string.euro_user_ans_32);
                } else {
                    userAns3 = getString(R.string.euro_user_ans_33);
                }


                if (answer4EditBox.getText().toString().contains("Hej") || answer4EditBox.getText().toString().contains("hej")) {
                    score += 1;
                    userAns4 = getString(R.string.euro_user_ans_41);
                } else if (answer4EditBox.getText().toString().matches("")) {
                    userAns4 = getString(R.string.euro_user_ans_42);
                } else {
                    userAns4 = getString(R.string.euro_user_ans_43);
                }


                if (chkQFiveAns1.isChecked() && !chkQFiveAns2.isChecked() && chkQFiveAns3.isChecked()) {
                    score += 1;
                    userAns5 = getString(R.string.euro_user_ans_51);
                } else if (chkQFiveAns1.isChecked() && chkQFiveAns2.isChecked() && chkQFiveAns3.isChecked()) {
                    userAns5 = getString(R.string.euro_user_ans_52);
                } else if (chkQFiveAns1.isChecked() && chkQFiveAns2.isChecked() && !chkQFiveAns3.isChecked()) {
                    userAns5 = getString(R.string.euro_user_ans_53);
                } else if (!chkQFiveAns1.isChecked() && chkQFiveAns2.isChecked() && chkQFiveAns3.isChecked()) {
                    userAns5 = getString(R.string.euro_user_ans_54);
                } else if (chkQFiveAns1.isChecked() && !chkQFiveAns2.isChecked() && !chkQFiveAns3.isChecked()) {
                    userAns5 = getString(R.string.euro_user_ans_55);
                } else if (!chkQFiveAns1.isChecked() && chkQFiveAns2.isChecked() && !chkQFiveAns3.isChecked()) {
                    userAns5 = getString(R.string.euro_user_ans_56);
                } else if (!chkQFiveAns1.isChecked() && !chkQFiveAns2.isChecked() && chkQFiveAns3.isChecked()) {
                    userAns5 = getString(R.string.euro_user_ans_57);
                } else {
                    userAns5 = getString(R.string.euro_user_ans_58);
                }


                if (chkQSixAns1.isChecked() && !chkQSixAns2.isChecked() && chkQSixAns3.isChecked()) {
                    score += 1;
                    userAns6 = getString(R.string.euro_user_ans_61);
                } else if (chkQSixAns1.isChecked() && chkQSixAns2.isChecked() && chkQSixAns3.isChecked()) {
                    userAns6 = getString(R.string.euro_user_ans_62);
                } else if (chkQSixAns1.isChecked() && chkQSixAns2.isChecked() && !chkQSixAns3.isChecked()) {
                    userAns6 = getString(R.string.euro_user_ans_63);
                } else if (!chkQSixAns1.isChecked() && chkQSixAns2.isChecked() && chkQSixAns3.isChecked()) {
                    userAns6 = getString(R.string.euro_user_ans_64);
                } else if (chkQSixAns1.isChecked() && !chkQSixAns2.isChecked() && !chkQSixAns3.isChecked()) {
                    userAns6 = getString(R.string.euro_user_ans_65);
                } else if (!chkQSixAns1.isChecked() && chkQSixAns2.isChecked() && !chkQSixAns3.isChecked()) {
                    userAns6 = getString(R.string.euro_user_ans_66);
                } else if (!chkQSixAns1.isChecked() && !chkQSixAns2.isChecked() && chkQSixAns3.isChecked()) {
                    userAns6 = getString(R.string.euro_user_ans_67);
                } else {
                    userAns6 = getString(R.string.euro_user_ans_68);
                }

                master = getResources().getString(R.string.score);
                strMaster1 = String.format(master, score);
                strMaster2 = getString(R.string.euro_answers);
                strMaster3 = getString(R.string.euro_stringAns1);
                strMaster4 = getString(R.string.euro_stringAns2);
                strMaster5 = getString(R.string.euro_stringAns3);
                strMaster6 = getString(R.string.euro_stringAns4);
                strMaster7 = getString(R.string.euro_stringAns5);
                strMaster8 = getString(R.string.euro_stringAns6);

                Intent i = new Intent();
                i.setClass(SecondActivity.this, ThirdActivity.class);
                i.putExtra("Uniqid", "From_Activity_Second");
                i.putExtra("STRING_I_NEED_1", strMaster1);
                i.putExtra("STRING_I_NEED_2", strMaster2);
                i.putExtra("STRING_I_NEED_3", strMaster3);
                i.putExtra("STRING_I_NEED_4", strMaster4);
                i.putExtra("STRING_I_NEED_5", strMaster5);
                i.putExtra("STRING_I_NEED_6", strMaster6);
                i.putExtra("STRING_I_NEED_7", strMaster7);
                i.putExtra("STRING_I_NEED_8", strMaster8);
                i.putExtra("STRING_ANSWER_1", userAns1);
                i.putExtra("STRING_ANSWER_2", userAns2);
                i.putExtra("STRING_ANSWER_3", userAns3);
                i.putExtra("STRING_ANSWER_4", userAns4);
                i.putExtra("STRING_ANSWER_5", userAns5);
                i.putExtra("STRING_ANSWER_6", userAns6);
                startActivity(i);
            }
        });
    }

    /**
     * This method hides the keyboard if the user touches anywhere else on the screen
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int screen[] = new int[2];
            view.getLocationOnScreen(screen);
            float x = ev.getRawX() + view.getLeft() - screen[0];
            float y = ev.getRawY() + view.getTop() - screen[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }
}


