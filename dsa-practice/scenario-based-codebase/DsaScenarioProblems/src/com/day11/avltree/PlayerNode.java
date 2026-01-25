package com.day11.avltree;

public class PlayerNode {

	String name;
    int score;
    int height;
    PlayerNode left, right;

    PlayerNode(String name, int score) {
        this.name = name;
        this.score = score;
        height = 1;
    }
}
