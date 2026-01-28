package com.Junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.ListManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // Test adding elements
    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    // Test removing elements
    @Test
    void testRemoveElement() {
        list.add(5);
        list.add(15);
        list.add(25);

        boolean removed = listManager.removeElement(list, 15);

        assertTrue(removed);
        assertEquals(2, list.size());
        assertFalse(list.contains(15));
    }

    // Test removing element not present
    @Test
    void testRemoveElementNotPresent() {
        list.add(1);
        list.add(2);

        boolean removed = listManager.removeElement(list, 5);

        assertFalse(removed);
        assertEquals(2, list.size());
    }

    // Test list size
    @Test
    void testGetSize() {
        listManager.addElement(list, 100);
        listManager.addElement(list, 200);
        listManager.addElement(list, 300);

        int size = listManager.getSize(list);

        assertEquals(3, size);
    }
}
