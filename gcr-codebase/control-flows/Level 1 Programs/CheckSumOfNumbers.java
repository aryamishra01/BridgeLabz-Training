import java.util.*;
public class CheckSumOfNumbers{
    public static void main(String[] args){
	    
		// Declare and initialize variable 
		double total = 0.0;
		
		//Take number as input from user
		Scanner input = new Scanner(System.in);
		
		// Infinite while loop  
		while(true){
			
			System.out.println("Enter value to store: ");
		    double value = input.nextDouble();
			
			if(value <= 0){
			    break;
			}
			
			total = total + value;
		}
		System.out.println("Total value = "+total);
		
		input.close();
	}
}