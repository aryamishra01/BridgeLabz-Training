import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int tempNumber = number;
        int count = 0;

        // Find count of digits in the number
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10;
        }

        int[] digits = new int[count];

        // Extract digits and store in array
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        // Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Find frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
