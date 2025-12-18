import java.util.*;
public class UniversityFeeDiscount{
    public static void main(String[] args){
		
	    double fee;
		double discountPercent;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fee amount: ");
		fee = input.nextDouble();
		System.out.println("Enter discount amount to be applied: ");
		discountPercent = input.nextDouble();
		
		//Calculate discount and fees to be paid by student
		double discount = (fee * discountPercent)/100;
		double feeToPay = fee - discount;
		
		System.out.println("The discount amount is INR " +discount +" and final discounted fee is INR " +feeToPay);
    }
}