import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        // count characters in s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // subtract counts using t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        System.out.println("Output: " + isAnagram(s, t));

        sc.close();
    }
}
