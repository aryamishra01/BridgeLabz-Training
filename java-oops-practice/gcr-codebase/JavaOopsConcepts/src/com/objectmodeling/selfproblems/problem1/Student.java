package com.objectmodeling.selfproblems.problem1;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Enroll student in course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // association link
    }

    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

