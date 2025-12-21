import java.util.*;
public class FindSmallestLargest{

	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	    
		int smallest = number1;
        int largest = number1;
		
		// Check for smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
		
		// Check for largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
			
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int number1 = input.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = input.nextInt();
		System.out.println("Enter number 3 : ");
		int number3 = input.nextInt();
		
		int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
		
		input.close();
	}
		
}