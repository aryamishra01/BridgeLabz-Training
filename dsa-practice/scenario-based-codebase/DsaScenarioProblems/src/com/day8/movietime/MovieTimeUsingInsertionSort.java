package com.day8.movietime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTimeUsingInsertionSort {

    static List<Theatre> show = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Movie Theater");

        while (true) {

            System.out.println("\n1. Add show");
            System.out.println("2. Check show times");
            System.out.println("3. Sort show times");
            System.out.println("4. Show sorted show times");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addShow();
                    break;

                case 2:
                    checkShowTime(show);
                    break;

                case 3:
                    sortShowTimes(show);
                    break;

                case 4:
                    showSortedTimes(show);
                    break;

                case 5:
                    System.out.println("Thank you for using the system...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Add Show 
    public static void addShow() {

        Scanner obj = new Scanner(System.in);
        int choice1;

        do {
            System.out.print("Enter movie name: ");
            String movie = obj.next();

            System.out.print("Enter show time (e.g. 10AM / 6PM): ");
            String time = obj.next();

            show.add(new Theatre(movie, time));

            System.out.print("Do you want to add more (1 = Yes / 0 = No): ");
            choice1 = obj.nextInt();

        } while (choice1 != 0);
    }

    //Display Shows
    public static void checkShowTime(List<Theatre> show) {

        if (show.isEmpty()) {
            System.out.println("No shows available.");
            return;
        }

        System.out.println("Available show times:");
        for (Theatre t : show) {
            System.out.println(t.movie + " at " + t.time);
        }
    }

    //Insertion Sort by Time
    public static void sortShowTimes(List<Theatre> show) {

        if (show.size() < 2) {
            System.out.println("Not enough shows to sort.");
            return;
        }

        int j;
        Theatre temp;

        for (int i = 1; i < show.size(); i++) {

            temp = show.get(i);
            j = i;

            while (j > 0 && show.get(j - 1).time.compareTo(temp.time) > 0) {
                show.set(j, show.get(j - 1));
                j--;
            }

            show.set(j, temp);
        }

        System.out.println("Show times sorted successfully!");
    }

    //Show Sorted Times
    public static void showSortedTimes(List<Theatre> show) {

        if (show.isEmpty()) {
            System.out.println("No shows available.");
            return;
        }

        System.out.println("Sorted show times:");
        for (Theatre t : show) {
            System.out.println(t.movie + " at " + t.time);
        }
    }
}
