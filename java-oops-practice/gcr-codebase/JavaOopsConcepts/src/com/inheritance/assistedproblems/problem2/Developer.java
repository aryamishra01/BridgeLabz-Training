package com.inheritance.assistedproblems.problem2;

//Developer is a type of Employee
class Developer extends Employee {

 private String programmingLanguage;

 public Developer(int id, String name, double salary, String programmingLanguage) {
     super(id, name, salary);
     this.programmingLanguage = programmingLanguage;
 }

 // Overriding method
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

