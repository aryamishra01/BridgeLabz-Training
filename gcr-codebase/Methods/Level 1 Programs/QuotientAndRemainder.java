import java.util.*;
public class QuotientAndRemainder{

	public static int[] findQuotientAndRemainder(int number1 , int number2){
	    
		int r = number1 % number2;
		int q = number1 / number2;
		
        return new int[]{r, q};		
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int number1 = input.nextInt();
		System.out.println("Enter number2 : ");
		int number2 = input.nextInt();
		
		int[] result = findQuotientAndRemainder(number1, number2);

        System.out.println("Remainder: " + result[0]);
        System.out.println("Quotient: " + result[1]);
		
		input.close();
	}
		
}