import java.util.Scanner;

public class GCDAndLCM {

    // Method to take input
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        return numbers;
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using formula
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b); // LCM = (a*b)/GCD
    }

    // Method to display result
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {

        int[] nums = takeInput();
        int a = nums[0];
        int b = nums[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b);

        displayResult(a, b, gcd, lcm);
    }
}
