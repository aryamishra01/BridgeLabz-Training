package com.day6.parkease;

//Parking slot with encapsulated availability
public class ParkingSlot {
	 private int slotId;
	 private boolean isOccupied;
	 private String vehicleTypeAllowed;
	 private String location;
	
	 public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
	     this.slotId = slotId;
	     this.location = location;
	     this.vehicleTypeAllowed = vehicleTypeAllowed;
	     this.isOccupied = false;
	 }
	
	 public boolean isAvailable() {
	     return !isOccupied;
	 }
	
	 public void assignSlot() {
	     isOccupied = true;
	 }
	
	 public void freeSlot() {
	     isOccupied = false;
	 }
	
	 public int getSlotId() {
	     return slotId;
	 }
	
	 public String getVehicleTypeAllowed() {
	     return vehicleTypeAllowed;
	 }
}
