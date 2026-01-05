package com.day4.campusconnect;

//Student Class
class Student extends Person implements ICourseActions {
	 private int[] grades; // encapsulation
	 private double gpa;
	
	 Student(int id, String name, String email, int[] grades) {
	     super(id, name, email);
	     this.grades = grades;
	     calculateGPA();
	 }
	
	 private void calculateGPA() {
	     int sum = 0;
	     for (int g : grades) {
	         sum = sum + g;   // operator usage
	     }
	     gpa = sum / (double) grades.length;
	 }
	
	 @Override
	 public void enrollCourse(String courseName) {
	     System.out.println(name + " enrolled in " + courseName);
	 }
	
	 @Override
	 public void dropCourse(String courseName) {
	     System.out.println(name + " dropped " + courseName);
	 }
	
	 @Override
	 void printDetails() {
	     super.printDetails();
	     System.out.println("Role: Student");
	     System.out.println("GPA: " + gpa);
	 }
}

