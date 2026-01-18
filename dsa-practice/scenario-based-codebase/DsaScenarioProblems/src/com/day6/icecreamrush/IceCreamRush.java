package com.day6.icecreamrush;

public class IceCreamRush {

    // Bubble Sort by sales (ascending order)
    public static void bubbleSort(Flavor[] flavors) {

        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // compare adjacent flavors
                if (flavors[j].sales > flavors[j + 1].sales) {

                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;

                    swapped = true;
                }
            }

            // if no swaps, list already sorted
            if (!swapped)
                break;
        }
    }
}

