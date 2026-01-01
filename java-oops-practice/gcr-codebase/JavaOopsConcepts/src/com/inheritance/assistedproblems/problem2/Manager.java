package com.inheritance.assistedproblems.problem2;

//Manager is a type of Employee
class Manager extends Employee {

 private int teamSize;

 public Manager(int id, String name, double salary, int teamSize) {
     super(id, name, salary);
     this.teamSize = teamSize;
 }

 // Overriding method to include manager-specific details
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Team Size: " + teamSize);
 }
}
