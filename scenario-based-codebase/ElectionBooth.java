import java.util.Scanner;

public class ElectionBooth{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		int vote1 = 0, vote2 = 0, vote3 = 0;
		
		while(true){
		
			System.out.println("Enter age (-1 to stop voting): ");
			int age = input.nextInt();
			
			if(age == -1){
				break;
			}
			
			if(age<18){
				System.out.println("Not eligible to vote");
				continue;
			}
			
			// voting
            System.out.println("Cast your vote:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
			
			System.out.print("Enter your choice(as 1 , 2 or 3): ");
            int choice = input.nextInt();

            if (choice == 1) {
                vote1++;
            } else if (choice == 2) {
                vote2++;
            } else if (choice == 3) {
                vote3++;
            } else {
                System.out.println("Invalid vote!");
            }
		}	
		
		// result
		System.out.println("\n--- Election Result ---");
		System.out.println("Candidate A: " + vote1 + " votes");
		System.out.println("Candidate B: " + vote2 + " votes");
		System.out.println("Candidate C: " + vote3 + " votes");

		input.close();             
        
	}
}