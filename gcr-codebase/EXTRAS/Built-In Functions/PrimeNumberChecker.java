import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check prime 
    public static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        // Check up to square root (built-in Math.sqrt)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        input.close();
    }
}
