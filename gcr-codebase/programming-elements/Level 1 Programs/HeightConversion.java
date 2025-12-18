import java.util.*;
public class HeightConversion{
    public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter height in cm: ");
	    double heightInCm = input.nextDouble();
		
		//Conversion from Cm to inches and inches to feet
	    double totalInches = heightInCm / 2.54;
	    double heightInFeet = (totalInches / 12);
        double heightInInches = (int)totalInches % 12;
		
		System.out.println("Your Height in cm is " +heightInCm +" while in feet is " +heightInFeet +" and inches " +heightInInches);
        
		input.close();
	}
}