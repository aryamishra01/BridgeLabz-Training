import java.util.Scanner;

public class VowelsAndConsonantsCount {

	public static int[] countVowelsAndConsonants(String text){
		
		int vowelsCount = 0;
		int consonantsCount = 0;
		
		int[] count = new int[2];
		
		//Convert text to lowercase
		String lowercaseText = text.toLowerCase();
		
		for(int i=0; i < lowercaseText.length() ; i++){
			if(lowercaseText.charAt(i) == 'a' ||  lowercaseText.charAt(i) == 'e' || lowercaseText.charAt(i) == 'i' || lowercaseText.charAt(i) == 'o' || lowercaseText.charAt(i) == 'u'){
				vowelsCount++;
			}else{
				consonantsCount++;
			}
		}
		
		count[0] = vowelsCount;
		count[1] = consonantsCount;
		
		return count;
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string : ");
		String text = input.next();
		
		int[] result = countVowelsAndConsonants(text);

		System.out.println("Vowels: " + result[0]);
		System.out.println("Consonants: " + result[1]);
		
		input.close();
	}
}	