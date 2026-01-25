package com.day11.avltree;

import java.util.ArrayList;
import java.util.List;

public class AvlLeaderboard {

	private PlayerNode root;

    int height(PlayerNode node) {
        if (node == null) return 0;
        return node.height;
    }

    int getBalance(PlayerNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    PlayerNode insert(PlayerNode node, String name, int score) {

        if (node == null) return new PlayerNode(name, score);

        if (score < node.score)
            node.left = insert(node.left, name, score);
        else if (score > node.score)
            node.right = insert(node.right, name, score);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    PlayerNode minValueNode(PlayerNode node) {
        PlayerNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    PlayerNode delete(PlayerNode root, int score) {

        if (root == null) return root;

        if (score < root.score)
            root.left = delete(root.left, score);
        else if (score > root.score)
            root.right = delete(root.right, score);
        else {

            if ((root.left == null) || (root.right == null)) {
                PlayerNode temp;
                if (root.left != null)
                    temp = root.left;
                else
                    temp = root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                PlayerNode temp = minValueNode(root.right);
                root.score = temp.score;
                root.name = temp.name;
                root.right = delete(root.right, temp.score);
            }
        }

        if (root == null) return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    void insertPlayer(String name, int score) {
        root = insert(root, name, score);
        System.out.println("Player added or updated");
    }

    void removePlayer(int score) {
        root = delete(root, score);
        System.out.println("Player removed if existed");
    }

    void displayTopPlayers() {
        List<PlayerNode> list = new ArrayList<>();
        reverseInorder(root, list);
        int count = Math.min(10, list.size());

        if (count == 0) {
            System.out.println("No players in leaderboard");
            return;
        }

        System.out.println("Top Players");
        for (int i = 0; i < count; i++) {
            PlayerNode p = list.get(i);
            System.out.println((i + 1) + " " + p.name + " " + p.score);
        }
    }

    void reverseInorder(PlayerNode node, List<PlayerNode> list) {
        if (node == null) return;
        reverseInorder(node.right, list);
        list.add(node);
        reverseInorder(node.left, list);
    }
}


