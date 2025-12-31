/*
Festival Lucky Draw 
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("----- Welcome to Diwali Mela Lucky Draw -----");

        while (true) {

            System.out.print("\nEnter your lucky number (enter -1 to stop): ");
            number = input.nextInt();

            // stop condition
            if (number == -1) {
                System.out.println("Lucky Draw closed. Thank you for visiting!");
                break;
            }

            // invalid input
            if (number <= 0) {
                System.out.println("Invalid number! Please enter a positive number.");
                continue;
            }

            // lucky draw condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Better luck next time!");
            }
        }
    }
}
