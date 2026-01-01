package com.inheritance.assistedproblems.problem3;

//Motorcycle is a type of Vehicle
public class Motorcycle extends Vehicle {

 private boolean hasCarrier;

 public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
     super(maxSpeed, fuelType);
     this.hasCarrier = hasCarrier;
 }

 @Override
 public void displayInfo() {
     System.out.println("------ Vehicle Type : MOTORCYCLE ------");
     super.displayInfo();
     System.out.println("Carrier Present: " + (hasCarrier ? "Yes" : "No"));
 }
}

