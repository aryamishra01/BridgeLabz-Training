package com.day7.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking medicine details from user
        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price per unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        LocalDate expiryDate = LocalDate.parse(sc.next());

        System.out.println("\nSelect Medicine Type:");
        System.out.println("1. Tablet");
        System.out.println("2. Syrup");
        System.out.println("3. Injection");
        int choice = sc.nextInt();

        Medicine medicine = null;

        // Polymorphism: object created based on user choice
        switch (choice) {
            case 1:
                medicine = new Tablet(name, price, expiryDate, quantity);
                break;
            case 2:
                medicine = new Syrup(name, price, expiryDate, quantity);
                break;
            case 3:
                medicine = new Injection(name, price, expiryDate, quantity);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Check expiry
        if (medicine.checkExpiry()) {
            System.out.println("Medicine is expired. Cannot sell.");
        } else {
            System.out.print("Enter quantity to sell: ");
            int sellQty = sc.nextInt();

            double billAmount = medicine.sell(sellQty);

            if (billAmount > 0) {
                System.out.println("Medicine Sold Successfully!");
                System.out.println("Total Bill Amount: ₹" + billAmount);
            }
        }

        sc.close();
    }
}

