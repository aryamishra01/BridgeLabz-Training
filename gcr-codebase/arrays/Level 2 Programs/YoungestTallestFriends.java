import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
		double[] height = new double[3];

        // Loop to take age and height input
        for (int i = 0; i < 3; i++) {

            System.out.println("\nEnter details of " + friends[i]);

            System.out.print("Enter age: ");
            age[i] = input.nextInt();

            System.out.print("Enter height: ");
            height[i] = input.nextDouble();
        }

        // Assuming first friend is youngest and tallest
        int youngest = 0;
        int tallest = 0;

        
        for (int i = 1; i < 3; i++) {
			
			// Check for youngest friend
            if (age[i] < age[youngest]) {
                youngest = i;
            }

            // Check for tallest friend
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        // Display the result
        System.out.println("Youngest friend is : " + friends[youngest]);
        System.out.println("Tallest friend is  : " + friends[tallest]);

        input.close();
    }
}
