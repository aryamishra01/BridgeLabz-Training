import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input date
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.next());

        // Add days, months, and years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract weeks
        updatedDate = updatedDate.minusWeeks(3);

        // Output
        System.out.println("Final Date: " + updatedDate);

        sc.close();
    }
}
