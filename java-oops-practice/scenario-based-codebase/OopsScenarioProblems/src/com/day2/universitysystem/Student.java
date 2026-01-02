package com.day2.universitysystem;

public class Student {

    private int studentId;
    private String name;
    private double gpa; // private → secured
    protected String level;

    // Constructor without electives
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with elective preference
    public Student(int studentId, String name, String elective) {
        this.studentId = studentId;
        this.name = name;
        System.out.println("Elective chosen: " + elective);
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    // Public transcript access
    public String getTranscript() {
        return "Student: " + name + " | Level: " + level + " | GPA: " + gpa;
    }

    // Polymorphic display
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
    }
}
