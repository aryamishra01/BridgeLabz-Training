import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 100;   // initial smart card balance

        while (true) {

            System.out.println("\nCurrent Balance: " + balance);
            System.out.print("Enter distance in km (-1 to quit): ");
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            // fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 
                     : (distance <= 15) ? 20 
                     : 30;

            if (balance < fare) {
                System.out.println("Insufficient balance! Recharge required.");
                break;
            }

            balance -= fare;

            System.out.println("Fare deducted: " + fare);
            System.out.println("Remaining balance: " + balance);

            if (balance == 0) {
                System.out.println("Balance exhausted!");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro Smart Card.");
        sc.close();
    }
}
