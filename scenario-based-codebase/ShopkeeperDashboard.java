/* 
Shopkeeper’s Discount Dashboard 
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments. 
*/

import java.util.Scanner;
import java.util.Arrays;

public class ShopkeeperDashboard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Enter number of items
        System.out.print("Enter total number of items: ");
        int items = input.nextInt();

        double[] itemsPrice = new double[items];

        // Input item prices
        for (int i = 0; i < items; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            itemsPrice[i] = input.nextDouble();
        }

        System.out.println("Price of items: " + Arrays.toString(itemsPrice));

        // Calculate total bill
        double totalBill = 0;
        for (double price : itemsPrice) {
            totalBill += price;
        }

        System.out.println("Total Bill: " + totalBill);

        // Step 2: Take discount rule from shopkeeper
        System.out.print("\nEnter minimum bill amount to apply discount: ");
        double minAmount = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Step 3: Apply discount using if-else
        double discount = 0;

        if (totalBill >= minAmount) {
            discount = totalBill * (discountPercent / 100);
        }

        double finalAmount = totalBill - discount;

        // Step 4: Output
        System.out.println("\n----- BILL SUMMARY -----");
        System.out.println("Total Bill       : " + totalBill);
        System.out.println("Discount Applied : " + discount);
        System.out.println("Final Amount     : " + finalAmount);

        input.close();
    }
}
