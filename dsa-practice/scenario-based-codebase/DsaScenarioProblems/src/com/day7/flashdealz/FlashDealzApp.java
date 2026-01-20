package com.day7.flashdealz;

import java.util.Scanner;

public class FlashDealzApp {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to FlashDealz Product Sorting System");

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        takeInput(products);

        quickSort(products, 0, products.length - 1);

        displayTopDeals(products);
    }

    // method to take product details from user
    static void takeInput(Product[] products) {

        for (int i = 0; i < products.length; i++) {

            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter original price: ");
            double price = sc.nextDouble();

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(name, price, discount);
        }
    }

    // quick sort method
    static void quickSort(Product[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // partition method for quick sort
    static int partition(Product[] arr, int low, int high) {

        double pivot = arr[high].discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].discount > pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // swap method
    static void swap(Product[] arr, int i, int j) {

        Product temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // display sorted deals
    static void displayTopDeals(Product[] products) {

        System.out.println("\nTop Discounted Products");

        System.out.println("Rank  Product Name       Price     Discount");

        int rank = 1;

        for (Product p : products) {

            System.out.printf("%-5d %-18s %-9.2f %.2f%%\n",
                    rank++, p.name, p.price, p.discount);
        }
    }
}
