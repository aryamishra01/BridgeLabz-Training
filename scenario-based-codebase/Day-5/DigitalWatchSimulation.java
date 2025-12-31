/*
Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/


//import java.uti.Scanner;
import java.time.LocalTime;

public class DigitalWatchSimulation{

	public static void main(String[] args){
	
		System.out.println("Starting 24-hour digital watch simulation...");
        System.out.println("Power cut scheduled for 13:00.");
		
		for(int hour = 0; hour < 24; hour++){
			for(int minute = 0; minute < 60; minute++){
				
				if((hour == 13) && (minute == 0)){
					return;
				}
				System.out.printf("Current time is - %02d:%02d\n", hour, minute);

			}
		}
		
	}
}
