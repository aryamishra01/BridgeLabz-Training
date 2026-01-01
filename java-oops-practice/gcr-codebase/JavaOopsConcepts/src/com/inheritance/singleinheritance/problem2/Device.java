package com.inheritance.singleinheritance.problem2;

public class Device {

	protected String deviceId;
	public String status;
	
	public Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	
	public void displayStatus() {
		System.out.println("*** Device Information ***");
		System.out.println("Device id : "+deviceId);
		System.out.println("Device status : "+status);
	}
}
	