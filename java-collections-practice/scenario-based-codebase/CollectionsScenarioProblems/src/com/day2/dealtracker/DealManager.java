package com.day2.dealtracker;

import java.util.*;

public class DealManager {

    Map<String, Deal<?>> dealMap = new HashMap<>();
    Set<String> codes = new HashSet<>();

    public void addDeals(List<? extends Deal<?>> list) {

        for (Deal<?> d : list) {
            if (codes.add(d.code)) {
                dealMap.put(d.code, d);
            }
        }
        System.out.println("Active Deals Stored: " + dealMap.size());
    }

    public void showAll() {
        dealMap.values().forEach(System.out::println);
    }

    public void sortByDiscount() {

        List<Deal<?>> list = new ArrayList<>(dealMap.values());

        list.sort((a, b) -> b.discount - a.discount);

        System.out.println("---- Sorted By Discount ----");
        list.forEach(System.out::println);
    }
}

