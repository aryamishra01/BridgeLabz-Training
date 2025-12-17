import java.util.*;
public class FahrenheitConversion{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter temperature in Celcius : ");
	   float temp = sc.nextFloat();
	   float conversion = (temp * 9/5) + 32;
	   System.out.println("Temperature in Fahrenheit: " +conversion);
	}
}