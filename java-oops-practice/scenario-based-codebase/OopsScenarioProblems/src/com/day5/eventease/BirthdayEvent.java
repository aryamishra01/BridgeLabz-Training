package com.day5.eventease;

//BirthdayEvent extends Event
public class BirthdayEvent extends Event {

	 public BirthdayEvent(int eventId, String eventName, String location, String date,
	                       int attendees, double venueCost, double serviceCost) {
	     super(eventId, eventName, location, date, attendees, venueCost, serviceCost, 500); // fixed discount
	 }
	
	 // Polymorphic behavior
	 @Override
	 public void schedule() {
	     System.out.println("Birthday Event scheduled with party arrangements on " + date);
	 }
}

