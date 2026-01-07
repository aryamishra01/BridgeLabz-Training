package com.day5.eventease;

//Base Event class
public class Event implements ISchedulable {

	 private final int eventId;     // cannot be changed once assigned
	 protected String eventName;
	 protected String location;
	 protected String date;
	 protected int attendees;
	
	 // Encapsulated pricing
	 protected double venueCost;
	 protected double serviceCost;
	 protected double discount;
	
	 // Constructor without services
	 public Event(int eventId, String eventName, String location, String date, int attendees, double venueCost) {
	     this.eventId = eventId;
	     this.eventName = eventName;
	     this.location = location;
	     this.date = date;
	     this.attendees = attendees;
	     this.venueCost = venueCost;
	     this.serviceCost = 0;
	     this.discount = 0;
	 }
	
	 // Constructor with services
	 public Event(int eventId, String eventName, String location, String date, int attendees,
	              double venueCost, double serviceCost, double discount) {
	     this(eventId, eventName, location, date, attendees, venueCost);
	     this.serviceCost = serviceCost;
	     this.discount = discount;
	 }
	
	 // Cost calculation using operators
	 public double calculateTotalCost() {
	     return venueCost + serviceCost - discount;
	 }
	
	 // Polymorphic methods
	 @Override
	 public void schedule() {
	     System.out.println("Event scheduled on " + date);
	 }
	
	 @Override
	 public void reschedule(String newDate) {
	     this.date = newDate;
	     System.out.println("Event rescheduled to " + newDate);
	 }
	
	 @Override
	 public void cancel() {
	     System.out.println("Event has been cancelled.");
	 }
}

