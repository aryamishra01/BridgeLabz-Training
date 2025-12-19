import java.util.*;
public class CheckSmallest{
    public static void main(String[] args){
	    
		//Taking three numbers as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Checking if number1 is smallest among all and printing it
		System.out.println("Is the first number the smallest? " +((number1 < number2) && (number1 < number3)));
		
		input.close();
	}
}