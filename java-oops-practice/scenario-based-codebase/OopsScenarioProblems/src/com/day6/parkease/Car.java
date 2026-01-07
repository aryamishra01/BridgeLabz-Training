package com.day6.parkease;

//Car subclass
public class Car extends Vehicle {

	 public Car(String vehicleNumber) {
	     super(vehicleNumber, 50); // base rate per hour
	 }
	
	 @Override
	 public double calculateCharges(int hours) {
	     double amount = baseRate * hours;
	     if (hours > 5) {
	         amount += 100; // penalty
	     }
	     return amount;
	 }
}

