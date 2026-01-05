package com.hashmap;

import java.util.*;

class MyHashMap {
    private static class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 10;
    private Node[] table = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node curr = table[index];
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
    }

    public Integer get(int key) {
        int index = hash(key);
        Node curr = table[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return null;
    }
}

public class CustomHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashMap map = new MyHashMap();

        System.out.print("Enter number of key-value pairs: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key and value: ");
            map.put(sc.nextInt(), sc.nextInt());
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        System.out.println("Value: " + map.get(key));
        sc.close();
    }
}
