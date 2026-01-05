package com.stack;

import java.util.*;

class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    void enqueue(int x) {
        stack1.push(x);
        System.out.println(x + " enqueued");
    }

    // Dequeue operation
    int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}

public class QueueUsingStacksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();

        while (true) {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    queue.enqueue(sc.nextInt());
                    break;
                case 2:
                    int val = queue.dequeue();
                    if (val != -1)
                        System.out.println("Dequeued: " + val);
                    break;
                case 3:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

