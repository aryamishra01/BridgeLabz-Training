import java.util.*;
public class IntOperation {
    public static void main(String[] args){
		
		int a,b,c;
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// Calculate Arithmetic Operations
		int result1 = a+(b*c);
		int result2 = (a*b)+c;
		int result3 = c+(a/b);
		int result4 = (a%b)+c;
		
		System.out.println(" The results of Int Operations are "+result1 +", " +result2 +" ," +result3 +" and "+result4);
		
    }
}