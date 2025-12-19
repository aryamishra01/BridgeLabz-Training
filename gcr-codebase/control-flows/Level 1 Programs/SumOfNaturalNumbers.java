import java.util.*;
public class SumOfNaturalNumbers{
    public static void main(String[] args){
	    
		//Taking number as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		// Check if number is natural number or not 
		if(number <= 0)
		{
		   System.out.println("Not a valid natural number ");
		}
		else{
		   int sumUsingWhile = 0;
		   int i=1;
		   
		   // Sum using while loop
		   while(i<=number){
		       sumUsingWhile += i;
			   i++;
			}
			
			// Sum using formula - n*(n+1)/2
			int sumUsingFormula = (number*(number + 1))/2;
			
			// Check if result from while loop and formula are same or not
			if(sumUsingWhile == sumUsingFormula){
				System.out.println("Results are same using while loop and formula : " +sumUsingWhile);
			}
			else{
			    System.out.println("Results are bot same"); 
				System.out.println("Result using while loop is "+sumUsingWhile +" and using formula is "+sumUsingFormula);
			}
		}
		
		input.close();
	}
}