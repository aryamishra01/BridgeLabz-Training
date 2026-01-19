package com.day11.bagnballorganizer;

import java.util.*;

public class BagBallOrganizerApp {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Bag> bags = new ArrayList<>();

        System.out.println("Welcome to TinyTown Bag and Ball Organizer");

        boolean running = true;

        while (running) {

            System.out.println("Choose an option");
            System.out.println("1 Add new bag");
            System.out.println("2 Add ball to bag");
            System.out.println("3 Remove ball from bag");
            System.out.println("4 Display balls in a bag");
            System.out.println("5 Display all bags");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter bag id: ");
                    String bagId = sc.next();

                    System.out.print("Enter bag color: ");
                    String bagColor = sc.next();

                    System.out.print("Enter bag capacity: ");
                    int cap = sc.nextInt();

                    bags.add(new Bag(bagId, bagColor, cap));
                    System.out.println("Bag added successfully");
                    break;

                case 2:
                    System.out.print("Enter bag id: ");
                    String bid = sc.next();

                    Bag selectedBag = null;
                    for (Bag b : bags) {
                        if (b.getId().equals(bid)) {
                            selectedBag = b;
                            break;
                        }
                    }

                    if (selectedBag == null) {
                        System.out.println("Bag not found");
                        break;
                    }

                    System.out.print("Enter ball id: ");
                    String ballId = sc.next();

                    System.out.print("Enter ball color: ");
                    String ballColor = sc.next();

                    System.out.print("Enter ball size small medium or large: ");
                    String size = sc.next();

                    Ball newBall = new Ball(ballId, ballColor, size);

                    if (selectedBag.addBall(newBall)) {
                        System.out.println("Ball added to bag");
                    } else {
                        System.out.println("Bag is full cannot add more balls");
                    }
                    break;

                case 3:
                    System.out.print("Enter bag id: ");
                    String removeBagId = sc.next();

                    Bag bagToRemoveFrom = null;
                    for (Bag b : bags) {
                        if (b.getId().equals(removeBagId)) {
                            bagToRemoveFrom = b;
                            break;
                        }
                    }

                    if (bagToRemoveFrom == null) {
                        System.out.println("Bag not found");
                        break;
                    }

                    System.out.print("Enter ball id to remove: ");
                    String removeBallId = sc.next();

                    if (bagToRemoveFrom.removeBall(removeBallId)) {
                        System.out.println("Ball removed");
                    } else {
                        System.out.println("Ball not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter bag id: ");
                    String showBagId = sc.next();

                    Bag bagToShow = null;
                    for (Bag b : bags) {
                        if (b.getId().equals(showBagId)) {
                            bagToShow = b;
                            break;
                        }
                    }

                    if (bagToShow == null) {
                        System.out.println("Bag not found");
                    } else {
                        bagToShow.displayBalls();
                    }
                    break;

                case 5:
                    if (bags.isEmpty()) {
                        System.out.println("No bags available");
                    } else {
                        for (Bag b : bags) {
                            System.out.println(b.getBagDetails());
                        }
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using the system");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        sc.close();
    }
}
