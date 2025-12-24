import java.util.Scanner;

public class CheckPalindrome{

	public static boolean checkPalindrome(String str){
		
		String forwardCheck = "";
		String backwardCheck = "";
		
		for(int i = 0; i<str.length(); i++){
			forwardCheck = forwardCheck + str.charAt(i);
		}
		for(int i = str.length() - 1; i >= 0; i--){
			backwardCheck = backwardCheck + str.charAt(i);
		}
		
		if(forwardCheck.equals(backwardCheck))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = input.next();
		
		boolean result = checkPalindrome(str);
		
		if(result){
			System.out.println("String is a Palindrome");
		}else{
			System.out.println("String is NOT a Palindrome");
		}
		
		input.close();
	}
}