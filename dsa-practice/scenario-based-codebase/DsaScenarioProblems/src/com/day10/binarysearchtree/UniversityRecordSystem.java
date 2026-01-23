package com.day10.binarysearchtree;

import java.util.Scanner;

public class UniversityRecordSystem {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentBST bst = new StudentBST();
        int choice;

        do {
            System.out.println("\n====== University Digital Record System ======");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students (Sorted)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    bst.insert(roll, name, dept);
                    break;

                case 2:
                    System.out.print("Enter Roll No to delete: ");
                    bst.delete(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    bst.search(sc.nextInt());
                    break;

                case 4:
                    bst.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
