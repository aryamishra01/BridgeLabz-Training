package com.day5.cinemahouse;

public class Movie {

	String name;
    int time; // time in minutes (e.g., 930 for 9:30 AM, 1830 for 6:30 PM)

    Movie(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " at " + formatTime(time);
    }

    private String formatTime(int t) {
        int hr = t / 100;
        int min = t % 100;
        return String.format("%02d:%02d", hr, min);
    }
}
