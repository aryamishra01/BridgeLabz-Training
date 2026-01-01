package com.inheritance.assistedproblems.problem2;

//Base class for all employees
public class Employee {

 protected int id;
 protected String name;
 protected double salary;

 public Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 // Method to be overridden by subclasses
 public void displayDetails() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
 }
}

