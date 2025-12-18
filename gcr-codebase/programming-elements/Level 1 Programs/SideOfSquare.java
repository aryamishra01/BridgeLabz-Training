import java.util.*;
public class SideOfSquare{
    public static void main(String[] args){
		
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter perimeter of Square: ");
	    int perimeterOfSquare = input.nextInt();
		
		// Calculate side of square
		int squareSide = perimeterOfSquare / 4;
		
		System.out.println("The length of the side is " +squareSide +" whose perimeter is " +perimeterOfSquare);
		
		input.close();
    }
}
