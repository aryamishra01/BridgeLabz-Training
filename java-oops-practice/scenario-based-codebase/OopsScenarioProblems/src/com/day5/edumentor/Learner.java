package com.day5.edumentor;

//Learner inherits User and implements ICertifiable
public class Learner extends User implements ICertifiable {

	 private String courseType; // short or full-time
	
	 public Learner(String name, String email, int userId, String courseType) {
	     super(name, email, userId);
	     this.courseType = courseType;
	 }
	
	 // Polymorphic behavior
	 @Override
	 public void generateCertificate(double percentage) {
	     if (courseType.equalsIgnoreCase("short")) {
	         if (percentage >= 60) {
	             System.out.println("Short Course Certificate Generated!");
	         } else {
	             System.out.println("Not eligible for Short Course Certificate.");
	         }
	     } else {
	         if (percentage >= 75) {
	             System.out.println("Full-Time Course Certificate Generated!");
	         } else {
	             System.out.println("Not eligible for Full-Time Certificate.");
	         }
	     }
	 }
}

