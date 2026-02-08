package com.librarymanagementsystem;

//Student user type
public class Student extends User {

	 public Student(String name) {
	     super(name);
	 }
	
	 public void role() {
	     System.out.println(name + " is a Student (limited borrowing)");
	 }
}

