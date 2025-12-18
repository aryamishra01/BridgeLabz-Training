import java.util.*;
public class AveragePercentMarks{
    public static void main(String[] args){
		
		// Declaring and initializing marks
	    double marksInMath = 94;
        double marksInPhysics = 95;
        double marksInChemistry = 96;
        
		//Calculate Average marks 
		double avgMarks = (marksInMath + marksInPhysics+ marksInChemistry)/3;
		
		System.out.println("Sam’s average mark in PCM is " +avgMarks);
	}
}