import java.util.*;
public class WindChill{

	public double calculateWindChill(double temperature, double windSpeed){
	    
		double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75)* Math.pow(windSpeed,0.16);
		return windChill;		
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature : ");
		double temperature = input.nextDouble();
		System.out.println("Enter wind : ");
		double windSpeed = input.nextDouble();
		
		WindChill obj = new WindChill();
		double result = obj.calculateWindChill(temperature,windSpeed);
		System.out.println("The wind chill temperature is : "+result);
		input.close();
	}
		
}