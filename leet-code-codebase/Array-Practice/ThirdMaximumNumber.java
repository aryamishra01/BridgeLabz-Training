import java.util.Scanner;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Initialize first, second, third max as Long.MIN_VALUE
        Long first = null, second = null, third = null;

        for (int num : nums) {
            if (first != null && num == first) continue;   // skip duplicates
            if (second != null && num == second) continue;
            if (third != null && num == third) continue;

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } else if (third == null || num > third) {
                third = (long) num;
            }
        }

        // If third max exists, print it, else print first max
        if (third != null) {
            System.out.println("Third maximum number: " + third);
        } else {
            System.out.println("Third maximum does not exist, maximum number: " + first);
        }
    }
}
