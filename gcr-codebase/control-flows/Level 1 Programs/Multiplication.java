import java.util.*;
public class Multiplication{
    public static void main(String[] args){
	    
		//Taking number as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		// Loop from 6 to 9
		for(int i = 6 ; i <= 9 ; i++){
		    System.out.println(number + " * " + i + " = " + (number * i));
		}
		
		input.close();
	}
}