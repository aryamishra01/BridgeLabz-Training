package com.day5.edumentor;

import java.util.Scanner;

public class EduMentorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Learner details
        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Type (short/full-time): ");
        String courseType = sc.nextLine();

        Learner learner = new Learner(name, email, userId, courseType);

        // Quiz difficulty
        System.out.print("Enter Quiz Difficulty (Easy/Medium/Hard): ");
        String difficulty = sc.nextLine();

        Quiz quiz = new Quiz(difficulty);

        System.out.println("\n--- Quiz Started ---");
        quiz.startQuiz();

        double percentage = quiz.calculatePercentage();

        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + percentage + "%");

        // Certificate generation (polymorphism)
        learner.generateCertificate(percentage);

        sc.close();
    }
}
