package com.day10.binarysearch3;

public class PatientNode {

	int arrivalId;
    String name;
    String problem;
    PatientNode left, right;

    public PatientNode(int arrivalId, String name, String problem) {
        this.arrivalId = arrivalId;
        this.name = name;
        this.problem = problem;
        left = right = null;
    }
}
