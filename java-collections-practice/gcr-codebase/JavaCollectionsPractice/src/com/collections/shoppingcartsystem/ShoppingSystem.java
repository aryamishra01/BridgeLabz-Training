package com.collections.shoppingcartsystem;

import java.util.*;

public class ShoppingSystem {

    // Product -> Price
    static HashMap<String, Double> priceMap = new HashMap<>();

    // Cart with insertion order
    static LinkedHashMap<String, Double> cartMap = new LinkedHashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Shopping Cart Menu ======");
            System.out.println("1. Add Product Price");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. View Cart (Insertion Order)");
            System.out.println("4. View Cart Sorted by Price");
            System.out.println("5. Total Bill");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addProduct(sc);
                case 2 -> addToCart(sc);
                case 3 -> viewCart();
                case 4 -> viewSortedByPrice();
                case 5 -> totalBill();
                case 0 -> System.out.println("Thank you for shopping!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    // ---------------- ADD PRODUCT PRICE ----------------
    static void addProduct(Scanner sc) {

        System.out.print("Enter Product Name: ");
        String name = sc.next();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        priceMap.put(name, price);
        System.out.println("Product Added to Store!");
    }

    // ---------------- ADD TO CART ----------------
    static void addToCart(Scanner sc) {

        System.out.print("Enter Product to Add: ");
        String name = sc.next();

        if (priceMap.containsKey(name)) {
            cartMap.put(name, priceMap.get(name));
            System.out.println("Item Added to Cart!");
        } else {
            System.out.println("Product not found in store!");
        }
    }

    // ---------------- VIEW CART ----------------
    static void viewCart() {

        System.out.println("\nCart Items (Insertion Order):");

        if (cartMap.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (Map.Entry<String, Double> e : cartMap.entrySet()) {
            System.out.println(e.getKey() + " : ₹" + e.getValue());
        }
    }

    // ---------------- SORT BY PRICE ----------------
    static void viewSortedByPrice() {

        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (Map.Entry<String, Double> e : cartMap.entrySet()) {

            sorted.putIfAbsent(e.getValue(), new ArrayList<>());
            sorted.get(e.getValue()).add(e.getKey());
        }

        System.out.println("\nCart Items Sorted by Price:");

        for (Map.Entry<Double, List<String>> e : sorted.entrySet()) {
            for (String product : e.getValue()) {
                System.out.println(product + " : ₹" + e.getKey());
            }
        }
    }

    // ---------------- TOTAL BILL ----------------
    static void totalBill() {

        double sum = 0;

        for (double price : cartMap.values()) {
            sum += price;
        }

        System.out.println("Total Bill Amount: ₹" + sum);
    }
}

