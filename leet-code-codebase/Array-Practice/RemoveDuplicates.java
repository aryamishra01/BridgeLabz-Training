import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates{

	public static int removeDuplicates(int[] nums){
		
		if (nums.length == 0)
            return 0;

        int k = 1; // index for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
		
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = input.nextInt();
		int[] nums = new int[n];
		
		System.out.println("Enter elements of array sorted in non-decreasing order: ");
		for(int i = 0; i<nums.length ; i++){
			nums[i] = input.nextInt();
		}
		
		int k = removeDuplicates(nums);

        System.out.println("k = " + k);

        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
	}
}