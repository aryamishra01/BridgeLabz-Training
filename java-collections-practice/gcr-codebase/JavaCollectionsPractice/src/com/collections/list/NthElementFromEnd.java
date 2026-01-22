package com.collections.list;

import java.util.*;

public class NthElementFromEnd {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you want to enter : ");
        int n = sc.nextInt();

        List<String> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Add element " + (i + 1));
            String element = sc.next();
            list.add(element);
        }

        System.out.println("Show list : " + list);

        System.out.println("Give nth element index from end : ");
        int idx = sc.nextInt();   // nth from end

        //Validation
        if (idx <= 0 || idx > list.size()) {
            System.out.println("Invalid N value!");
        } else {
            int targetIndex = list.size() - idx;
            String result = list.get(targetIndex);
            System.out.println("Nth element from end is: " + result);
        }

        sc.close();
    }
}
