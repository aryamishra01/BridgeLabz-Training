import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Boyer-Moore Voting Algorithm
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        System.out.println("Majority Element: " + candidate);

        sc.close();
    }
}
