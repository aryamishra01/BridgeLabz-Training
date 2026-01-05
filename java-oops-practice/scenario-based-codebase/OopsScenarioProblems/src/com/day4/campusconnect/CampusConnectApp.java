package com.day4.campusconnect;

import java.util.Scanner;

//Main Class
public class CampusConnectApp {
	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	
	     // Faculty Input
	     System.out.print("Enter Faculty ID: ");
	     int fid = sc.nextInt();
	     sc.nextLine();
	
	     System.out.print("Enter Faculty Name: ");
	     String fname = sc.nextLine();
	
	     System.out.print("Enter Faculty Email: ");
	     String femail = sc.nextLine();
	
	     Faculty faculty = new Faculty(fid, fname, femail);
	
	     // Student Input
	     System.out.print("\nEnter Student ID: ");
	     int sid = sc.nextInt();
	     sc.nextLine();
	
	     System.out.print("Enter Student Name: ");
	     String sname = sc.nextLine();
	
	     System.out.print("Enter Student Email: ");
	     String semail = sc.nextLine();
	
	     int[] grades = new int[3];
	     System.out.println("Enter 3 marks:");
	     for (int i = 0; i < 3; i++) {
	         grades[i] = sc.nextInt();
	     }
	
	     Student student = new Student(sid, sname, semail, grades);
	
	     // Course
	     sc.nextLine();
	     System.out.print("\nEnter Course Name: ");
	     String courseName = sc.nextLine();
	
	     Course course = new Course(courseName, faculty);
	     course.addStudent(student);
	
	     // Polymorphism
	     System.out.println("\n--- Person Details ---");
	     Person p1 = student;
	     Person p2 = faculty;
	
	     p1.printDetails();
	     System.out.println();
	     p2.printDetails();
	
	     course.showCourseDetails();
	
	     sc.close();
	 }
}
