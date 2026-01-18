package com.generics.smartwarehousemanagementsystem;

import java.util.Scanner;

public class SmartWarehouseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Separate storage for each category
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceryStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        int choice;

        do {
            System.out.println("\n===== SMART WAREHOUSE MENU =====");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Grocery");
            System.out.println("3. Add Furniture");
            System.out.println("4. Display All Items");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Electronics Name: ");
                    String ename = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double eprice = sc.nextDouble();

                    System.out.print("Enter Warranty (years): ");
                    int warranty = sc.nextInt();

                    electronicsStorage.addItem(
                            new Electronics(ename, eprice, warranty)
                    );
                    break;

                case 2:
                    System.out.print("Enter Grocery Name: ");
                    String gname = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double gprice = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Expiry Date: ");
                    String expiry = sc.nextLine();

                    groceryStorage.addItem(
                            new Groceries(gname, gprice, expiry)
                    );
                    break;

                case 3:
                    System.out.print("Enter Furniture Name: ");
                    String fname = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double fprice = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Material: ");
                    String material = sc.nextLine();

                    furnitureStorage.addItem(
                            new Furniture(fname, fprice, material)
                    );
                    break;

                case 4:
                    // Using wildcard method
                    WarehouseUtil.displayAllItems(electronicsStorage.getItems());
                    WarehouseUtil.displayAllItems(groceryStorage.getItems());
                    WarehouseUtil.displayAllItems(furnitureStorage.getItems());
                    break;

                case 0:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}

