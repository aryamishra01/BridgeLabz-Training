package com.day11.avltreee2;

public class Event {

	private EventNode root;

    EventNode insert(EventNode node, int time, String name) {

        if (node == null)
            return new EventNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else if (time > node.time)
            node.right = insert(node.right, time, name);
        else
            System.out.println("Event already exists at this time");

        return node;
    }

    EventNode minValueNode(EventNode node) {
        EventNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    EventNode delete(EventNode node, int time) {

        if (node == null)
            return null;

        if (time < node.time)
            node.left = delete(node.left, time);
        else if (time > node.time)
            node.right = delete(node.right, time);
        else {

            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            EventNode temp = minValueNode(node.right);
            node.time = temp.time;
            node.name = temp.name;
            node.right = delete(node.right, temp.time);
        }
        return node;
    }

    void inorder(EventNode node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.println("Time: " + node.time + " Event: " + node.name);
        inorder(node.right);
    }

    void addEvent(int time, String name) {
        root = insert(root, time, name);
        System.out.println("Event added");
    }

    void cancelEvent(int time) {
        root = delete(root, time);
        System.out.println("Event cancelled if existed");
    }

    void showEvents() {
        if (root == null) {
            System.out.println("No upcoming events");
            return;
        }
        System.out.println("Upcoming Events in Order");
        inorder(root);
    }
}
