import java.util.*;
public class NaturalNumbers{
    public static void main(String[] args){
	    
		//Taking number as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		//Store sum of numbers in a variable
		int sumOfNumbers = 0;
		
		// Check if number is natural number or not 
		if(number >= 0)
		{
		   sumOfNumbers = (number * (number+1))/2;
		   System.out.println("The sum of "+number +" natural numbers is " +sumOfNumbers);
		}
		else{
		   System.out.println("The number "+number +" is not a natural number");
		}
		
		input.close();
	}
}