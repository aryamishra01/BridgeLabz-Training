import java.util.*;
public class CountdownBegins{
    public static void main(String[] args){
	    
		//Take number as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter countdown start number: ");
		int counter = input.nextInt();
		
		
		// Check if number is positive, negative or zero
		for(int i = counter; i>=1; i--){
		    System.out.println(i);
		}
		
		input.close();
	}
}