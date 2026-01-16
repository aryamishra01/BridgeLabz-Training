package com.day4.eventmanager;

import java.util.Scanner;

public class EventManagerUsingQuickSort {

	// Quick sort method to sort tickets by price
    static void quickSort(Ticket[] arr, int low, int high) {

        if (low < high) {

            // Partition the array and get pivot position
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method using last element as pivot
    static int partition(Ticket[] arr, int low, int high) {

        double pivot = arr[high].price;
        int i = low - 1;

        // Rearrange elements based on pivot value
        for (int j = low; j < high; j++) {

            if (arr[j].price <= pivot) {

                i++;

                // Swap current ticket with smaller element area
                Ticket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct sorted position
        Ticket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Method to display ticket list
    static void displayTickets(Ticket[] arr, int n) {
        System.out.println("Event\t\tPrice");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].eventName + "\t\t" + arr[i].price);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();
        sc.nextLine();

        Ticket[] tickets = new Ticket[n];

        // Taking input of ticket details
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for ticket " + (i + 1));

            System.out.print("Enter event name: ");
            String eventName = sc.nextLine();

            System.out.print("Enter ticket price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            tickets[i] = new Ticket(eventName, price);
        }

        // Display before sorting
        System.out.println("\nTickets before sorting by price");
        displayTickets(tickets, n);

        // Apply quick sort
        quickSort(tickets, 0, n - 1);

        // Display after sorting
        System.out.println("\nTickets after sorting by price");
        displayTickets(tickets, n);

        // Showing top cheapest and most expensive tickets
        if (n > 0) {
            System.out.println("\nCheapest ticket");
            System.out.println(tickets[0].eventName + " " + tickets[0].price);

            System.out.println("\nMost expensive ticket");
            System.out.println(tickets[n - 1].eventName + " " + tickets[n - 1].price);
        }

        sc.close();
    }
}
