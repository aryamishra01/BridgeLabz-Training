import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String text){

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string : ");
        String text = input.next();

        String removedDuplicates = removeDuplicates(text);

        System.out.println("Original string is : " + text);
        System.out.println("After removing duplicates : " + removedDuplicates);

        input.close();
    }
}
