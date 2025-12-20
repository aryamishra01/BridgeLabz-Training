import java.util.*;
public class CalculateMaxHandshakes{

	public void calculateHandshakes(int numberOfStudents){
	    
		int maxHandshakes = (numberOfStudents * (numberOfStudents - 1))/2;
		System.out.println("The number of possible handshakes is " +maxHandshakes);
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int numberOfStudents = input.nextInt();
		
		
		CalculateMaxHandshakes obj = new CalculateMaxHandshakes();
		
		obj.calculateHandshakes(numberOfStudents);
	}
}