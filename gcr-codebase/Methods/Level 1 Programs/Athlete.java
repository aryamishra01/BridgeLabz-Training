import java.util.Scanner;

public class Athlete {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3;   // perimeter of triangle

        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

		double totalDistance = 5000; // 5km = 5000m
		
        // Calling method
        double rounds = calculateRounds(side1, side2, side3, totalDistance);

        // Output
        System.out.println("Number of rounds to complete 5 km run: " + rounds);

        input.close();
    }
}
