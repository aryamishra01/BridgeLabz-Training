package com.day1.travellog;

import java.util.*;
import java.util.regex.*;

public class TravelAnalyzer {

    // Trips > 5 days
    public static void longTrips(List<Trip> trips) {
        System.out.println("Trips longer than 5 days:");
        for (Trip t : trips) {
            if (t.days > 5)
                System.out.println(t);
        }
    }

    // Unique countries using Set
    public static void uniqueCountries(List<Trip> trips) {
        Set<String> set = new HashSet<>();
        for (Trip t : trips)
            set.add(t.country);

        System.out.println("Unique countries visited:");
        for (String c : set)
            System.out.println(c);
    }

    // Cities using regex
    public static void findCitiesRegex(List<Trip> trips, String pattern) {

        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        System.out.println("Cities matching regex:");
        for (Trip t : trips) {
            Matcher m = p.matcher(t.city);
            if (m.find())
                System.out.println(t.city);
        }
    }

    // Top 3 cities
    public static void topCities(List<Trip> trips) {

        Map<String, Integer> map = new HashMap<>();

        for (Trip t : trips) {
            map.put(t.city, map.getOrDefault(t.city, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 3 most visited cities:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey() +
                    " → " + list.get(i).getValue() + " times");
        }
    }
}


