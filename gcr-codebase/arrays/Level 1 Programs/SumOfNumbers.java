import java.util.Scanner;

public class SumOfNumbers
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
	
		double[] array = new double[10];
		double total = 0.0;
		int index = 0;
		
		while(true){
		    System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            // Break if array size reaches 10
            if (index == 10) {
				System.out.println("Array limit reached!");
                break;
            }

            // Store value in array
            array[index] = value;
            index++;
        }
		

		for (int i = 0; i < index; i++) {
            System.out.println("Numbers stored in array : " +array[i] +" ");
            total = total + array[i];
        }
		
		System.out.println("Total value : " +total);
        
		input.close();
    }
}