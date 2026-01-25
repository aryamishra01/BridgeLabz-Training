package com.day11.avltree3;

public class PatientNode {

	int time;
    String name;
    int height;
    PatientNode left, right;

    PatientNode(int time, String name) {
        this.time = time;
        this.name = name;
        height = 1;
    }
}
