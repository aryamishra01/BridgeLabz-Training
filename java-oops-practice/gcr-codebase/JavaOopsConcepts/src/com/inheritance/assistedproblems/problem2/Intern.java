package com.inheritance.assistedproblems.problem2;

//Intern is a type of Employee
class Intern extends Employee {

 private int durationMonths;

 public Intern(int id, String name, double salary, int durationMonths) {
     super(id, name, salary);
     this.durationMonths = durationMonths;
 }

 // Overriding method
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Internship Duration: " + durationMonths + " months");
 }
}
