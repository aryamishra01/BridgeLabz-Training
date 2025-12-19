import java.util.Scanner;

public class MeanHeight
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter heights of team members : ");
		double[] heights = new double[11];
		
		for(int i=0 ; i < heights.length; i++){
		    heights[i] = input.nextDouble();
		}
		
		int sumOfElements = 0;
		
		
		for(int i=0 ; i < heights.length; i++){
		    sumOfElements += heights[i];
		}
		int numberOfElements = heights.length;
		
		double meanHeight = sumOfElements/numberOfElements;
		
		System.out.println("Mean height of football team is "+meanHeight);
        
		input.close();
    }
}