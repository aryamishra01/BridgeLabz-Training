package com.interfaceimplementation.basicimplementation.vehiclerentalsystem;

public class Bikes {

	String vehicleNumber;
	double amount;
	
	public Bikes(String vehicleNumber, double amount) {
		this.vehicleNumber = vehicleNumber;
		this.amount = amount;
	}
	
	public double rent(double amount) {
		return amount;
	}
	
	public void returnVehicle() {
		System.out.println("Bike returned safely");
	}
	
	public void show() {
		System.out.println("Bike Booked ");
		System.out.println("Vehicle number : "+vehicleNumber);
		System.out.println("Rent amount " +rent(amount));
	}
}
