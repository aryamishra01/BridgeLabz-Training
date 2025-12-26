import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        String[] nums = new String[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }

        // Custom sorting
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if highest value is "0"
        if (nums[0].equals("0")) {
            System.out.println("Largest Number: 0");
            return;
        }

        // Build result
        StringBuilder result = new StringBuilder();
        for (String s : nums) {
            result.append(s);
        }

        System.out.println("Largest Number: " + result.toString());

        sc.close();
    }
}
