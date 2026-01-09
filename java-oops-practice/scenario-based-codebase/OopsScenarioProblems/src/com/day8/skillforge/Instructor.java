package com.day8.skillforge;

class Instructor extends User {

    public Instructor(String name) {
        super(name);
    }

    public void uploadCourse(Course course) {
        System.out.println("Instructor " + name + " uploaded course: " + course.getTitle());
    }
}
