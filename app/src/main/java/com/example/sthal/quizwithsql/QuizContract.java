package com.example.sthal.quizwithsql;

import android.provider.BaseColumns;

public final class QuizContract {

    // Container, can't create by accident
    private QuizContract() {}

    // Contains question in Database
    public static class QuestionsTable implements BaseColumns {

        // accessible, no instance, unchangeable
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";
    }
}
