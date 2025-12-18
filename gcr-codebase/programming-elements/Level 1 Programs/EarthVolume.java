import java.util.*;
public class EarthVolume{
    public static void main(String[] args){
		
	    double pi = 3.14;
		int radius = 6378;
		
		// Calculate Earth Volume
		double earthVolumeInKm = (4/3)*pi*radius*radius*radius;
		double earthVolumeInMiles = earthVolumeInKm * 1.6;
		
		System.out.println("The volume of earth in cubic kilometers is " +earthVolumeInKm +" and cubic miles is " +earthVolumeInMiles);
	}
}
	