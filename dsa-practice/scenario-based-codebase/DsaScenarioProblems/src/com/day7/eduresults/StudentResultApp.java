package com.day7.eduresults;

import java.util.Scanner;

public class StudentResultApp {

	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        System.out.println("Welcome to EduResults Rank Sheet Generator");

	        System.out.print("Enter number of districts: ");
	        int districts = sc.nextInt();

	        Student[] allStudents = inputStudents(districts);

	        mergeSort(allStudents, 0, allStudents.length - 1);

	        displayRankList(allStudents);
	    }

	    // method to take input from user
	    static Student[] inputStudents(int districts) {

	        System.out.print("Enter total number of students: ");
	        int total = sc.nextInt();
	        sc.nextLine();

	        Student[] students = new Student[total];
	        int index = 0;

	        for (int i = 1; i <= districts; i++) {

	            System.out.println("Enter details for District " + i);
	            System.out.print("Number of students in this district: ");
	            int count = sc.nextInt();
	            sc.nextLine();

	            for (int j = 1; j <= count; j++) {

	                System.out.println("Student " + j);
	                System.out.print("Enter name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter marks: ");
	                int marks = sc.nextInt();
	                sc.nextLine();

	                students[index++] = new Student(name, "District " + i, marks);
	            }
	        }

	        return students;
	    }

	    // merge sort method
	    static void mergeSort(Student[] arr, int left, int right) {

	        if (left < right) {

	            int mid = (left + right) / 2;

	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            merge(arr, left, mid, right);
	        }
	    }

	    // merge two sorted parts
	    static void merge(Student[] arr, int left, int mid, int right) {

	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        Student[] L = new Student[n1];
	        Student[] R = new Student[n2];

	        for (int i = 0; i < n1; i++) {
	            L[i] = arr[left + i];
	        }

	        for (int j = 0; j < n2; j++) {
	            R[j] = arr[mid + 1 + j];
	        }

	        int i = 0, j = 0, k = left;

	        // sorting by marks descending to generate ranks
	        while (i < n1 && j < n2) {

	            if (L[i].marks > R[j].marks) {
	                arr[k++] = L[i++];
	            } else {
	                arr[k++] = R[j++];
	            }
	        }

	        while (i < n1) {
	            arr[k++] = L[i++];
	        }

	        while (j < n2) {
	            arr[k++] = R[j++];
	        }
	    }

	    // display final rank list
	    static void displayRankList(Student[] students) {

	        System.out.println("\nFinal State Rank List");
	        System.out.println("Rank  Name           District        Marks");

	        int rank = 1;

	        for (Student s : students) {

	            System.out.printf("%-5d %-14s %-15s %d\n",
	                    rank++, s.name, s.district, s.marks);
	        }
	    }
}
