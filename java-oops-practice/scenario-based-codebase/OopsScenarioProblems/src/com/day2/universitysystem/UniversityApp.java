package com.day2.universitysystem;

public class UniversityApp {

	public static void main(String[] args) {

        Course java = new Course("CS101", "Java Programming", 4);
        Course ai = new Course("AI501", "Artificial Intelligence", 5);

        Student ug = new Undergraduate(1, "Ravi");
        Student pg = new Postgraduate(2, "Anita", "Data Science");

        Faculty faculty = new Faculty(1001, "Dr. Mehta");

        Enrollment e1 = new Enrollment(ug, java);
        Enrollment e2 = new Enrollment(pg, ai);

        e1.showEnrollment();
        faculty.assignGrade((Graded) ug, 65);

        System.out.println(ug.getTranscript());

        System.out.println("--------------------------");

        e2.showEnrollment();
        faculty.assignGrade((Graded) pg, 88);

        System.out.println(pg.getTranscript());
    }
}
