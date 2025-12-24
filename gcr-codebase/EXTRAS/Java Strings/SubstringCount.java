import java.util.Scanner;

public class SubstringCount {

    // Method to count substring occurrences
    public static int countOccurrences(String text, String sub) {

        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {

            int j;
            for (j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

            if (j == sub.length()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter main string:");
        String text = sc.nextLine();

        System.out.println("Enter substring:");
        String sub = sc.nextLine();

        int result = countOccurrences(text, sub);
        System.out.println("Occurrences: " + result);

        sc.close();
    }
}
