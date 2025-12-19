import java.util.Scanner;

public class Multiplication
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = input.nextInt();
		
		int[] result = new int[10];
		
		
		for(int i=0 ; i < result.length ; i++){
		    result[i] = number*(i + 1) ;
			System.out.println(number +" * " + (i+1) +" = " +result[i]);
		}
        
		input.close();
    }
}