import java.util.*;
public class CalculateSimpleInterest{

	public void calculateSimpleInterest(double p , double r , double t){
	    
		double si = (p*r*t)/100;
		System.out.println("The Simple Interest is "+si +" for Principal "+p +" , Rate of Interest " +r +" and Time "+t);
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal amount : ");
		double principal = input.nextDouble();
		System.out.println("Enter rate : ");
		double rate = input.nextDouble();
		System.out.println("Enter time : ");
		double time = input.nextDouble();
		
		CalculateSimpleInterest obj = new CalculateSimpleInterest();
		
		obj.calculateSimpleInterest(principal,rate,time);
	}
}