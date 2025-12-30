/*
The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.

*/


import java.util.Scanner;

public class NumberGuessingGame {

	public static void guess(int guessNumber, int computerNumber){
		
			if(guessNumber < computerNumber){
				System.out.println("Too low");
			}
			else if(guessNumber > computerNumber){
				System.out.println("Too high");
			}
			else{
				System.out.println("Bravo! You guessed a right number");
			}
	
	}
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Computer has thought of a number");
		int computerNumber = 1 + (int) (Math.random() * ((100-1) + 1));
		
		int attempts = 0;
		int guessNumber;
		
		do{
		
			System.out.print("Guess a number between 1 and 100 : ");
		    guessNumber = input.nextInt();
			
			guess(guessNumber, computerNumber);
			attempts++;
			
		}while(attempts < 5);
		
		if(guessNumber != computerNumber){
			System.out.println("Oops! Your attempts are over and the number choosen by computer is : " +computerNumber);
		}
		
		input.close();
	}
}