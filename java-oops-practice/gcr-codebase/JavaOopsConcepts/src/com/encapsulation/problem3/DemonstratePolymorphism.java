package com.encapsulation.problem3;

import java.util.ArrayList;
import java.util.List;

public class DemonstratePolymorphism {

	public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-8891"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-2211"));
        vehicles.add(new Truck("TRUCK303", 3000, "TRK-INS-7788"));

        int days = 5;

        System.out.println("======= Vehicle Rental Summary =======");

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(days);

            System.out.println("--------------------------------------");
            System.out.println("Vehicle Number : " + v.getVehicleNumber());
            System.out.println("Vehicle Type   : " + v.getType());
            System.out.println("Rental Days    : " + days);
            System.out.println("Rental Cost    : ₹" + rentalCost);

            // Polymorphic insurance handling
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost : ₹" + ins.calculateInsurance());
            }
        }
    }
}
