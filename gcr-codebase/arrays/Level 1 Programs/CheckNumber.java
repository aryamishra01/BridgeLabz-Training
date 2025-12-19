import java.util.Scanner;

public class CheckNumber
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		
		System.out.println("Enter 5 numbers : ");
		for(int i=0 ; i<array.length ; i++){
		    array[i] = input.nextInt();
		}
		for(int i=0 ; i<array.length ; i++){
		    
			if(array[i] < 0){
				System.out.println(array[i] +" is Negative");
			}
			else if(array[i] == 0){
			    System.out.println("Zero");
			}
			else{
			    
				System.out.print(array[i] +" is positive");
				if(array[i] % 2 == 0){
			       System.out.println(" and Even");
				}else{
				   System.out.println(" and Odd");
			    }
			}
			
			
		}
		
		// Comare first and last element of array 
			
			int first = array[0];
			int last = array[array.length - 1];
			
			if(first == last){
			    System.out.println("Equal");
			} 
			else if(first > last){
			    System.out.println("first is greater");
			}
			else{
			    System.out.println("last is greater");
			}
        
		input.close();
    }
}