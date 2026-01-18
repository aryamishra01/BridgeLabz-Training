package com.day6.artexpo;

public class Artist {
    String name;
    int regTime; // time in HHMM format (e.g., 0930, 1420)

    Artist(String name, int regTime) {
        this.name = name;
        this.regTime = regTime;
    }

    @Override
    public String toString() {
        return name + " (Registered at " + formatTime(regTime) + ")";
    }

    private String formatTime(int t) {
        int hr = t / 100;
        int min = t % 100;
        return String.format("%02d:%02d", hr, min);
    }
}

