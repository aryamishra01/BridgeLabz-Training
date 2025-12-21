import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Formula method
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {

            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);

            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Result is correct. Both values are equal.");
            } else {
                System.out.println("Result is incorrect. Values are not equal.");
            }
        }

        input.close();
    }
}
