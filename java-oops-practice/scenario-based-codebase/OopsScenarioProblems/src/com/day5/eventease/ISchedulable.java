package com.day5.eventease;

//Interface for scheduling operations
public interface ISchedulable {
	
	 void schedule();
	 void reschedule(String newDate);
	 void cancel();
}

