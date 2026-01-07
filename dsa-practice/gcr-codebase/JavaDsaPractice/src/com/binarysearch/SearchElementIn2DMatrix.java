package com.binarysearch;

import java.util.Scanner;

public class SearchElementIn2DMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Take matrix elements
        System.out.println("Enter matrix elements (row-wise sorted):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Take target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        boolean found = binarySearchMatrix(matrix, rows, cols, target);

        // Print result
        if (found) {
            System.out.println("Target found: true");
        } else {
            System.out.println("Target found: false");
        }

        sc.close();
    }

    // Method to perform binary search on 2D matrix
    public static boolean binarySearchMatrix(int[][] matrix, int rows, int cols, int target) {

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            // Convert 1D index to 2D indices
            int row = mid / cols;
            int col = mid % cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (target < midValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}

