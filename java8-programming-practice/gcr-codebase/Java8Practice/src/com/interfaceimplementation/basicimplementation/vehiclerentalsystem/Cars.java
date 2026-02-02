package com.interfaceimplementation.basicimplementation.vehiclerentalsystem;

public class Cars implements VehicleBooking {

	String vehicleNumber;
	double amount;
	
	public Cars(String vehicleNumber, double amount) {
		this.vehicleNumber = vehicleNumber;
		this.amount = amount;
	}
	
	public double rent(double amount) {
		return amount;
	}
	
	public void returnVehicle() {
		System.out.println("Car returned safely");
	}
	
	public void show() {
		System.out.println("Car Booked ");
		System.out.println("Vehicle number : "+vehicleNumber);
		System.out.println("Rent amount " +rent(amount));
	}
}
