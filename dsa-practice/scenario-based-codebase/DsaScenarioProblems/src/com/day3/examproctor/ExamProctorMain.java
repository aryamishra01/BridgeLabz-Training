package com.day3.examproctor;

import java.util.*;

public class ExamProctorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();
        ExamProctor proctor = new ExamProctor();

        while (true) {
            System.out.println("\n--- Online Exam Menu ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. Last Visited Question");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Question ID: ");
                int qId = sc.nextInt();
                proctor.visitQuestion(qId);

            } else if (choice == 2) {
                System.out.print("Enter Question ID: ");
                int qId = sc.nextInt();
                System.out.print("Enter Answer (A/B/C/D): ");
                String ans = sc.next();
                proctor.submitAnswer(qId, ans);

            } else if (choice == 3) {
                proctor.showLastVisited();

            } else if (choice == 4) {
                int score = proctor.evaluate(exam.getAnswerKey());
                System.out.println("\nExam Submitted!");
                System.out.println("Final Score: " + score + "/" + exam.getAnswerKey().size());
                break;

            } else if (choice == 5) {
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}

