import java.util.*;
public class MaximumHandshakes{
    public static void main(String[] args){
		
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
	    int numberOfStudents = input.nextInt();
		
		// Calculate maximum handshakes
		int maxHandshakes = (numberOfStudents*(numberOfStudents - 1))/2; 
		
		System.out.println("The number of possible handshakes is " +maxHandshakes);
		
		input.close();
    }
}