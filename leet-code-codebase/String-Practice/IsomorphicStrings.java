import java.util.Scanner;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        int[] sToT = new int[256];
        int[] tToS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sToT[c1] == 0 && tToS[c2] == 0) {
                sToT[c1] = c2;
                tToS[c2] = c1;
            } 
            else {
                if (sToT[c1] != c2 || tToS[c2] != c1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        System.out.println(isIsomorphic(s, t));
    }
}
