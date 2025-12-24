import java.util.Scanner;

public class CustomReplace {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

    String[] words = sentence.split(" ");
    String result = "";

		for (int i = 0; i < words.length; i++) {

			if (words[i].equals(oldWord)) {
				result += newWord;
			} else {
				result += words[i];
			}

			result += " ";
		}
		return result.trim();
	}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        String output = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + output);

        sc.close();
    }
}
