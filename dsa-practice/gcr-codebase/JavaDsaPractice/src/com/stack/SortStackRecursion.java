package com.stack;

import java.util.*;

public class SortStackRecursion {

    static void sortedInsert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || x > stack.peek()) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        sortedInsert(stack, x);
        stack.push(temp);
    }

    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sortStack(stack);
            sortedInsert(stack, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        sortStack(stack);

        System.out.println("Sorted Stack (Top to Bottom):");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        sc.close();
    }
}

