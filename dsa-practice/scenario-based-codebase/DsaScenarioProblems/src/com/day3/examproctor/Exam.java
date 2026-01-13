package com.day3.examproctor;

import java.util.*;

/*
 * Represents an exam with questions and correct answers
 */
public class Exam {

    // questionID -> correctAnswer
    private HashMap<Integer, String> answerKey;

    public Exam() {
        answerKey = new HashMap<>();
        loadAnswers();
    }

    // Load correct answers (mock data)
    private void loadAnswers() {
        answerKey.put(1, "A");
        answerKey.put(2, "B");
        answerKey.put(3, "C");
        answerKey.put(4, "D");
    }

    public HashMap<Integer, String> getAnswerKey() {
        return answerKey;
    }
}

