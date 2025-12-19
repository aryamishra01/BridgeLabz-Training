import java.util.*;
public class SumUsingFor {
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
		   int sumUsingFor = 0;
		   
		   // Sum using for loop
		    for(int i=1; i<=number; i++){
		       sumUsingFor += i;
			}
			
			// Sum using formula - n*(n+1)/2
			int sumUsingFormula = (number*(number + 1))/2;
			
			// Check if result from for loop and formula are same or not
			if(sumUsingFor == sumUsingFormula){
				System.out.println("Results are same using for loop and formula : " +sumUsingFor);
			}
			else{
			    System.out.println("Results are not same"); 
				System.out.println("Result using for loop is "+sumUsingFor +" and using formula is "+sumUsingFormula);
			}
		}
		
		input.close();
	}
}