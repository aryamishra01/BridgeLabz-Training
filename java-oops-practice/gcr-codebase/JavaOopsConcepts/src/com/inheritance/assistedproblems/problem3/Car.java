package com.inheritance.assistedproblems.problem3;

//Car is a type of Vehicle
public class Car extends Vehicle {

 private int seatCapacity;

 public Car(int maxSpeed, String fuelType, int seatCapacity) {
     super(maxSpeed, fuelType);
     this.seatCapacity = seatCapacity;
 }

 @Override
 public void displayInfo() {
     System.out.println("------ Vehicle Type : CAR ------");
     super.displayInfo();
     System.out.println("Seat Capacity  : " + seatCapacity);
 }
}


