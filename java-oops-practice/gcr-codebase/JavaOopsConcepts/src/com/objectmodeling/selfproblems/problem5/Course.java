package com.objectmodeling.selfproblems.problem5;

import java.util.ArrayList;
import java.util.List;

// Course connects students and professor
public class Course {

    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Called when professor is assigned
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Called when student enrolls
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display enrolled students
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
