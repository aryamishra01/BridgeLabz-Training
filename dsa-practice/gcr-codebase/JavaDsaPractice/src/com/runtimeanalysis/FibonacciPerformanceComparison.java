package com.runtimeanalysis;

import java.util.Scanner;

class FibonacciPerformanceComparison {

    // Recursive Fibonacci (exponential time)
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (linear time)
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Fibonacci number position
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        // Recursive approach (skip for large N)
        if (n <= 30) {
            long start = System.nanoTime();
            int recResult = fibonacciRecursive(n);
            long recTime = System.nanoTime() - start;
            System.out.println("Recursive Result: " + recResult);
            System.out.println("Recursive Time (ms): " + recTime / 1_000_000.0);
        } else {
            System.out.println("Recursive Approach: Unfeasible for large N");
        }

        // Iterative approach
        long start = System.nanoTime();
        int itrResult = fibonacciIterative(n);
        long itrTime = System.nanoTime() - start;
        System.out.println("Iterative Result: " + itrResult);
        System.out.println("Iterative Time (ms): " + itrTime / 1_000_000.0);

        sc.close();
    }
}

