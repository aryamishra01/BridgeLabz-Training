import java.util.Scanner;

public class MultiplicationTable 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = input.nextInt();
		
		int[] result = new int[10];
		
		
		for(int i=6 ; i <= 9 ; i++){
		    result[i] = number*i  ;
			System.out.println(number +" * " +i +" = " +result[i]);
		}
        
		input.close();
    }
}