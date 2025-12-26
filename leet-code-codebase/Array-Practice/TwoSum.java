import java.util.Scanner;
import java.util.Arrays;

public class TwoSum{

	public static int[] twoSum(int[] nums, int target){
		
		int[] indices = new int[2];
		
		for(int i = 0; i<nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if((nums[i] + nums[j]) == target){
					indices[0] = i;
					indices[1] = j;
				}
			}
			
		}
		return indices;
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = input.nextInt();
		int[] nums = new int[n];
		
		System.out.println("Enter elements of array: ");
		for(int i = 0; i<nums.length ; i++){
			nums[i] = input.nextInt();
		}
		
		System.out.println("Enter target element: ");
		int target = input.nextInt();
		
		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}