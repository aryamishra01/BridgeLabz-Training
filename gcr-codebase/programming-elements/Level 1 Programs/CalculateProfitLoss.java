import java.util.*;
public class CalculateProfitLoss{
    public static void main(String[] args){
		
	    int costPrice = 129;
		int sellingPrice = 191;
		
		//Calculate Profit and Profit percent
		int profitInNumber = sellingPrice - costPrice;
		double profitPercent = (profitInNumber *100)/costPrice;
		
		System.out.println("The Cost Price is INR " +costPrice + " and Selling Price is INR " +sellingPrice  +"\nThe Profit is INR " +profitInNumber +" and the Profit Percentage is "+profitPercent);
		
	}
}