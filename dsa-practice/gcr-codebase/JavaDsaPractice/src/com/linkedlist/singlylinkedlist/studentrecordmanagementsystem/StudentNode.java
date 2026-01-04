package com.linkedlist.singlylinkedlist.studentrecordmanagementsystem;

//This class represents a single student record (node)
public class StudentNode {

	 int rollNumber;        // Student roll number
	 String name;           // Student name
	 int age;               // Student age
	 char grade;            // Student grade
	
	 StudentNode next;      // Reference to next node
	
	 // Constructor to initialize student details
	 public StudentNode(int rollNumber, String name, int age, char grade) {
	     this.rollNumber = rollNumber;
	     this.name = name;
	     this.age = age;
	     this.grade = grade;
	     this.next = null;
	 }
}
