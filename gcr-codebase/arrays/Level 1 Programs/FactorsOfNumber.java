import java.util.Scanner;

public class FactorsOfNumber
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = input.nextInt();
		
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0;
		

        // Find factors of the number
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Check if array is full
                if (index == maxFactor) {

                    // Increase size
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    // Copy old elements
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
