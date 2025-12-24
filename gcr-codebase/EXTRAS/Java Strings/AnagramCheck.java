import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i)]++;
		}

        for (int i = 0; i < s2.length(); i++){
            freq[s2.charAt(i)]--;
		}

        for (int i = 0; i < freq.length; i++){
            if (freq[i] != 0)
                return false;
		}

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }
}
