import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum of given array
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);

        sc.close();
    }
}
