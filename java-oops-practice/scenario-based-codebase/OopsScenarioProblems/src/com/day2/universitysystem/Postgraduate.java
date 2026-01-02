package com.day2.universitysystem;

public class Postgraduate extends Student implements Graded {

    public Postgraduate(int id, String name, String elective) {
        super(id, name, elective);
        this.level = "Postgraduate";
    }

    @Override
    public void assignGrade(double marks) {
        double gpa;

        if (marks >= 90)
            gpa = 4.0;
        else if (marks >= 80)
            gpa = 3.5;
        else if (marks >= 70)
            gpa = 3.0;
        else if (marks >= 60)
            gpa = 2.5;
        else
            gpa = 0.0;

        setGpa(gpa);
    }
}