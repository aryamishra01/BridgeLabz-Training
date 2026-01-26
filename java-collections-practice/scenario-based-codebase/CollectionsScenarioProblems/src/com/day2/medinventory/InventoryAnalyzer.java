package com.day2.medinventory;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class InventoryAnalyzer {

    static DateTimeFormatter fmt =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // EXPIRED ITEMS
    public static <T> void showExpired(Set<Item<T>> set) {

        System.out.println("\nExpired Items:");

        for (Item<T> i : set) {
            LocalDate exp = LocalDate.parse(i.expiry, fmt);
            if (exp.isBefore(LocalDate.now()))
                System.out.println(i);
        }
    }

    // GROUP BY NAME
    public static <T> Map<String, List<Item<T>>> groupByType(Set<Item<T>> set) {

        Map<String, List<Item<T>>> map = new HashMap<>();

        for (Item<T> i : set) {
            map.computeIfAbsent(i.name, k -> new ArrayList<>()).add(i);
        }

        return map;
    }

    // LOW STOCK CHECK
    public static <T> void checkLowStock(Set<Item<T>> set)
            throws LowStockException {

        for (Item<T> i : set) {
            if (i.quantity <= 5)
                throw new LowStockException(
                        "CRITICAL LOW: " + i.name + " Qty=" + i.quantity);
        }

        System.out.println("All items sufficiently stocked.");
    }
}
