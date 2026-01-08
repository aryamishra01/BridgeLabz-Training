package com.day7.tourmate;

//Base Trip class
class Trip implements IBookable {

	 protected String destination;
	 protected int duration; // in days
	
	 // Associated services
	 protected Transport transport;
	 protected Hotel hotel;
	 protected Activity activity;
	
	 protected double totalBudget;
	
	 // Constructor to generate complete trip package
	 public Trip(String destination, int duration,
	             Transport transport, Hotel hotel, Activity activity) {
	
	     this.destination = destination;
	     this.duration = duration;
	     this.transport = transport;
	     this.hotel = hotel;
	     this.activity = activity;
	
	     // Operator usage to calculate total budget
	     this.totalBudget = transport.getCost()
	                      + hotel.getCost()
	                      + activity.getCost();
	 }
	
	 @Override
	 public void book() {
	     System.out.println("Booking trip to " + destination);
	     System.out.println("Total Budget: ₹" + totalBudget);
	 }
	
	 @Override
	 public void cancel() {
	     System.out.println("Trip to " + destination + " has been cancelled.");
	 }
}

