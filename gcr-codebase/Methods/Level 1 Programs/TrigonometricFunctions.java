import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine and tangent
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        TrigonometricFunctions obj = new TrigonometricFunctions();
        double[] result = obj.calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + "° = " + result[0]);
        System.out.println("Cosine of " + angle + "° = " + result[1]);
        System.out.println("Tangent of " + angle + "° = " + result[2]);

        input.close();
    }
}
