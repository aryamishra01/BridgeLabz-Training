import java.util.*;
public class SumOfNumbers{
    public static void main(String[] args){
	    
		// Declare and initialize variable 
		double total = 0.0;
		
		//Take number as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value to store: ");
		double value = input.nextDouble();
		
		
		// Check if value is zero or not 
		while(value != 0){
			
			//add value to total 
		    total += value; 
			
			// Again ask for user input 
			System.out.println("Enter value: ");
			value = input.nextDouble();
		}
		System.out.println("Total value = "+total);
		
		input.close();
	}
}