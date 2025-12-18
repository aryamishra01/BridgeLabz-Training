import java.util.*;
public class KmToMilesConversion{
    public static void main(String[] args){
		
	    double km; 
		
		//Take input from user
		Scanner input = new Scanner(System.in);
		km = input.nextDouble();
		
		//Calculate Distance in Miles
		double distanceInMiles = km * 1.6;
		
		System.out.println("The total miles is " +distanceInMiles +" mile for the given "+km +" km");
	}
}
	