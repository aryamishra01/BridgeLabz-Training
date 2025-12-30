import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (in meters): ");
        double height = input.nextDouble();

        // Calculate BMI using the formula
        double bmi = weight / (height * height);

        System.out.println("\nYour BMI is: " + bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } 
        else {
            System.out.println("Category: Overweight");
        }

        input.close();
    }
}
