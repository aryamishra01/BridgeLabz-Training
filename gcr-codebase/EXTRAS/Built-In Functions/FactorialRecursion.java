import java.util.Scanner;

public class FactorialRecursion {

    // Method to take input
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {

        // Base condition
        if (n == 0 || n == 1)
            return 1;

        // Recursive call
        return n * factorial(n - 1);
    }

    // Method to display result
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {

        int number = takeInput();
        long result = factorial(number);
        displayResult(number, result);
    }
}
