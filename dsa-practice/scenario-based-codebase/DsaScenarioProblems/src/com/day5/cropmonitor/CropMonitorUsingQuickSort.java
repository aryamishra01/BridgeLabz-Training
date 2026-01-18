package com.day5.cropmonitor;

import java.util.Scanner;

public class CropMonitorUsingQuickSort {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        SensorData[] readings = new SensorData[n];

        System.out.println("\nEnter sensor data (timestamp and temperature):");

        for (int i = 0; i < n; i++) {
            System.out.print("Timestamp for reading " + (i + 1) + ": ");
            long time = sc.nextLong();

            System.out.print("Temperature: ");
            double temp = sc.nextDouble();

            readings[i] = new SensorData(time, temp);
        }

        System.out.println("\nUnordered Sensor Data:");
        printData(readings);

        CropMonitor.quickSort(readings, 0, n - 1);

        System.out.println("\nSensor Data Sorted by Timestamp:");
        printData(readings);

        sc.close();
    }

    static void printData(SensorData[] data) {
        for (SensorData d : data) {
            System.out.println(d);
        }
    }
}
