package com.day3.smartcheckout;

import java.util.*;

public class SmartCheckoutMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Queue maintains FIFO billing order
        Queue<Customer> checkoutQueue = new LinkedList<>();

        // Inventory setup
        Inventory inventory = new Inventory();
        inventory.addItem("milk", 50, 5);
        inventory.addItem("bread", 40, 3);
        inventory.addItem("egg", 10, 10);

        // Input customers
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("\nEnter customer name: ");
            String name = sc.nextLine();
            Customer customer = new Customer(name);

            System.out.print("Enter number of items: ");
            int itemCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < itemCount; j++) {
                System.out.print("Enter item name: ");
                String item = sc.nextLine();
                customer.addItem(item);
            }

            // Add customer to billing queue
            checkoutQueue.offer(customer);
        }

        // Billing process
        while (!checkoutQueue.isEmpty()) {

            Customer current = checkoutQueue.poll();
            int totalBill = 0;

            System.out.println("\nBilling for " + current.getName());

            for (String item : current.getItems()) {

                if (inventory.isAvailable(item)) {
                    int price = inventory.getPrice(item);
                    totalBill += price;
                    inventory.reduceStock(item);
                    System.out.println(item + " - ₹" + price);
                } else {
                    System.out.println(item + " - Out of Stock");
                }
            }

            System.out.println("Total Amount: ₹" + totalBill);
        }

        sc.close();
    }
}
