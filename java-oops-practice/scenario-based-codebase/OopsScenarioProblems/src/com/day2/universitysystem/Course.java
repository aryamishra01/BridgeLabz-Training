package com.day2.universitysystem;

public class Course {

    private String courseCode;
    private String title;
    private int credits;

    public Course(String courseCode, String title, int credits) {
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
    }

    public void displayCourse() {
        System.out.println(courseCode + " - " + title + " (" + credits + " credits)");
    }
}
