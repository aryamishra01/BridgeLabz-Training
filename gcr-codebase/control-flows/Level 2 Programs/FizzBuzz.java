import java.util.Scanner;

public class FizzBuzz
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		if (n<=0)
		{
			System.out.print("Enter a positive number: ");
		}
		else 
		{
			for(int i=1; i <=n; i++)
			{
				//Check if number divisible by both 3 and 5 
				if (i%3 == 0 && i%5 == 0)
				{
					System.out.println("FizzBuzz");
				}
				// Check if number is divisible by only 3
				else if (i%3 == 0)
				{
					System.out.println("Fizz");
				}
				// Check if number is divisible by only 5
				else if (i%5 ==0)
				{
					System.out.println("Buzz");
				}
				//Print the number
				else 
				{
					System.out.println(i);
				}
			}
		}
		input.close();
	}

}				