import java.util.Scanner;

public class ContainsDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean duplicateFound = false;

        // checking duplicates using nested loops
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    duplicateFound = true;
                    break;
                }
            }
            if (duplicateFound)
                break;
        }

        System.out.println("Output: " + duplicateFound);

        sc.close();
    }
}
