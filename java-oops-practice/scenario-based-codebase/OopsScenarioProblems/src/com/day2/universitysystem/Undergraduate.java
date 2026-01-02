package com.day2.universitysystem;

public class Undergraduate extends Student implements Graded {

    public Undergraduate(int id, String name) {
        super(id, name);
        this.level = "Undergraduate";
    }

    @Override
    public void assignGrade(double marks) {
        // Pass/Fail grading
        if (marks >= 40) {
            setGpa(4.0);
        } else {
            setGpa(0.0);
        }
    }
}
