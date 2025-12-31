/* 
Currency Exchange Kiosk 
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;
public class CurrencyExchange{
	
	//Calculate US currency
	public static double usd(double inr){
		return inr * 0.011;
	}
	
	//Calculate EURO currency
	public static double euro(double inr){
		return inr * 0.0095;
	}
	
	//Calculate VND currency
	public static double vietnameseDong(double inr){
		return inr * 292.75;
	}
	
	//Calculate AMD currency
	public static double arabEmiratesDirham(double inr){
		return inr * 0.041;
	}
	

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		char choice2;
		do{
			System.out.println("Enter indian currency amount : ");
			double inr = input.nextInt();
			
			System.out.println("Choose target currency you want to convert indian currency into: ");
			System.out.println("1. US \n2. EUR \n3. VND \n4. AED ");
			
			int choice = input.nextInt();
			
			switch(choice){
				
				case 1 :
					System.out.println("Indian currency " +inr +" is equal to " +usd(inr) +" dollar");
					break;
				case 2 : 
					System.out.println("Indian currency " +inr +" is equal to " +euro(inr) +" euro");
					break;
				case 3 : 
					System.out.println("Indian currency " +inr +" is equal to " +vietnameseDong(inr) +" vmd");
					break;
				case 4 : 
					System.out.println("Indian currency " +inr +" is equal to " +arabEmiratesDirham(inr) +" amd");
					break;
				default:
					System.out.println("Invalid choice of choosing currency! ");
			}
			System.out.println("Do you want to convert currency again (y/n) : " );
		    choice2 = input.next().charAt(0);

		} while(choice2 == 'y');
		System.out.println("---Thankyou for using currency exchange converter---"); 
	}
}