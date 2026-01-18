package com.generics.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<? extends CourseType> c : courses) {
            System.out.println(c.getDetails());
        }
    }
}
