import java.util.Scanner;

public class MoveZeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int pos = 0;

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        // Fill remaining positions with zero
        while (pos < n) {
            nums[pos] = 0;
            pos++;
        }

        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
