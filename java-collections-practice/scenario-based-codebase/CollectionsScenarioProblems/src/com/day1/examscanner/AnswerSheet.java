package com.day1.examscanner;

public class AnswerSheet<T> {
    String studentName;
    T subject;
    int score;

    public AnswerSheet(String studentName, T subject, int score) {
        this.studentName = studentName;
        this.subject = subject;
        this.score = score;
    }

    @Override
    public String toString() {
        return studentName + " | " + subject + " | Score: " + score;
    }
}

