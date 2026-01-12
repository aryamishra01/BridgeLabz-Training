package com.day2.traincompanion;

import java.util.LinkedList;

class TrainRoute {

    private LinkedList<Compartment> compartments = new LinkedList<>();
    private int currentIndex = 0;

    // Add compartment
    public void addCompartment(String name, String service) {
        compartments.add(new Compartment(name, service));
        System.out.println("Compartment added");
    }

    // Remove compartment by name
    public void removeCompartment(String name) {
        for (Compartment c : compartments) {
            if (c.name.equalsIgnoreCase(name)) {
                compartments.remove(c);
                currentIndex = Math.max(0, currentIndex - 1);
                System.out.println("Compartment removed");
                return;
            }
        }
        System.out.println("Compartment not found");
    }

    // Move forward
    public void moveNext() {
        if (currentIndex < compartments.size() - 1) {
            currentIndex++;
            showCurrent();
        } else {
            System.out.println("You are at the last compartment");
        }
    }

    // Move backward
    public void movePrevious() {
        if (currentIndex > 0) {
            currentIndex--;
            showCurrent();
        } else {
            System.out.println("You are at the first compartment");
        }
    }

    // Search service
    public void searchService(String service) {
        for (int i = 0; i < compartments.size(); i++) {
            if (compartments.get(i).service.equalsIgnoreCase(service)) {
                System.out.println("Service found at: " + compartments.get(i));
                return;
            }
        }
        System.out.println("Service not available");
    }

    // Display current & adjacent compartments
    public void showCurrent() {
        System.out.println("\nCurrent: " + compartments.get(currentIndex));

        if (currentIndex > 0) {
            System.out.println("Previous: " + compartments.get(currentIndex - 1));
        }

        if (currentIndex < compartments.size() - 1) {
            System.out.println("Next: " + compartments.get(currentIndex + 1));
        }
    }

    // Display full route
    public void displayRoute() {
        System.out.println("\nTrain Route:");
        for (Compartment c : compartments) {
            System.out.println(c);
        }
    }
}

