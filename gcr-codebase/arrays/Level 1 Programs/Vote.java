import java.util.Scanner;

public class Vote
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int[] age = new int[10];
		
		System.out.println("Enter age of all 10 Students : ");
		for(int i=0 ; i<age.length ; i++){
		    age[i] = input.nextInt();
		}
		for(int i=0 ; i<age.length ; i++){
		    
			if(age[i] < 0){
			    System.out.println("Invalid Age");
			}
			else if(age[i] >= 18){
			    System.out.println("The Student with age " +age[i] +" can vote");
			}
			else{
				System.out.println("The Student with age " +age[i] +" cannot vote");
			}
		}
        
		input.close();
    }
}