package com.day5.cropmonitor;

public class SensorData {

	long timestamp;   // e.g., 1700001234
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Time: " + timestamp + " | Temp: " + temperature + "°C";
    }
}
