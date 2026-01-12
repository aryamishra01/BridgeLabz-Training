package com.day2.traincompanion;

import java.util.Scanner;

public class TrainCompanionMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainRoute route = new TrainRoute();
        int choice;

        // Initial compartments
        route.addCompartment("Coach A", "Sleeper");
        route.addCompartment("Coach B", "AC");
        route.addCompartment("Coach C", "Pantry");
        route.addCompartment("Coach D", "WiFi");

        do {
            System.out.println("\n====== Train Companion Menu ======");
            System.out.println("1. Move to Next Compartment");
            System.out.println("2. Move to Previous Compartment");
            System.out.println("3. Search Service");
            System.out.println("4. Add Compartment");
            System.out.println("5. Remove Compartment");
            System.out.println("6. Show Current Position");
            System.out.println("7. Display Full Train Route");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    route.moveNext();
                    break;

                case 2:
                    route.movePrevious();
                    break;

                case 3:
                    System.out.print("Enter service to search: ");
                    String service = sc.nextLine();
                    route.searchService(service);
                    break;

                case 4:
                    System.out.print("Enter compartment name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter service: ");
                    service = sc.nextLine();
                    route.addCompartment(name, service);
                    break;

                case 5:
                    System.out.print("Enter compartment name to remove: ");
                    name = sc.nextLine();
                    route.removeCompartment(name);
                    break;

                case 6:
                    route.showCurrent();
                    break;

                case 7:
                    route.displayRoute();
                    break;

                case 8:
                    System.out.println("Exiting TrainCompanion");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}

