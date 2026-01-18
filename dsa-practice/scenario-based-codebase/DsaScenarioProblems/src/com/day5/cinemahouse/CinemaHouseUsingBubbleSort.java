package com.day5.cinemahouse;

import java.util.Scanner;

public class CinemaHouseUsingBubbleSort {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movie shows today: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Movie[] shows = new Movie[n];

        System.out.println("\nEnter movie details:");

        for (int i = 0; i < n; i++) {
            System.out.print("Movie name: ");
            String name = sc.nextLine();

            System.out.print("Show time (HHMM, e.g., 0930 or 1830): ");
            int time = sc.nextInt();
            sc.nextLine(); // consume newline

            shows[i] = new Movie(name, time);
        }

        System.out.println("\nShow list before sorting:");
        printShows(shows);

        CinemaHouse.bubbleSort(shows);

        System.out.println("\nShow list after sorting by time:");
        printShows(shows);

        sc.close();
    }

    static void printShows(Movie[] shows) {
        for (Movie m : shows) {
            System.out.println(m);
        }
    }
}
