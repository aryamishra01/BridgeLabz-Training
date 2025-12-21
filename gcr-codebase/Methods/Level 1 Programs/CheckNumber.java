import java.util.*;
public class CheckNumber{

	public static int checkNumber(int number){
	    
		if(number < 0){
			return -1; // return -1 if number is negative 
		}
		else if(number == 0){
		    return 0;
		}
		return 1; // return 1 if number is positive
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = input.nextInt();
		
	    int result = checkNumber(number);
		
		if(result == 1){
			System.out.println("Positive number");
		}
		else if(result == 0){
			System.out.println("Number is zero");
		}
		else{
			System.out.println("Negative number");
		}
	}
}