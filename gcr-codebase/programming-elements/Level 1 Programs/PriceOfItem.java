import java.util.*;
public class PriceOfItem{
    public static void main(String[] args){
		
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter unitPrice and quantity: ");
	    double unitPrice = input.nextDouble();
		int quantity = input.nextInt();
		
		// Calculate Total price of an item
		double totalPrice = unitPrice*quantity;
		
		System.out.println("The total purchase price is INR " +totalPrice +" if the quantity " +quantity +" and unit price is INR "+unitPrice);
		
		input.close();
    }
}