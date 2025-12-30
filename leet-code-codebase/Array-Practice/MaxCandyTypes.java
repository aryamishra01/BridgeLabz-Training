import java.util.Scanner;

public class MaxCandyTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter number of candies (even number): ");
        int n = sc.nextInt();
        int[] candyType = new int[n];
        System.out.println("Enter candy types:");
        for (int i = 0; i < n; i++) {
            candyType[i] = sc.nextInt();
        }

        // Sort the array to count distinct types
        java.util.Arrays.sort(candyType);

        int distinct = 1; // first candy is always counted
        for (int i = 1; i < n; i++) {
            if (candyType[i] != candyType[i - 1]) {
                distinct++;
            }
        }

        int maxEat = Math.min(distinct, n / 2);
        System.out.println("Maximum different types Alice can eat: " + maxEat);
    }
}
