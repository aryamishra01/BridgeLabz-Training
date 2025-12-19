import java.util.*;
public class CheckPosNegZero{
    public static void main(String[] args){
	    
		//Take number as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		
		// Check if number is positive, negative or zero
		if(number > 0){
		    System.out.println("Positive");
		}
		else if (number < 0){
		    System.out.println("Negative");
		}
		else{
		    System.out.println("Zero");
		}
		
		input.close();
	}
}