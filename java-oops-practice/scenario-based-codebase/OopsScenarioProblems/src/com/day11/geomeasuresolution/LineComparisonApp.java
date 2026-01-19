package com.day11.geomeasuresolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineComparisonApp {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> results = new ArrayList<>();

        System.out.println("Welcome to GeoMeasure Line Comparison System");

        boolean continueCheck = true;

        while (continueCheck) {

            System.out.println("Enter coordinates for first line");

            System.out.print("Enter x1: ");
            double x1 = sc.nextDouble();

            System.out.print("Enter y1: ");
            double y1 = sc.nextDouble();

            System.out.print("Enter x2: ");
            double x2 = sc.nextDouble();

            System.out.print("Enter y2: ");
            double y2 = sc.nextDouble();

            Line line1 = new Line(x1, y1, x2, y2);

            System.out.println("Enter coordinates for second line");

            System.out.print("Enter x1: ");
            double a1 = sc.nextDouble();

            System.out.print("Enter y1: ");
            double b1 = sc.nextDouble();

            System.out.print("Enter x2: ");
            double a2 = sc.nextDouble();

            System.out.print("Enter y2: ");
            double b2 = sc.nextDouble();

            Line line2 = new Line(a1, b1, a2, b2);

            double length1 = line1.calculateLength();
            double length2 = line2.calculateLength();

            System.out.println("Length of first line is " + length1);
            System.out.println("Length of second line is " + length2);

            String result;

            if (length1 == length2) {
                result = "Both lines are equal in length";
            } else if (length1 > length2) {
                result = "First line is longer than second line";
            } else {
                result = "Second line is longer than first line";
            }

            System.out.println(result);
            results.add(result);

            System.out.print("Do you want to compare more lines? Enter yes or no: ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueCheck = false;
            }
        }

        System.out.println("Summary of all comparisons");

        for (int i = 0; i < results.size(); i++) {
            System.out.println("Comparison " + (i + 1) + ": " + results.get(i));
        }

        sc.close();
    }
}
