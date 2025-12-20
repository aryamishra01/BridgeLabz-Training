import java.util.*;
public class Athlete{

	public void calculateRounds(double s1, double s2, double s3, int dis){
	    
		double perimeter = s1+s2+s3;
		
		double rounds = dis / perimeter;
		
		System.out.printf("The number of rounds user needs to do to complete " +dis +"km run" +" is " +rounds);
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side 1 of triangle : ");
		double side1 = input.nextInt();
		System.out.println("Enter side 2 of triangle : ");
		double side2 = input.nextInt();
		System.out.println("Enter side 3 of triangle : ");
		double side3 = input.nextInt();
		
	    int distance = 5;
		
		Athlete obj = new Athlete();
		obj.calculateRounds(side1,side2,side3,distance);
	}
}