import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10;
		int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits from number
        while (number != 0) {
		
            if (index == maxDigit) {
                break;
            }

            // Remove last digit and store in array
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Variables to store largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        // Loop to find largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("\nLargest digit is : " + largest);
        System.out.println("Second largest digit is : " + secondLargest);

        input.close();
    }
}
