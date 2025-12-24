import java.util.Scanner;

public class TemperatureConverter {

	// Method to take temperature input
    public static double takeInput(String scale) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in " + scale + ": ");
        return sc.nextDouble();
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to display result
    public static void displayResult(double input, double result, String fromScale, String toScale) {
        System.out.println(input + " " + fromScale + " = " + result + " " + toScale);
    }

    public static void main(String[] args) {

        // Convert Celsius to Fahrenheit
        double celsius = takeInput("Celsius");
        double fahrenheitResult = celsiusToFahrenheit(celsius);
        displayResult(celsius, fahrenheitResult, "Celsius", "Fahrenheit");

        // Convert Fahrenheit to Celsius
        double fahrenheit = takeInput("Fahrenheit");
        double celsiusResult = fahrenheitToCelsius(fahrenheit);
        displayResult(fahrenheit, celsiusResult, "Fahrenheit", "Celsius");
    }
}
