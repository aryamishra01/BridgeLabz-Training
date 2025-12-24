import java.util.Scanner;

public class BasicCalculatorBuiltIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (integer): ");
        int num1 = input.nextInt();

        System.out.print("Enter second number (integer): ");
        int num2 = input.nextInt();

        System.out.println("Choose operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = input.nextInt();
        int resultInt = 0;
        double resultDouble = 0;

        switch (choice) {
            case 1:
                resultInt = Math.addExact(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case 2:
                resultInt = Math.subtractExact(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case 3:
                resultInt = Math.multiplyExact(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    resultDouble = (double) num1 / num2; // using built-in division
                    System.out.println("Result: " + resultDouble);
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}
