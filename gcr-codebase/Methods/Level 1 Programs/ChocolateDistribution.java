import java.util.*;
public class ChocolateDistribution{

	public static int[] findRemainderAndQuotient(int number, int divisor){
	    
		int chocolatesPerChild = number / divisor;
		int remainingChocolates = number % divisor;
		
        return new int[]{chocolatesPerChild, remainingChocolates};		
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of chocolates : ");
		int numberOfchocolates = input.nextInt();
		System.out.println("Enter number of children : ");
		int numberOfChildren = input.nextInt();
		
		int[] result = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);

        System.out.println("Number of chocolates per child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
		
		input.close();
	}
		
}