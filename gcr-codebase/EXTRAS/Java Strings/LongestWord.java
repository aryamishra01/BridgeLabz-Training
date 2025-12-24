import java.util.*;

public class LongestWord{

	public static String longestWord(String sentence){
	
		String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence = input.nextLine();
		
		String longest = longestWord(sentence);
        System.out.println("Longest word: " + longest);

        input.close();
	}
}