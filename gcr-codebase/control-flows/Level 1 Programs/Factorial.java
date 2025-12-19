import java.util.*;
public class Factorial{
    public static void main(String[] args){
	    
		//Taking number as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		if(number > 0)
		{   
		    int fact = 1;
			int originalNum = number;
		    while(number > 1){
		        fact = fact * number;
				number--;
		    }
			System.out.println("Factorial of number " +originalNum +" is " +fact);
		}
		else{
		   System.out.println("Please enter a positive number ");
		}
		
		input.close();
	}
}