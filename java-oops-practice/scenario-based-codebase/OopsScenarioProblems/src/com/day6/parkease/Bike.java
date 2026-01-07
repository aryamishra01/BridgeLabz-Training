package com.day6.parkease;

//Bike subclass
public class Bike extends Vehicle {

	 public Bike(String vehicleNumber) {
	     super(vehicleNumber, 20);
	 }
	
	 @Override
	 public double calculateCharges(int hours) {
	     double amount = baseRate * hours;
	     if (hours > 5) {
	         amount += 50;
	     }
	     return amount;
	 }
}

