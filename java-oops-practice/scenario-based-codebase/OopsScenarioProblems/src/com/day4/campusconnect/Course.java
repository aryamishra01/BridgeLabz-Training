package com.day4.campusconnect;

import java.util.ArrayList;
import java.util.List;

//Course Class
class Course {
	 String courseName;
	 Faculty faculty;
	 List<Student> students = new ArrayList<>();
	
	 Course(String courseName, Faculty faculty) {
	     this.courseName = courseName;
	     this.faculty = faculty;
	 }
	
	 void addStudent(Student s) {
	     students.add(s);
	     s.enrollCourse(courseName);
	 }
	
	 void showCourseDetails() {
	     System.out.println("\nCourse: " + courseName);
	     System.out.println("Faculty: " + faculty.name);
	     System.out.println("Enrolled Students:");
	     for (Student s : students) {
	         System.out.println("- " + s.name);
	     }
	 }
}
