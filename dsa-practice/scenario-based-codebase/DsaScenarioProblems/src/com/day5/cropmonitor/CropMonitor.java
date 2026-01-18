package com.day5.cropmonitor;

public class CropMonitor {

    public static void quickSort(SensorData[] data, int low, int high) {
        if (low < high) {
            int p = partition(data, low, high);

            quickSort(data, low, p - 1);
            quickSort(data, p + 1, high);
        }
    }

    // Partition based on timestamp
    private static int partition(SensorData[] data, int low, int high) {

        SensorData pivot = data[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp < pivot.timestamp) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);
        return i + 1;
    }

    private static void swap(SensorData[] data, int i, int j) {
        SensorData temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}

