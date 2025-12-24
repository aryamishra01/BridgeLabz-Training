import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {

        int minLength = (s1.length() < s2.length()) ? s1.length() : s2.length();

        for (int i = 0; i < minLength; i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        // If all characters are same, compare lengths
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        int result = compareStrings(s1, s2);

        if (result < 0)
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        else if (result > 0)
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        else
            System.out.println("Both strings are equal");

        sc.close();
    }
}
