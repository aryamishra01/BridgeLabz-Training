import java.util.*;
public class SpringSeason{
    public static void main(String[] args){
	    
		//Take month and day as input from Command-line 
			int month = Integer.parseInt(args[0]);
			int day = Integer.parseInt(args[1]);
			
		// Check if a day and month lies in a Spring season 
		// Spring season starts from 20 March to 20 June
		boolean checkSpringSeason = ((month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20));
		
		if(checkSpringSeason){
		    System.out.println("Its a Spring Season");
		}
		else{
		    System.out.println("Not a Spring Season");
		}
	}
}