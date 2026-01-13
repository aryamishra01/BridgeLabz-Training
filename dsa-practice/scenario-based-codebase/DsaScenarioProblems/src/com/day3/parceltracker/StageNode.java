package com.day3.parceltracker;

public class StageNode {

    String stageName;
    StageNode next;

    public StageNode(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}

