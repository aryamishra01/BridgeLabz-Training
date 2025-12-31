package com.objectmodeling.selfproblems.problem5;

import java.util.ArrayList;
import java.util.List;

// Professor teaches multiple courses (association)
public class Professor {

    private int id;
    private String name;
    private List<Course> courses;

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Communication: professor assigned to course
    public void assignProfessor(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setProfessor(this);
        }
    }

    // Display courses taught by professor
    public void showCourses() {
        System.out.println("Courses taught by Prof. " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

