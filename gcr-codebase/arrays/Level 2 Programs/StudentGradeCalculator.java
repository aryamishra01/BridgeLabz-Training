import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        // Arrays to store marks, percentage and grade
        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();

            System.out.print("Maths: ");
            maths[i] = input.nextInt();

            // Check for negative marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--;   // repeat same student
            }
        }

        
        for (int i = 0; i < number; i++) {

            
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // -------- OUTPUT --------
        System.out.println("\n----- Student Result -----");
        System.out.println("Physics  Chemistry  Maths  Percentage  Grade");

        for (int i = 0; i < number; i++) {
            System.out.printf("%7d  %9d  %5d  %9.2f   %c\n",
                    physics[i], chemistry[i], maths[i],
                    percentage[i], grade[i]);
        }

        input.close();
    }
}
