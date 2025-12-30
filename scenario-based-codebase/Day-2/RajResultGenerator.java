import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int marks;

        // Input marks using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average);

        // Convert average into grade category
        int gradeKey;

        if (average >= 90)
            gradeKey = 1;
        else if (average >= 75)
            gradeKey = 2;
        else if (average >= 60)
            gradeKey = 3;
        else if (average >= 40)
            gradeKey = 4;
        else
            gradeKey = 5;

        // Switch case for grade
        switch (gradeKey) {
            case 1:
                System.out.println("Grade: A");
                break;
            case 2:
                System.out.println("Grade: B");
                break;
            case 3:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: F (Fail)");
                break;
            default:
                System.out.println("Invalid Result");
        }

        sc.close();
    }
}
