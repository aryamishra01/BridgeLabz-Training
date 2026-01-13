package com.day9.homenest;

import java.util.Scanner;

public class HomeNestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select device type");
        System.out.println("1 Light 2 Camera 3 Thermostat 4 Lock");
        int choice = sc.nextInt();

        System.out.println("Enter device id");
        int id = sc.nextInt();

        System.out.println("Enter energy usage per hour");
        double energy = sc.nextDouble();

        Device device = null;

        // Runtime polymorphism
        if (choice == 1) {
            device = new Light(id, energy);
        } else if (choice == 2) {
            device = new Camera(id, energy);
        } else if (choice == 3) {
            device = new Thermostat(id, energy);
        } else if (choice == 4) {
            device = new Lock(id, energy);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        device.turnOn();

        System.out.println("Enter usage hours");
        int hours = sc.nextInt();

        double totalEnergy = device.calculateEnergy(hours);
        System.out.println("Energy consumed is " + totalEnergy);

        device.reset();
        device.turnOff();

        sc.close();
    }
}

