package com.interfaceimplementation.basicimplementation.vehiclerentalsystem;

public class Buses {

	String vehicleNumber;
	double amount;
	
	public Buses(String vehicleNumber, double amount) {
		this.vehicleNumber = vehicleNumber;
		this.amount = amount;
	}
	
	public double rent(double amount) {
		return amount;
	}
	
	public void returnVehicle() {
		System.out.println("Bus returned safely");
	}
	
	public void show() {
		System.out.println("Bus Booked ");
		System.out.println("Vehicle number : "+vehicleNumber);
		System.out.println("Rent amount " +rent(amount));
	}
}
