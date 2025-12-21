import java.util.*;
public class NaturalNumbers{

	public int findSum(int n){
	    
		if(n<=0)
		{
			System.out.println("Enter positive number");
			System.exit(0);
		}
		int sum = 0;
		for(int i = 1; i <= n ; i++){
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args){
	    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = input.nextInt();
		
		NaturalNumbers obj = new NaturalNumbers();
		System.out.println("Sum of natural numbers upto " +number +" is "+obj.findSum(number));
		
		input.close();
	}
		
}