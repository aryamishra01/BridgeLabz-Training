package com.inheritance.multilevelinheritance.problem2;

public class Course {

    String courseName;
    int duration;   // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("*** Course Details ***");
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}

