import java.util.Scanner;

public class OddEvenNumbers
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = input.nextInt();
		
		// Check for natural number
		if(number <= 0){
		    System.err.println("Error");
			System.exit(0);
		}
        
		int sizeOfArray = (number/2)+1;
		int[] even = new int[sizeOfArray];
		int[] odd = new int[sizeOfArray];
		
		// Iterate from 1 to number
		int evenIdx = 0 , oddIdx = 0;
		for(int i=1 ; i < number; i++){
		    if(i % 2 == 0){ 
		        even[evenIdx] = i;
                evenIdx++;
            } else {
                odd[oddIdx] = i;
                oddIdx++;
            }	
		}
		
		// Print odd numbers
		System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(odd[i] + " ");
        }
		
		 System.out.println();

        // Print even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(even[i] + " ");
        }

	    input.close();
    }
}