package com.day9.tailorshop;

import java.util.Scanner;

public class TailorShopUsingInsertionSort {

	static Order[] orders = new Order[0];
    static Scanner sc = new Scanner(System.in);

    // ---------------- MAIN MENU ----------------
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Tailor Shop Order System ---");
            System.out.println("1. Add New Order");
            System.out.println("2. View Orders");
            System.out.println("3. Sort Orders by Deadline (Insertion Sort)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addOrder();
                    break;
                case 2:
                    display(orders);
                    break;
                case 3:
                    insertionSort(orders);
                    System.out.println("Orders sorted by deadline!");
                    break;
                case 4:
                    System.out.println("Thank you for using Tailor Shop System!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // -------- Add New Order (Insert into Nearly Sorted List) --------
    public static void addOrder() {

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Delivery Deadline (day number): ");
        int deadline = sc.nextInt();

        // increase array size by 1
        Order[] newArr = new Order[orders.length + 1];

        for (int i = 0; i < orders.length; i++) {
            newArr[i] = orders[i];
        }

        newArr[orders.length] = new Order(id, deadline);
        orders = newArr;

        // keep list sorted using insertion sort idea
        insertionSort(orders);

        System.out.println("Order added and placed in correct position!");
    }

    // -------- Insertion Sort by Deadline --------
    public static void insertionSort(Order[] arr) {

        for (int i = 1; i < arr.length; i++) {

            Order key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].deadline > key.deadline) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // -------- Display Orders --------
    public static void display(Order[] arr) {

        if (arr.length == 0) {
            System.out.println("No orders available.");
            return;
        }

        System.out.println("\nOrders by Delivery Deadline:");
        for (Order o : arr) {
            System.out.println("Order ID: " + o.orderId + " | Deadline Day: " + o.deadline);
        }
    }
}
