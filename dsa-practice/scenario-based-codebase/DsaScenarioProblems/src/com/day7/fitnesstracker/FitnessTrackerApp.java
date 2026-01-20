package com.day7.fitnesstracker;

import java.util.Scanner;

public class FitnessTrackerApp {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to FitnessTracker Daily Ranking System");

        System.out.print("Enter number of users (max 20): ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n > 20) {
            System.out.println("Only small groups allowed. Setting users to 20.");
            n = 20;
        }

        User[] users = new User[n];

        takeInput(users);

        bubbleSort(users);

        displayLeaderboard(users);
    }

    // method to take user step input
    static void takeInput(User[] users) {

        for (int i = 0; i < users.length; i++) {

            System.out.println("\nEnter details for user " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter step count: ");
            int steps = sc.nextInt();
            sc.nextLine();

            users[i] = new User(name, steps);
        }
    }

    // bubble sort method for ranking by steps
    static void bubbleSort(User[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].steps < arr[j + 1].steps) {

                    User temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // display leaderboard
    static void displayLeaderboard(User[] users) {

        System.out.println("\nDaily Step Leaderboard");

        System.out.println("Rank  Name            Steps");

        int rank = 1;

        for (User u : users) {

            System.out.printf("%-5d %-15s %d\n",
                    rank++, u.name, u.steps);
        }
    }
}
