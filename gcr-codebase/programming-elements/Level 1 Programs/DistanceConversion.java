import java.util.*;
public class DistanceConversion{
    public static void main(String[] args){
		
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in feet: ");
	    double distanceInFeet = input.nextDouble();
		
		//Conversion into yards and miles
		// 1 mile = 1760 yards and 1 yard = 3 feet 
		double distanceInYards = distanceInFeet/3;
		double distanceInMiles = distanceInYards/1760;
		
		
		System.out.println("Distance in yards is " +distanceInYards +" and in miles is " +distanceInMiles);
		
		input.close();
    }
}