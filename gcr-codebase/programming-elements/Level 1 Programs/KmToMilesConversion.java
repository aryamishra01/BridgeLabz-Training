import java.util.*;
public class KmToMilesConversion{
    public static void main(String[] args){
		
		//Declared a variable named as km 
	    double km; 
		
		//Take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in km: ");
		km = input.nextDouble();
		
		//Calculate Distance in Miles
		double distanceInMiles = km * 1.6;
		
		System.out.println("The total miles is " +distanceInMiles +" mile for the given "+km +" km");
	}
}
	