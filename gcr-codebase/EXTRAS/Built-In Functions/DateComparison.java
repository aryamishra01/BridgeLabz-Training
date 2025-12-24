import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input first date
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(input.next());

        // Input second date
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(input.next());

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        } 
        else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }

        input.close();
    }
}
