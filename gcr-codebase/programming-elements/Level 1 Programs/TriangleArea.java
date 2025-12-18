import java.util.*;
public class TriangleArea{
    public static void main(String[] args){
		
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter base and height: ");
	    double baseInInches = input.nextInt();
		double heightInInches = input.nextInt();
		
		// Calculate area of triangle in inches 
		double areaInSquareInches = 0.5 * baseInInches * heightInInches;
		
		//Conversion into area into cm and feet
		//1 square inch = 6.4516 square cm
		double areaInSquareCm = areaInSquareInches * 6.4516;
		
		
		System.out.println("Area of Triangle in square inches is " +areaInSquareInches +" and in centimeters is " +areaInSquareCm);
		
		input.close();
    }
}