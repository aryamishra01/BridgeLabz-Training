package com.day2.trafficmanager;

import java.util.Scanner;

public class TrafficManagerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Roundabout roundabout = new Roundabout();
        int choice;

        do {
            System.out.println("\n====== Traffic Manager Menu ======");
            System.out.println("1. Vehicle Arrives (Queue)");
            System.out.println("2. Enter Roundabout");
            System.out.println("3. Exit Roundabout");
            System.out.println("4. Display Roundabout");
            System.out.println("5. Display Waiting Queue");
            System.out.println("6. Exit System");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String number = sc.nextLine();
                    roundabout.arriveVehicle(number);
                    break;

                case 2:
                    roundabout.enterRoundabout();
                    break;

                case 3:
                    System.out.print("Enter vehicle number to exit: ");
                    number = sc.nextLine();
                    roundabout.exitRoundabout(number);
                    break;

                case 4:
                    roundabout.displayRoundabout();
                    break;

                case 5:
                    roundabout.displayQueue();
                    break;

                case 6:
                    System.out.println("Exiting Traffic Manager");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}

