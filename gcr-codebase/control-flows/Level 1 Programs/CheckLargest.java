import java.util.*;
public class CheckLargest{
    public static void main(String[] args){
	    
		// Take input from user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Create variable and check which number is greater
		boolean firstLargest = (number1 > number2) && (number1 > number3);
		boolean secondLargest = (number2 > number1) && (number2 > number3);
		boolean thirdLargest = (number3 > number1) && (number3 > number2);
		
		//Print result
		System.out.println("Is the first number the largest? " +firstLargest);
		System.out.println("Is the second number the largest? " +secondLargest);
		System.out.println("Is the third number the largest? " +thirdLargest);	
		
		input.close();
	}
}