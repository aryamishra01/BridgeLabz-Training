import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        double bonus = 0;

        // Check eligibility for bonus
        if (years > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print bonus amount
        System.out.println("Bonus amount: " + bonus);

        input.close();
    }
}