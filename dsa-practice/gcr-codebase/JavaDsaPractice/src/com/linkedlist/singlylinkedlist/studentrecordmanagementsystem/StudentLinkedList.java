package com.linkedlist.singlylinkedlist.studentrecordmanagementsystem;

//This class manages student records using a singly linked list
public class StudentLinkedList {

	 private StudentNode head;
	
	 // Constructor
	 public StudentLinkedList() {
	     head = null;
	 }
	
	 // Add student at beginning
	 public void addAtBeginning(int roll, String name, int age, char grade) {
	
	     StudentNode newNode = new StudentNode(roll, name, age, grade);
	     newNode.next = head;
	     head = newNode;
	
	     System.out.println("Student added at beginning");
	 }
	
	 // Add student at end
	 public void addAtEnd(int roll, String name, int age, char grade) {
	
	     StudentNode newNode = new StudentNode(roll, name, age, grade);
	
	     if (head == null) {
	         head = newNode;
	         System.out.println("Student added as first record");
	         return;
	     }
	
	     StudentNode temp = head;
	     while (temp.next != null) {
	         temp = temp.next;
	     }
	
	     temp.next = newNode;
	     System.out.println("Student added at end");
	 }
	
	 // Add student at specific position (1-based index)
	 public void addAtPosition(int position, int roll,
	                           String name, int age, char grade) {
	
	     if (position <= 1) {
	         addAtBeginning(roll, name, age, grade);
	         return;
	     }
	
	     StudentNode newNode = new StudentNode(roll, name, age, grade);
	     StudentNode temp = head;
	     int count = 1;
	
	     while (temp != null && count < position - 1) {
	         temp = temp.next;
	         count++;
	     }
	
	     if (temp == null) {
	         System.out.println("Invalid position");
	         return;
	     }
	
	     newNode.next = temp.next;
	     temp.next = newNode;
	
	     System.out.println("Student added at position " + position);
	 }
	
	 // Delete student by roll number
	 public void deleteByRoll(int roll) {
	
	     if (head == null) {
	         System.out.println("No student records available");
	         return;
	     }
	
	     if (head.rollNumber == roll) {
	         head = head.next;
	         System.out.println("Student record deleted");
	         return;
	     }
	
	     StudentNode temp = head;
	
	     while (temp.next != null && temp.next.rollNumber != roll) {
	         temp = temp.next;
	     }
	
	     if (temp.next == null) {
	         System.out.println("Student not found");
	     } else {
	         temp.next = temp.next.next;
	         System.out.println("Student record deleted");
	     }
	 }
	
	 // Search student by roll number
	 public void searchByRoll(int roll) {
	
	     StudentNode temp = head;
	
	     while (temp != null) {
	         if (temp.rollNumber == roll) {
	             System.out.println("Roll Number: " + temp.rollNumber);
	             System.out.println("Name: " + temp.name);
	             System.out.println("Age: " + temp.age);
	             System.out.println("Grade: " + temp.grade);
	             return;
	         }
	         temp = temp.next;
	     }
	
	     System.out.println("Student not found");
	 }
	
	 // Update student grade by roll number
	 public void updateGrade(int roll, char newGrade) {
	
	     StudentNode temp = head;
	
	     while (temp != null) {
	         if (temp.rollNumber == roll) {
	             temp.grade = newGrade;
	             System.out.println("Grade updated successfully");
	             return;
	         }
	         temp = temp.next;
	     }
	
	     System.out.println("Student not found");
	 }
	
	 // Display all student records
	 public void displayAll() {
	
	     if (head == null) {
	         System.out.println("No student records available");
	         return;
	     }
	
	     StudentNode temp = head;
	
	     System.out.println("\nStudent Records:");
	     while (temp != null) {
	         System.out.println("Roll Number: " + temp.rollNumber);
	         System.out.println("Name: " + temp.name);
	         System.out.println("Age: " + temp.age);
	         System.out.println("Grade: " + temp.grade);
	         System.out.println("-------------------");
	         temp = temp.next;
	     }
	 }
}
