package com.day6.artexpo;

public class ArtExpo {

    // Insertion Sort by registration time
    public static void insertionSort(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) {

            Artist newArtist = artists[i];
            int j = i - 1;

            // shift later registrations to the right
            while (j >= 0 && artists[j].regTime > newArtist.regTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            // insert artist at correct position
            artists[j + 1] = newArtist;
        }
    }
}
