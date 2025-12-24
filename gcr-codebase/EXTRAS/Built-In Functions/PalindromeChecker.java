import java.util.Scanner;

public class PalindromeChecker {

    // Method to take input
    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String text) {

        // Remove spaces and convert to lowercase
        text = text.replace(" ", "").toLowerCase();

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    // Method to display result
    public static void displayResult(String text, boolean result) {

        if (result)
            System.out.println("\"" + text + "\" is a Palindrome.");
        else
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
    }

    public static void main(String[] args) {

        String input = takeInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
