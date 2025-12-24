import java.util.Scanner;

public class NumberGuessingGame {

    static Scanner input = new Scanner(System.in);

    // Built-in random number generation
    public static int generateGuess(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    // Built-in input handling
    public static char getFeedback() {
        System.out.print("Enter feedback (h = high, l = low, c = correct): ");
        return input.next().toLowerCase().charAt(0);
    }

    // Update range using built-in Math methods
    public static int[] updateRange(int min, int max, int guess, char feedback) {

        if (feedback == 'h') {
            max = Math.min(max, guess - 1);
        } else if (feedback == 'l') {
            min = Math.max(min, guess + 1);
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        System.out.println("Think of a number between 1 and 100.");

        int min = 1, max = 100;

        while (true) {

            int guess = generateGuess(min, max);
            System.out.println("Computer guesses: " + guess);

            char feedback = getFeedback();

            if (feedback == 'c') {
                System.out.println("Computer guessed the correct number!");
                break;
            }

            int[] range = updateRange(min, max, guess, feedback);
            min = range[0];
            max = range[1];
        }

        input.close();
    }
}
