package com.day2.vehiclerentalapplication;

public class VehicleApp {

	public static void main(String[] args) {

        Customer customer = new Customer(101, "Aman");
        customer.displayCustomer();

        System.out.println("-----------------------");

        // Polymorphism
        Rentable bike = new Bike(1, "Hero", 300);
        Rentable car = new Car(2, "Hyundai", 1200);
        Rentable truck = new Truck(3, "Tata", 2000, 500);

        System.out.println("Bike Rent (3 days): ₹" + bike.calculateRent(3));
        System.out.println("Car Rent (3 days): ₹" + car.calculateRent(3));
        System.out.println("Truck Rent (3 days): ₹" + truck.calculateRent(3));
    }
}
