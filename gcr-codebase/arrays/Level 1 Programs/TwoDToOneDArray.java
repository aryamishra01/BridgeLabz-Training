import java.util.*;
public class TwoDToOneDArray{
    public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		
		// Take row and columns input from user 
		System.out.println("Enter rows: ");
		int rows = input.nextInt();
		System.out.println("Enter columns: ");
		int columns = input.nextInt(); 
		
		// Create 2D array and take user input
		int [][] matrix = new int[rows][columns];
		
		System.out.println("Enter elements for 2D matrix: ");
		for(int i = 0; i < rows; i++){
		    for(int j = 0; j < columns; j++){
			    matrix[i][j] = input.nextInt();
			}
		}
		
		// Create one D array 
		int[] array = new int[rows*columns];
		
		int index = 0 ;
		for(int i = 0; i < rows; i++){
		    for(int j = 0; j < columns; j++){
			    array[index] = matrix[i][j] ; // Copy 2D array to 1D array
				index++;
			}
		}
		
		// Print 2D array
		System.out.println("2D Array:");
		for(int i = 0; i < rows; i++){
		    for(int j = 0; j < columns; j++){
			    System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
		
		// Print 1D array 
		System.out.println("1D Array:");
		for(int i=0; i < array.length; i++){
		    System.out.print(array[i] +" ");
		}
		
		input.close();
	}
}
		
		