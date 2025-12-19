import java.util.*;
public class VotingEligibility{
    public static void main(String[] args){
	    
		//Taking age as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = input.nextInt();
		
		
		// Check if person can vote or not 
		if(age>=18){
		    System.out.println("The person's age is "+age +" and can vote");
		}
		else{
		    System.out.println("The person's age is "+age +" and cannot vote");
		}
		
		input.close();
	}
}