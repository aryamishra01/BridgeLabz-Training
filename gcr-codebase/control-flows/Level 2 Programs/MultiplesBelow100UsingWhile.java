import java.util.Scanner;

public class MultiplesBelow100UsingWhile 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		// Check if number lies between 0 and 100
        if (number <= 0 || number >= 100) 
		{
            System.out.println("Please enter a positive number less than 100");
        } 
		else 
		{
            System.out.println("Multiples of " + number + " below 100:");
			
			//Declare and initialize counter variable 
            int counter = number -1;

            while (counter > 1) 
			{
                if (number % counter == 0) 
				{   
			        // Print those counters which completely divides the number 
                    System.out.println(counter);
                }
                counter--;
            }
        }
        input.close();
    }
}
