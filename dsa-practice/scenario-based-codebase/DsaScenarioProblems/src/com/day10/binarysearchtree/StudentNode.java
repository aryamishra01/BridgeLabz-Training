package com.day10.binarysearchtree;

public class StudentNode {

	int roll;
	String name;
	String dept;
	StudentNode left, right;
	
	public StudentNode(int roll, String name, String dept) {
        this.roll = roll;
        this.name = name;
        this.dept = dept;
        left = right = null;
    }
}
