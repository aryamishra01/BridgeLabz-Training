package com.day10.binarysearchtree2;

import java.util.Scanner;

public class EcommerceInventoryBST {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductBST bst = new ProductBST();
        int choice;

        do {
            System.out.println("\n====== E-Commerce Product Inventory ======");
            System.out.println("1. Add Product");
            System.out.println("2. Lookup Product by SKU");
            System.out.println("3. Update Product Price");
            System.out.println("4. Delete Product");
            System.out.println("5. Display All Products (Sorted)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter SKU: ");
                    int sku = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    bst.insert(sku, name, price);
                    break;

                case 2:
                    System.out.print("Enter SKU to search: ");
                    ProductNode p = bst.search(sc.nextInt());
                    if (p != null) {
                        System.out.println("Product Found:");
                        System.out.println("SKU: " + p.sku);
                        System.out.println("Name: " + p.name);
                        System.out.println("Price: " + p.price);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter SKU: ");
                    int s = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();
                    bst.updatePrice(s, newPrice);
                    break;

                case 4:
                    System.out.print("Enter SKU to delete: ");
                    bst.delete(sc.nextInt());
                    break;

                case 5:
                    bst.displayAll();
                    break;

                case 6:
                    System.out.println("Exiting Inventory System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
