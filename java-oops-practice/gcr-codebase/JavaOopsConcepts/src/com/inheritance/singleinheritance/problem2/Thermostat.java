package com.inheritance.singleinheritance.problem2;

public class Thermostat extends Device {

	double temperatureSetting;
	
	public Thermostat(String deviceId, String status, double temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	public void displayStatus() {
		super.displayStatus();
		System.out.println("\n*** Thermostat Information ***");
		System.out.println("Set temperature to : "+temperatureSetting);
	}
}
