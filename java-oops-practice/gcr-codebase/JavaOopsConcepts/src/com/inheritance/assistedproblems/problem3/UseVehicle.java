package com.inheritance.assistedproblems.problem3;

public class UseVehicle {

    public static void main(String[] args) {

        System.out.println("===== VEHICLE TRANSPORT SYSTEM =====\n");

        // Polymorphism: array of Vehicle references
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 12.5),
            new Motorcycle(140, "Petrol", true)
        };

        // Display details of all vehicles
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("----------------------------------\n");
        }

        System.out.println("===== END OF VEHICLE DETAILS =====");
    }
}

