package com.day4.examcell;

import java.util.Scanner;

public class ExamCellUsingMergeSort {

	// Merge sort method to sort students by score in descending order
    static void mergeSort(Student[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Divide the array into two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted parts of the array
    static void merge(Student[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Merge by score in descending order for rank list
        while (i < n1 && j < n2) {

            if (L[i].score >= R[j].score) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements from right array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Method to display rank list
    static void displayRanks(Student[] arr, int n) {
        System.out.println("Rank\tStudentID\tScore");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + arr[i].id + "\t\t" + arr[i].score);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        // Taking input of student scores collected from all centers
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Enter student id: ");
            int id = sc.nextInt();

            System.out.print("Enter score: ");
            int score = sc.nextInt();

            students[i] = new Student(id, score);
        }

        // Display before sorting
        System.out.println("\nScores before generating rank list");
        displayRanks(students, n);

        // Apply merge sort to generate rank list
        mergeSort(students, 0, n - 1);

        // Display after sorting
        System.out.println("\nFinal state level rank list");
        displayRanks(students, n);

        sc.close();
    }
}
