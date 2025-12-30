/*
Temperature Logger 
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemperatureLogger{

	public static int calculateAverage(int[] temp){
	
		int sum = 0; 
		
		for(int i=0; i < temp.length; i++){
		
			sum += temp[i];
		}
		int average = sum/7;
		return average;
	}
	
	public static int maxTemperature(int[] temp){
	
		int maxTemp = temp[0];
		
		for(int i=0; i < temp.length; i++){
		
			if(maxTemp < temp[i]){
				maxTemp = temp[i];
			}
		}
		return maxTemp;
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		//Record temperatures of 7 days
		int[] temp = new int[7];

		for(int i=0; i < temp.length; i++){
		
			System.out.print("Enter temperature of Day " +(i+1) +" : " );
			temp[i] = input.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Average of temperatures : " +calculateAverage(temp));
		
		System.out.println("Maximum temperature is : " +maxTemperature(temp));
	}
}	