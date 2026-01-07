package com.day5.edumentor;

//Instructor inherits User
public class Instructor extends User {

	 private String specialization;
	
	 public Instructor(String name, String email, int userId, String specialization) {
	     super(name, email, userId);
	     this.specialization = specialization;
	 }
	
	 public void displayInstructor() {
	     System.out.println("Instructor: " + name + " | Specialization: " + specialization);
	 }
}

