import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case
    public static String toggleCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Check uppercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            // Check lowercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            }
            // Other characters
            else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String toggled = toggleCase(text);
        System.out.println("Toggled string: " + toggled);

        sc.close();
    }
}
