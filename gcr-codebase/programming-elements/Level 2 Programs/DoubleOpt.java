import java.util.*;
public class DoubleOpt {
    public static void main(String[] args){
		
		double a,b,c;
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		// Calculate Arithmetic Operations
		double result1 = a+(b*c);
		double result2 = (a*b)+c;
		double result3 = c+(a/b);
		double result4 = (a%b)+c;
		
		System.out.println(" The results of Int Operations are "+result1 +", " +result2 +" ," +result3 +" and "+result4);
		
    }
}