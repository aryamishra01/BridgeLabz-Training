package com.Junit.main;

import java.util.List;

public class ListManager {

    // Add element to list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Remove element from list
    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element)); // remove by value, not index
    }

    // Get size of list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}

