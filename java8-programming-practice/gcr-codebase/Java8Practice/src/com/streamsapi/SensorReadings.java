package com.streamsapi;

import java.util.*;

public class SensorReadings {
	
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(45, 78, 62, 90, 30);
        int threshold = 60;

        readings.stream()
                .filter(value -> value > threshold)         // filter readings above threshold
                .forEach(value ->							// print each valid reading
                    System.out.println("High Reading: " + value)
                );
    }
}

