import java.util.Scanner;

public class ReworkLargestSecondLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();

		int maxDigit = 10;

        // Array to store digits of the number
        int[] digits = new int[maxDigit];
		
        int index = 0;

        while (number != 0) {

            // If index reaches maxDigit, increase array size
            if (index == maxDigit) {

                // Increase maxDigit by 10
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // Copy old digits into temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            // Store last digit of number in array
            digits[index] = (int)number % 10;

            // Remove last digit from number
            number = number / 10;

            index++;
        }

        
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\nLargest digit is : " + largest);
        System.out.println("Second largest digit is : " + secondLargest);

        input.close();
    }
}
