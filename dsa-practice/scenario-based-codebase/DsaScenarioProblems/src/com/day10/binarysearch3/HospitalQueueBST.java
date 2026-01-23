package com.day10.binarysearch3;

import java.util.Scanner;

public class HospitalQueueBST {

	static int arrivalCounter = 1000; // auto-generated arrival ID

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientBST bst = new PatientBST();
        int choice;

        do {
            System.out.println("\n====== Hospital Queue Management ======");
            System.out.println("1. Register Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Search Patient");
            System.out.println("4. Display Patients by Arrival Time");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    arrivalCounter++;
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Problem: ");
                    String problem = sc.nextLine();

                    bst.register(arrivalCounter, name, problem);
                    System.out.println("Arrival ID: " + arrivalCounter);
                    break;

                case 2:
                    System.out.print("Enter Arrival ID to discharge: ");
                    bst.discharge(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Arrival ID to search: ");
                    int id = sc.nextInt();
                    PatientNode p = bst.search(id);
                    if (p != null) {
                        System.out.println("Patient Found:");
                        System.out.println("ID: " + p.arrivalId);
                        System.out.println("Name: " + p.name);
                        System.out.println("Problem: " + p.problem);
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 4:
                    bst.displayAll();
                    break;

                case 5:
                    System.out.println("System Closed. Stay Healthy!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
