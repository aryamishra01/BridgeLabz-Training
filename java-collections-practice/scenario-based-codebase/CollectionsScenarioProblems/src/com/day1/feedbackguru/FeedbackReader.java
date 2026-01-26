package com.day1.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackReader {

    static Pattern ratingPattern = Pattern.compile("(\\d{1,2})/10");

    public static <T> List<Feedback<T>> readFolder(String path, T type) {

        List<Feedback<T>> list = new ArrayList<>();
        File folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path");
            return list;
        }

        File[] files = folder.listFiles((d, name) -> name.endsWith(".txt"));

        for (File file : files) {

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;

                while ((line = br.readLine()) != null) {

                    try {
                        Matcher m = ratingPattern.matcher(line);

                        if (!m.find())
                            throw new Exception("Rating missing");

                        int rating = Integer.parseInt(m.group(1));

                        list.add(new Feedback<>(type, line, rating));

                    } catch (Exception e) {
                        System.out.println("Skipped line: " + line);
                    }
                }

            } catch (Exception e) {
                System.out.println("Skipped file: " + file.getName());
            }
        }

        System.out.println("Feedback loaded: " + list.size());
        return list;
    }
}

