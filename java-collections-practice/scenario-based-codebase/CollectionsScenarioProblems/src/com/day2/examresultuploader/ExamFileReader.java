package com.day2.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamFileReader {

    static Pattern csvPattern =
            Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}");

    public static <T> List<ExamRecord<T>> readFile(String path, T examType)
            throws Exception {

        List<ExamRecord<T>> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {

            if (!csvPattern.matcher(line).matches())
                throw new InvalidFormatException("Invalid line: " + line);

            String[] arr = line.split(",");

            if (arr[3].isEmpty())
                throw new MissingMarksException("Missing marks: " + line);

            int marks = Integer.parseInt(arr[3]);

            list.add(new ExamRecord<>(
                    arr[0], arr[1], arr[2], marks, examType));
        }

        br.close();
        System.out.println("Records loaded: " + list.size());
        return list;
    }
}
