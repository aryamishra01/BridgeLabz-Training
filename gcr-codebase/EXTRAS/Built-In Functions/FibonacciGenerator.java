import java.util.Scanner;

public class FibonacciGenerator {

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {

        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = input.nextInt();

        printFibonacci(n);

        input.close();
    }
}
