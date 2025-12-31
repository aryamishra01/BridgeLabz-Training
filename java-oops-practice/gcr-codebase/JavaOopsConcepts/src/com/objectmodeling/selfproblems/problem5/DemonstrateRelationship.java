package com.objectmodeling.selfproblems.problem5;

public class DemonstrateRelationship {
	
	    public static void main(String[] args) {

	        // Create students
	        Student s1 = new Student(101, "Arya");
	        Student s2 = new Student(102, "Riya");

	        // Create professors
	        Professor p1 = new Professor(1, "Dr. Sharma");
	        Professor p2 = new Professor(2, "Dr. Mehta");

	        // Create courses
	        Course c1 = new Course("Data Structures");
	        Course c2 = new Course("Artificial Intelligence");

	        // Assign professors to courses
	        p1.assignProfessor(c1);
	        p2.assignProfessor(c2);

	        // Students enroll in courses
	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);
	        s2.enrollCourse(c1);

	        // Output
	        System.out.println();
	        s1.showCourses();

	        System.out.println();
	        c1.showStudents();

	        System.out.println();
	        p1.showCourses();
	  }
}
