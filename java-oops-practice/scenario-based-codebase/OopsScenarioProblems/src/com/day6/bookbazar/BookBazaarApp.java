package com.day6.bookbazar;

import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Customer input
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        Order order = new Order(customerName);

        // Book selection
        System.out.println("Select Book Type: 1-EBook  2-Printed Book");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter Quantity to Buy: ");
        int quantity = sc.nextInt();

        Book book;

        // Runtime polymorphism
        if (choice == 1) {
            book = new EBook(title, author, price, stock);
        } else {
            book = new PrintedBook(title, author, price, stock);
        }

        order.addBook(book, quantity);

        order.updateStatus("CONFIRMED");

        System.out.println("\n--- Order Summary ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Total Amount: ₹" + order.calculateTotal());

        sc.close();
    }
}

