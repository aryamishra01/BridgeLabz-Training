package com.day11.geomeasuresolution;

public class Line {

	private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Constructor to initialize line coordinates
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length of the line
    public double calculateLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
