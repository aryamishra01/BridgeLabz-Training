package com.day2.medinventory;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class InventoryReader {

    static Pattern datePattern =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    public static <T> Set<Item<T>> readCSV(String path, T category) {

        Set<Item<T>> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                try {
                    String[] p = line.split(",");

                    if (p.length != 4)
                        throw new Exception("Invalid columns");

                    if (!datePattern.matcher(p[3]).matches())
                        throw new Exception("Invalid date");

                    int qty = Integer.parseInt(p[2]);

                    set.add(new Item<>(p[0], p[1], qty, p[3], category));

                } catch (Exception e) {
                    System.out.println("Skipped line: " + line);
                }
            }

        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.println("Items loaded: " + set.size());
        return set;
    }
}

