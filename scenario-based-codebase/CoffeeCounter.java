import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String coffee;
        double price = 0;
        int quantity;
        double total, gst, finalAmount;

        while (true) {

            System.out.println("\nEnter coffee type (espresso / latte / cappuccino / americano)");
            System.out.println("Type 'exit' to stop:");
            coffee = sc.next().toLowerCase();

            if (coffee.equals("exit")) {
                System.out.println("Thank you! Cafe closed");
                break;
            }

            switch (coffee) {
                case "espresso":
                    price = 100;
                    break;

                case "latte":
                    price = 120;
                    break;

                case "cappuccino":
                    price = 150;
                    break;

                case "americano":
                    price = 110;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            total = price * quantity;
            gst = total * 0.05;   // 5% GST
            finalAmount = total + gst;

            System.out.println("----- Bill Details -----");
            System.out.println("Coffee: " + coffee);
            System.out.println("Price per cup: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: " + total);
            System.out.println("GST (5%): " + gst);
            System.out.println("Final Amount: " + finalAmount);
        }

        sc.close();
    }
}
