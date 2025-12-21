import java.util.*;
public class CheckLeapYear {

	public static boolean isLeapYear(int year){
	
			if(year < 1582){
				return false;
			}else{
				if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
					return true;
				}
			}
		return false;
	}
	public static void main(String[] args ){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		if (isLeapYear(year)) {
            System.out.println(year +" is a Leap Year");
        } else {
            System.out.println(year +" is NOT a Leap Year");
        }

        input.close();
		
	}
}	