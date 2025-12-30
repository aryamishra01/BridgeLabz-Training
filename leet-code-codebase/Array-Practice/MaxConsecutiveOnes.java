import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements (0 or 1) of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++; // increase current consecutive count
                if (count > maxCount) {
                    maxCount = count; // update max
                }
            } else {
                count = 0; // reset counter if 0 encountered
            }
        }

        System.out.println("Maximum consecutive 1's: " + maxCount);
    }
}
