/*
 Parking Lot Gate System 
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class ParkingLot{
	
	// Define space of parking lot and occupancy
	static int space = 100;
	static int occupancy = 0;

	public static void parkedVehicle(){
		if(occupancy < space){
			System.out.println("Hey, Your vehicle is parked!");
			System.out.println();
			occupancy++;
		}else{
			System.out.println("Oops!Parking lot is full");
		}
	}
	
	public static void exitVehicle(){
		
		if(occupancy == 0){
			System.out.println("Parking lot is vacant");
		}
		System.out.println("Vehicle exit from parking lot");
		System.out.println();
		occupancy--;
	}
	
	

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Choose Options : \n1. Park \n2. Exit \n3. Show Occupancy \n4. Close \n");
		
			System.out.print("Enter your choice : ");
			int choice = input.nextInt();
			
			switch(choice){
		
				case 1 : 
					parkedVehicle();
					break;
				case 2 :
					exitVehicle();
					break;
				case 3 :
					System.out.println("Total vehicles in parking lot : "+occupancy);
					System.out.println();
					break;
				case 4: 
					System.out.println("Thankyou for using parking lot...");
					System.out.println();
					return;
				default:
					System.out.println("Choose valid choice! ");
					System.out.println();
					break;
			}
		}
	}
}