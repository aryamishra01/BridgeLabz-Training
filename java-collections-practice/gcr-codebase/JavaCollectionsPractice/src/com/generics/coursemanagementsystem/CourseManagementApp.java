package com.generics.coursemanagementsystem;

public class CourseManagementApp {

	public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", "Science", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

        Course<ResearchCourse> ai =
                new Course<>("AI Research", "Engineering", new ResearchCourse());

        CourseManager manager = new CourseManager();
        manager.addCourse(math);
        manager.addCourse(cs);
        manager.addCourse(ai);

        manager.displayCourses();
    }
}
