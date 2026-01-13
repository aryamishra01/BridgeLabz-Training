package com.day2.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

class Roundabout {

    // Circular Linked List using LinkedList
    private LinkedList<Vehicle> roundabout = new LinkedList<>();

    // Queue for waiting vehicles
    private Queue<Vehicle> waitingQueue = new LinkedList<>();

    private final int MAX_QUEUE_SIZE = 5;

    // Vehicle enters waiting queue
    public void arriveVehicle(String number) {
        if (waitingQueue.size() == MAX_QUEUE_SIZE) {
            System.out.println("Queue Overflow: Waiting area full");
            return;
        }

        waitingQueue.offer(new Vehicle(number));
        System.out.println("Vehicle added to waiting queue");
    }

    // Move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow: No vehicles waiting");
            return;
        }

        Vehicle v = waitingQueue.poll();
        roundabout.add(v); // circular behavior
        System.out.println("Vehicle entered roundabout: " + v);
    }

    // Remove vehicle from roundabout
    public void exitRoundabout(String number) {
        for (Vehicle v : roundabout) {
            if (v.vehicleNumber.equalsIgnoreCase(number)) {
                roundabout.remove(v);
                System.out.println("Vehicle exited: " + v);
                return;
            }
        }
        System.out.println("Vehicle not found in roundabout");
    }

    // Display roundabout state
    public void displayRoundabout() {
        if (roundabout.isEmpty()) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout State: ");
        for (Vehicle v : roundabout) {
            System.out.print(v + " → ");
        }
        System.out.println("(back to start)");
    }

    // Display waiting queue
    public void displayQueue() {
        System.out.println("Waiting Queue: " + waitingQueue);
    }
}

