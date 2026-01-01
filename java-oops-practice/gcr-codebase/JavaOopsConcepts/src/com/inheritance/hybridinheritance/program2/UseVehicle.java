package com.inheritance.hybridinheritance.program2;

public class UseVehicle {

    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 45);

        System.out.println("---- Electric Vehicle ----");
        ev.displayInfo();
        ev.charge();

        System.out.println("\n---- Petrol Vehicle ----");
        pv.displayInfo();
        pv.refuel();
    }
}

