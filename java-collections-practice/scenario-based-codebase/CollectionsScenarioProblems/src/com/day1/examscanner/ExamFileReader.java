package com.day1.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamFileReader {

    // Name,(A-D,)*A-D
    static Pattern validLine =
            Pattern.compile("^[A-Za-z ]+(,(A|B|C|D))+$");

    public static <T> Map<String, Integer> readFile(
            String path, char[] answerKey, T subject) {

        Map<String, Integer> scoreMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = br.readLine()) != null) {

                try {
                    if (!validLine.matcher(line).matches())
                        throw new Exception("Invalid format");

                    String[] parts = line.split(",");
                    String name = parts[0];

                    if (parts.length - 1 != answerKey.length)
                        throw new Exception("Answer count mismatch");

                    int score = 0;
                    for (int i = 1; i < parts.length; i++) {
                        if (parts[i].charAt(0) == answerKey[i - 1])
                            score++;
                    }

                    scoreMap.put(name, score);

                } catch (Exception e) {
                    System.out.println("Skipped line: " + line);
                }
            }

        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }

        return scoreMap;
    }
}

