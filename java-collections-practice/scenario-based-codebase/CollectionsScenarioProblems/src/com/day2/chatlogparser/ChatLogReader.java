package com.day2.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogReader {

    // [12:02 PM] John: message
    static Pattern pattern = Pattern.compile(
            "\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    public static TreeMap<String, List<String>> readLogs(
            String path, MessageFilter<String> filter) {

        TreeMap<String, List<String>> map = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = br.readLine()) != null) {

                try {
                    Matcher m = pattern.matcher(line);

                    if (!m.matches())
                        throw new Exception("Invalid format");

                    String time = m.group(1);
                    String user = m.group(2);
                    String msg = m.group(3);

                    if (!filter.allow(msg))
                        continue;

                    map.computeIfAbsent(user,
                            k -> new ArrayList<>())
                            .add(time + " → " + msg);

                } catch (Exception e) {
                    System.out.println("⚠ Skipped line: " + line);
                }
            }

        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }

        return map;
    }
}

