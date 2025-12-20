import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = 10;

        // Arrays to store employee data
        double[] salary = new double[size];
        double[] yearsOfService = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        
        for (int i = 0; i < size; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();

            // Validation check
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid values again.");
                i--; // Decrement index to repeat this employee
                continue;
            }
        }

        // Calculation
        for (int i = 0; i < size; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output results
        System.out.println("\nSalary & Bonus Summary ");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
