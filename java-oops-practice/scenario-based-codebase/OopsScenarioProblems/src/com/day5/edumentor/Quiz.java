package com.day5.edumentor;

import java.util.Scanner;

//Quiz class
public class Quiz {

	 private String[] questions;   // internal question bank (private)
	 private final int[] answers;  // correct answers cannot be modified
	 private int score;
	 private String difficulty;
	
	 // Constructor with difficulty
	 public Quiz(String difficulty) {
	     this.difficulty = difficulty;
	
	     // Internal question bank (hidden)
	     questions = new String[] {
	         "Java is platform independent? (1.Yes 2.No)",
	         "OOP stands for? (1.Object Oriented Programming 2.Operational Output Process)",
	         "JVM converts bytecode to? (1.Machine code 2.Source code)"
	     };
	
	     answers = new int[] {1, 1, 1}; // final answers
	     score = 0;
	 }
	
	 // Conduct quiz
	 public void startQuiz() {
	     Scanner sc = new Scanner(System.in);
	
	     for (int i = 0; i < questions.length; i++) {
	         System.out.println(questions[i]);
	         int userAnswer = sc.nextInt();
	
	         // Operator usage for scoring
	         if (userAnswer == answers[i]) {
	             score += 10;
	         }
	     }
	 }
	
	 // Calculate percentage
	 public double calculatePercentage() {
	     return (score / (double)(questions.length * 10)) * 100;
	 }
	
	 public int getScore() {
	     return score;
	 }
}

