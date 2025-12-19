import java.util.*;
public class RocketLaunchCount{
    public static void main(String[] args){
	    
		//Take number as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter countdown start number: ");
		int counter = input.nextInt();
		
		
		// Print countdown for rocket lanch 
		while(counter >= 1){
		    System.out.println(counter);
			counter--;
		}
		
		input.close();
	}
}