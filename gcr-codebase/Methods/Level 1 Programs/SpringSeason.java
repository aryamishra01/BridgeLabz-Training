import java.util.*;
public class SpringSeason{

    static boolean calculateSpring(int dd , int mm){
	    
		if(dd >= 20 && (mm == 3) || (mm == 4) ||  (mm == 5) || dd <= 20 && (mm == 6)){
		    return true;
		}
		return false;	
	}

	public static void main(String[] args){
	    
		int dd = Integer.parseInt(args[0]);
		int mm = Integer.parseInt(args[1]);
		
		boolean result = calculateSpring(dd,mm);
		
		if(result){
			System.out.println("Its a Spring Season");
		}else{
			System.out.println("Not a Spring Season");
		}
		
	}
}