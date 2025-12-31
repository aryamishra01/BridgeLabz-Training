package com.objectmodeling.selfproblems.problem1;

public class DemonstrateRelationshipsMain {

	    public static void main(String[] args) {

	        // Create School
	        School school = new School("St. Xavier's School");

	        // Create Students
	        Student s1 = new Student(101, "Arya");
	        Student s2 = new Student(102, "Shraddha");

	        // Add students to school (Aggregation)
	        school.addStudent(s1);
	        school.addStudent(s2);

	        // Create Courses
	        Course c1 = new Course("Java Programming");
	        Course c2 = new Course("Data Structures");

	        // Enroll students in courses (Association)
	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);

	        s2.enrollCourse(c1);

	        // Display data
	        school.showStudents();

	        System.out.println();
	        s1.viewCourses();

	        System.out.println();
	        c1.showEnrolledStudents();
	    }
}


