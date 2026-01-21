package com.day8.gamezone;

import java.util.Scanner;

public class GamerZoneUsingQuickSort {

	static Player[] players = new Player[0];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- GamerZone Leaderboard System ---");
            System.out.println("1. Add Players");
            System.out.println("2. View Leaderboard");
            System.out.println("3. Sort by High Score (Quick Sort)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addPlayers();
                    break;
                case 2:
                    display(players);
                    break;
                case 3:
                    if (players.length > 1) {
                        quickSort(players, 0, players.length - 1);
                        System.out.println("Leaderboard sorted by score!");
                    } else {
                        System.out.println("Not enough players to sort.");
                    }
                    break;
                case 4:
                    System.out.println("Thanks for playing GamerZone!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add Players 
    public static void addPlayers() {

        System.out.print("Enter number of players to add: ");
        int n = sc.nextInt();

        Player[] newArr = new Player[players.length + n];

        // copy old players
        for (int i = 0; i < players.length; i++) {
            newArr[i] = players[i];
        }

        // add new players
        for (int i = players.length; i < newArr.length; i++) {
            System.out.print("Enter player name: ");
            String name = sc.next();

            System.out.print("Enter score: ");
            int score = sc.nextInt();

            newArr[i] = new Player(name, score);
        }

        players = newArr;
        System.out.println("Players added successfully!");
    }

    // Quick Sort (Descending by Score)
    public static void quickSort(Player[] arr, int low, int high) {

        if (low < high) {

            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    //  Partition
    public static int partition(Player[] arr, int low, int high) {

        int pivot = arr[high].score; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].score > pivot) { // DESCENDING order
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap 
    public static void swap(Player[] arr, int i, int j) {

        Player temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Display Leaderboard 
    public static void display(Player[] arr) {

        if (arr.length == 0) {
            System.out.println("No players available.");
            return;
        }

        System.out.println("\n--- Leaderboard ---");
        int rank = 1;
        for (Player p : arr) {
            System.out.println(rank++ + ". " + p.name + " - Score: " + p.score);
        }
    }
}
