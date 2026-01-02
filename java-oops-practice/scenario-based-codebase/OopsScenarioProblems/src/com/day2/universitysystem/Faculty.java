package com.day2.universitysystem;

public class Faculty {

    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public void assignGrade(Graded student, double marks) {
        student.assignGrade(marks);
    }
}
