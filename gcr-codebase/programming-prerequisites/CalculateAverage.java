import java.util.*;
public class CalculateAverage{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number a - ");
	   int a = sc.nextInt();
	   System.out.println("Enter number b - ");
	   int b = sc.nextInt();
	   System.out.println("Enter number c - ");
	   int c = sc.nextInt();
	   
	   int avg = (a+b+c) / 3;
	   System.out.println("Average of numbers = " +avg);
	}
}