import java.util.*;
public class FactorialUsingFor{
    public static void main(String[] args){
	    
		//Taking number as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		//Check if the number is greater than 0
		if(number > 0)
		{   
			// Variable to store factorial result
		    int fact = 1;
			
		    for(int i = number; i > 1; i--){
				// Multiply current value of fact with i
		        fact = fact * i;
		    }
			
			System.out.println("Factorial of number " +number +" is " +fact);
		}
		else{
		   System.out.println("Please enter a positive number ");
		}
		
		input.close();
	}
}