package com.day5.eventease;

//ConferenceEvent extends Event
public class ConferenceEvent extends Event {

	 public ConferenceEvent(int eventId, String eventName, String location, String date,
	                         int attendees, double venueCost, double serviceCost) {
	     super(eventId, eventName, location, date, attendees, venueCost, serviceCost, 1000); // higher discount
	 }
	
	 @Override
	 public void schedule() {
	     System.out.println("Conference Event scheduled with professional setup on " + date);
	 }
}

