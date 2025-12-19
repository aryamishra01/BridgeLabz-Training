import java.util.Scanner;

public class FizzBuzzArray
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		// Create String array
        String[] results = new String[number + 1];
		
		// check if number is positive
		if(number > 0){
			// Loop from 0 to number and save results
			for (int i = 0; i <= number; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					results[i] = "FizzBuzz";
				} else if (i % 3 == 0) {
					results[i] = "Fizz";
				} else if (i % 5 == 0) {
					results[i] = "Buzz";
				} else {
					results[i] = String.valueOf(i);
				}
			}
        }
		
		// Print the results with position
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
		
		input.close();
	}
}