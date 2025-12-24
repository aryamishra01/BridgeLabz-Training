import java.util.Scanner;

public class ReverseString{

	public static String reverse(String text){
	
		String rev = "";
		
		for(int i=text.length() - 1 ; i >= 0; i--){
			rev = rev + text.charAt(i);
		}
		
		return rev;
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string : ");
		String text = input.next();
		
		System.out.println("Original string : "+text);
		System.out.println("Reversed string : "+reverse(text));
		
		input.close();
		
	}
}