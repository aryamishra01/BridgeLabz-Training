package com.day1.feedbackguru;

import java.util.*;

class FeedbackAnalyzer {

    public static <T> Map<String, List<Feedback<T>>> groupBySentiment(List<Feedback<T>> list) {

        Map<String, List<Feedback<T>>> map = new HashMap<>();

        map.put("Positive", new ArrayList<>());
        map.put("Neutral", new ArrayList<>());
        map.put("Negative", new ArrayList<>());

        for (Feedback<T> f : list) {

            if (f.rating >= 8)
                map.get("Positive").add(f);
            else if (f.rating >= 5)
                map.get("Neutral").add(f);
            else
                map.get("Negative").add(f);
        }

        return map;
    }

    public static <T> void displayGrouped(Map<String, List<Feedback<T>>> map) {

        for (String key : map.keySet()) {
            System.out.println("\n--- " + key + " Feedback ---");
            for (Feedback<T> f : map.get(key))
                System.out.println(f);
        }
    }
}

