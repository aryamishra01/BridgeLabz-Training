package com.day10.binarysearchtree;

public class StudentBST {

	private StudentNode root;
	
	//insert
	public void insert(int roll, String name, String dept) {
		root = insertRecord(root,roll,name,dept);
		System.out.println("Student record inserted successfully");
	}
	
	private StudentNode insertRecord(StudentNode root, int roll, String name, String dept) {
		
		if(root == null) {
			return new StudentNode(roll, name, dept);
		}
		
		if(roll < root.roll) {
			root.left = insertRecord(root.left, roll, name, dept);
		}
		else if (roll > root.roll)
            root.right = insertRecord(root.right, roll, name, dept);
        else
            System.out.println("Roll number already exists!");

        return root;
	}
	
	//search
	public void search(int roll) {
        StudentNode result = searchRec(root, roll);
        if (result != null) {
            System.out.println("Student Found:");
            System.out.println("Roll: " + result.roll);
            System.out.println("Name: " + result.name);
            System.out.println("Dept: " + result.dept);
        } else {
            System.out.println("Student not found!");
        }
    }
	
	private StudentNode searchRec(StudentNode root, int roll) {
        if (root == null || root.roll == roll)
            return root;

        if (roll < root.roll)
            return searchRec(root.left, roll);

        return searchRec(root.right, roll);
    }
	
	// delete
    public void delete(int roll) {
        root = deleteRec(root, roll);
        System.out.println("✅ If record existed, it has been removed.");
    }
    
    private StudentNode deleteRec(StudentNode root, int roll) {
        if (root == null)
            return null;

        if (roll < root.roll)
            root.left = deleteRec(root.left, roll);
        else if (roll > root.roll)
            root.right = deleteRec(root.right, roll);
        else {
            // Case 1 & 2
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: Two children
            StudentNode successor = minValue(root.right);
            root.roll = successor.roll;
            root.name = successor.name;
            root.dept = successor.dept;

            root.right = deleteRec(root.right, successor.roll);
        }
        return root;
    }
    
    private StudentNode minValue(StudentNode node) {
        StudentNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }
    
    // display
    public void displayAll() {
        if (root == null) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\nStudent Records (Sorted by Roll No):");
        inorder(root);
    }
    
    private void inorder(StudentNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll: " + root.roll + " | Name: " + root.name + " | Dept: " + root.dept);
            inorder(root.right);
        }
    }
}
