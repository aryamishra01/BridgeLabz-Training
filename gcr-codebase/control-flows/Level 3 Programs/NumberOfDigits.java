import java.util.Scanner;

public class NumberOfDigits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int count = 0;
		
		while (number > 0) {
            int lastDigit = number % 10; // get last digit
            number = number / 10;        // remove last digit
            count++;                     // increase count
        }
		System.out.println("Count: " + count);
		input.close();
	}
}