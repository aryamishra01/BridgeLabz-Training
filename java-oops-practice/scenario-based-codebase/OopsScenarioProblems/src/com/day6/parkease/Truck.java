package com.day6.parkease;

//Truck subclass
public class Truck extends Vehicle {

	 public Truck(String vehicleNumber) {
	     super(vehicleNumber, 100);
	 }
	
	 @Override
	 public double calculateCharges(int hours) {
	     double amount = baseRate * hours;
	     if (hours > 5) {
	         amount += 200;
	     }
	     return amount;
	 }
}

