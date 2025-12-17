import java.util.*;
public class KilometersToMiles{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter distance in kilometers : ");
	   double dis = sc.nextDouble();
	   double milesConversion = dis * 0.621371;
	   System.out.println("Distance in mile : " +milesConversion);
	}
}