import java.util.Scanner;

public class PalindromeNumber{

	public static boolean isPalindrome(int x){
	
		int original = x;
		int rev =0;
		while(x > 0){
		
			int lastDigit = x%10;
			rev = rev * 10 + lastDigit;
			x = x/10;
		}
		
		if(original == rev){
			return true;
		}
		return false;
	}

	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number : ");
		int x = input.nextInt();
		
		boolean result = isPalindrome(x);
		
		if(result){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("NOT a Palindrome Number");
		}
	}
}