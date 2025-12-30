import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) nums1[i] = sc.nextInt();

        // Input second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) nums2[i] = sc.nextInt();

        int[] temp = new int[Math.min(n, m)];
        int k = 0;

        // Basic nested loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[k++] = nums1[i];
                    nums2[j] = -1; // mark used
                    break;
                }
            }
        }

        // Print result
        System.out.print("Intersection with duplicates: [");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
