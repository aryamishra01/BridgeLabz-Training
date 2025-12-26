import java.util.Scanner;
import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
	
        int k = 0; // count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = input.nextInt();
		int[] nums = new int[n];
		
		System.out.println("Enter elements of array : ");
		for(int i = 0; i<nums.length ; i++){
			nums[i] = input.nextInt();
		}
		
		System.out.println("Enter value to remove: ");
		int value = input.nextInt();

        int k = removeElement(nums, value);

        System.out.println("k = " + k);
        System.out.print("Updated array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
