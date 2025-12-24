import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentChar(String text) {

        char mostFrequent = text.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < text.length(); i++) {
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = text.charAt(i);
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        char result = findMostFrequentChar(text);
        System.out.println("Most Frequent Character: '" + result + "'");

        sc.close();
    }
}
