package com.day5.cinemahouse;

public class CinemaHouse {

	// Bubble Sort by show time
    public static void bubbleSort(Movie[] shows) {

        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (shows[j].time > shows[j + 1].time) {

                    Movie temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping, already sorted
            if (!swapped) break;
        }
    }
}
