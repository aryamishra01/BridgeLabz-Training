package com.interfaceimplementation.basicimplementation.smartdevicecontrol;

public class SmartDevice {

	public static void main(String[] args) {
		
		Devices obj = new Light();
		obj.turnOn();
		obj.turnOff();
		
		Devices obj2 = new AC();
		obj2.turnOn();
		obj2.turnOff();
		
		Devices obj3 = new TV();
		obj3.turnOn();
		obj3.turnOff();
	}

}
