package com.interfaceimplementation.defaultmethods;

interface Vehicle {

    void displaySpeed();

    // New optional feature
    default void displayBattery() {
        System.out.println("Battery status not available");
    }
}

class PetrolCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    // Overriding default method
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class VehicleDashboard {

    public static void main(String[] args) {

        Vehicle petrol = new PetrolCar();
        Vehicle electric = new ElectricCar();

        petrol.displaySpeed();
        petrol.displayBattery();

        electric.displaySpeed();
        electric.displayBattery();
    }
}

