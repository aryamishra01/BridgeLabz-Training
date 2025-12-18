import java.util.*;
public class StudentFee{
    public static void main(String[] args){
		
	    int fees = 125000;
		int discountPercent = 10;
		
		//Calculate discount and fees to be paid by student
		int discount = (fees * discountPercent)/100;
		int feesToPay = fees - discount;
		
		System.out.println("The discount amount is INR " +discount +" and final discounted fee is INR " +feesToPay);
    }
}