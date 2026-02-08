package com.printshopjobscheduler;

import java.util.Scanner;

public class PrintShopScheduler {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of print jobs: ");
        int n = sc.nextInt();
        sc.nextLine();

        Thread[] threads = new Thread[n];

        // Step 1: Take all input first
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Job " + (i + 1));

            System.out.print("Job Name: ");
            String name = sc.nextLine();

            System.out.print("Number of pages: ");
            int pages = sc.nextInt();

            System.out.print("Priority (1-10): ");
            int priority = sc.nextInt();
            sc.nextLine();

            PrintJob job = new PrintJob(name, pages, priority);
            threads[i] = new Thread(job);
            threads[i].setPriority(priority);
        }

        long startTime = System.currentTimeMillis();

        // Step 2: Start threads after input
        System.out.println("\nStarting print jobs...\n");

        for (Thread t : threads) {
            t.start();
        }

        // Step 3: Wait for completion
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("All jobs completed in " + (endTime - startTime) + " ms");

        sc.close();
    }
}
