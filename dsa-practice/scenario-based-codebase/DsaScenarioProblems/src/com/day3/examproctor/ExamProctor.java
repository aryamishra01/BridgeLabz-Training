package com.day3.examproctor;

import java.util.*;

/*
 * Handles navigation, answer storage, and evaluation
 */
public class ExamProctor {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> studentAnswers;

    public ExamProctor() {
        navigationStack = new Stack<>();
        studentAnswers = new HashMap<>();
    }

    // Record question navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question " + questionId);
    }

    // Store or update answer (accept uppercase & lowercase)
    public void submitAnswer(int questionId, String answer) {
        if (answer == null || answer.isEmpty()) {
            System.out.println("Invalid answer.");
            return;
        }
        // Normalize to uppercase internally
        studentAnswers.put(questionId, answer.trim().toUpperCase());
        System.out.println("Answer saved for Question " + questionId);
    }

    // Show last visited question
    public void showLastVisited() {
        if (!navigationStack.isEmpty()) {
            System.out.println("Last Visited Question: " + navigationStack.peek());
        } else {
            System.out.println("No navigation history.");
        }
    }

    // Evaluate score using function
    public int evaluate(HashMap<Integer, String> correctAnswers) {

        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qId) &&
                studentAnswers.get(qId).equalsIgnoreCase(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
