package com.day4.hospitalqueue;

import java.util.Scanner;

public class HospitalQueueUsingBubbleSort {

	// Bubble sort method to sort patients by criticality in descending order
    // Higher criticality means more serious patient
    static void bubbleSortByCriticality(Patient[] patients, int n) {

        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent patients
            for (int j = 0; j < n - i - 1; j++) {

                // If current patient is less critical than next patient, swap them
                if (patients[j].criticality < patients[j + 1].criticality) {

                    // Swapping patient records without using extra memory
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }
    
    // Method to display patient list
    static void displayPatients(Patient[] patients, int n) {
        System.out.println("Name\tArrivalTime\tCriticality");

        for (int i = 0; i < n; i++) {
            System.out.println(
                patients[i].name + "\t" +
                patients[i].arrivalTime + "\t\t" +
                patients[i].criticality
            );
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of patients from user
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        // Input patient details in arrival order
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for patient " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter arrival time: ");
            int arrivalTime = sc.nextInt();

            System.out.print("Enter criticality level from 1 to 10: ");
            int criticality = sc.nextInt();

            patients[i] = new Patient(name, arrivalTime, criticality);
        }

        // Display before sorting
        System.out.println("\nPatients list before sorting by criticality");
        displayPatients(patients, n);

        // Sorting patients using bubble sort
        bubbleSortByCriticality(patients, n);

        // Display after sorting
        System.out.println("\nPatients list after sorting by criticality");
        displayPatients(patients, n);

        sc.close();
    }
}
