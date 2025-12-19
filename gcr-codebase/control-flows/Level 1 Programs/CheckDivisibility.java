import java.util.*;
public class CheckDivisibility{
    public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		// Check if number divisible by 5 
		boolean divisible = (number%5 == 0);
		
		System.out.println(" Is the number " +number +" divisible by 5? " +divisible);
		
		input.close();
	}
}	