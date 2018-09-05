package com.example.sthal.quizwithsql;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class QuizActivity extends AppCompatActivity {
    private TextView mTextViewQuestion;
    private TextView mTextViewScore;
    private TextView mTextViewQuestionCount;
    private TextView mTextViewCountDown;
    private RadioGroup mRadioGroup;
    private RadioButton mRBtn1;
    private RadioButton mRBtn2;
    private RadioButton mRBtn3;
    private Button mButtonConfirmNext;

    private List<Question> questionList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTextViewQuestion = findViewById(R.id.text_view_question);
        mTextViewScore = findViewById(R.id.text_view_score);
        mTextViewQuestionCount = findViewById(R.id.text_view_question_count);
        mTextViewQuestionCount = findViewById(R.id.text_view_countdown);
        mRadioGroup = findViewById(R.id.radio_group);
        mRBtn1 = findViewById(R.id.radio_button1);
        mRBtn2 = findViewById(R.id.radio_button2);
        mRBtn3 = findViewById(R.id.radio_button3);
        mButtonConfirmNext = findViewById(R.id.button_confirm_next);

        // initialize
        QuizDbHelper dbHelper = new QuizDbHelper(this);

        // create DB, fill List with data
        questionList = dbHelper.getAllQuestions();



    }
}
