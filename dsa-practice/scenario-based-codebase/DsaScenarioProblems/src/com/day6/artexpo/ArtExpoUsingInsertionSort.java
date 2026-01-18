package com.day6.artexpo;

import java.util.Scanner;

public class ArtExpoUsingInsertionSort {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of artist registrations: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Artist[] artists = new Artist[n];

        System.out.println("\nEnter artist registration details:");

        for (int i = 0; i < n; i++) {

            System.out.print("Artist name: ");
            String name = sc.nextLine();

            System.out.print("Registration time (HHMM): ");
            int time = sc.nextInt();
            sc.nextLine(); // consume newline

            artists[i] = new Artist(name, time);
        }

        System.out.println("\nBefore Sorting:");
        printArtists(artists);

        ArtExpo.insertionSort(artists);

        System.out.println("\nAfter Sorting by Registration Time:");
        printArtists(artists);

        sc.close();
    }

    static void printArtists(Artist[] artists) {
        for (Artist a : artists) {
            System.out.println(a);
        }
    }
}
