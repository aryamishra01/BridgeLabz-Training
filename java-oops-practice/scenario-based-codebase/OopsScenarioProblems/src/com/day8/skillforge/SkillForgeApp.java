package com.day8.skillforge;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SkillForgeApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("     WELCOME TO SKILLFORGE PORTAL     ");
        System.out.println("*************************************");

        System.out.println("Choose Role:");
        System.out.println("1. Instructor");
        System.out.println("2. Student");
        System.out.print("Enter choice: ");
        int role = sc.nextInt();
        sc.nextLine();

        if (role == 1) {
            // Instructor Flow
            System.out.print("Enter Instructor Name: ");
            String instName = sc.nextLine();
            Instructor instructor = new Instructor(instName);

            System.out.print("Enter Course Title: ");
            String courseTitle = sc.nextLine();

            System.out.print("Enter number of custom modules (0 for default): ");
            int count = sc.nextInt();
            sc.nextLine();

            Course course;
            if (count > 0) {
                List<String> mods = new ArrayList<>();
                for (int i = 1; i <= count; i++) {
                    System.out.print("Enter module " + i + ": ");
                    mods.add(sc.nextLine());
                }
                course = new Course(courseTitle, instructor, mods);
            } else {
                course = new Course(courseTitle, instructor);
            }

            instructor.uploadCourse(course);
            course.showCourseDetails();
            course.showInternalReviews();

        } else if (role == 2) {
            // Student Flow
            System.out.print("Enter Student Name: ");
            String stuName = sc.nextLine();
            Student student = new Student(stuName);

            System.out.print("Enter Course Title: ");
            String courseTitle = sc.nextLine();

            System.out.print("Enter Instructor Name: ");
            String instName = sc.nextLine();
            Instructor instructor = new Instructor(instName);

            Course course = new Course(courseTitle, instructor);
            course.showCourseDetails();

            System.out.print("Enter Student Grade (0-100): ");
            student.updateGrade(sc.nextDouble());

            System.out.print("Enter Progress %: ");
            student.completeModule(sc.nextDouble());

            System.out.print("Enter Course Rating (0-5): ");
            course.submitRating(student, sc.nextDouble());

            System.out.println("\nStudent Progress: " + student.getProgress() + "%");
            course.generateCertificate(student);

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}