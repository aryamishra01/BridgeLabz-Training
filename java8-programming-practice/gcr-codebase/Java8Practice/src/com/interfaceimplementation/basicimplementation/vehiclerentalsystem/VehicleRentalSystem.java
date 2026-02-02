package com.interfaceimplementation.basicimplementation.vehiclerentalsystem;

public class VehicleRentalSystem {

	public static void main(String[] args) {
		
		Cars obj = new Cars("MH 01 AB 5566", 5000);
		obj.show();
		obj.returnVehicle();
		
		System.out.println("*********************"); //new line
		
		Bikes obj2 = new Bikes("KA 05 XY 9901 ", 2000);
		obj2.show();
		obj2.returnVehicle();
		
		System.out.println("*********************");// new linee
		
		Buses obj3 = new Buses("DL 1C PA 4000", 8000);
		obj3.show();
		obj3.returnVehicle();
	}

}
