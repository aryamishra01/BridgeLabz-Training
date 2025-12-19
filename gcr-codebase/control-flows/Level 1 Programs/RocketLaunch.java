import java.util.*;
public class RocketLaunch{
    public static void main(String[] args){
	    
		//Take number as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int counter = input.nextInt();
		
		
		// Check if number is positive, negative or zero
		while(counter >= 1){
		    System.out.println("counter = "+counter);
			counter--;
		}
	}
}