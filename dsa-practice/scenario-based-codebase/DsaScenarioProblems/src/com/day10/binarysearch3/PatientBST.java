package com.day10.binarysearch3;

//-------- BST Operations --------
public class PatientBST {
	
	 private PatientNode root;
	
	 // -------- INSERT / REGISTER --------
	 public void register(int id, String name, String problem) {
	     root = insertRec(root, id, name, problem);
	     System.out.println("Patient registered successfully!");
	 }
	
	 private PatientNode insertRec(PatientNode root, int id, String name, String problem) {
	     if (root == null)
	         return new PatientNode(id, name, problem);
	
	     if (id < root.arrivalId)
	         root.left = insertRec(root.left, id, name, problem);
	     else
	         root.right = insertRec(root.right, id, name, problem);
	
	     return root;
	 }
	
	 // -------- SEARCH --------
	 public PatientNode search(int id) {
	     return searchRec(root, id);
	 }
	
	 private PatientNode searchRec(PatientNode root, int id) {
	     if (root == null || root.arrivalId == id)
	         return root;
	
	     if (id < root.arrivalId)
	         return searchRec(root.left, id);
	
	     return searchRec(root.right, id);
	 }
	
	 // -------- DELETE / DISCHARGE --------
	 public void discharge(int id) {
	     root = deleteRec(root, id);
	     System.out.println("If patient existed, record removed.");
	 }
	
	 private PatientNode deleteRec(PatientNode root, int id) {
	     if (root == null)
	         return null;
	
	     if (id < root.arrivalId)
	         root.left = deleteRec(root.left, id);
	     else if (id > root.arrivalId)
	         root.right = deleteRec(root.right, id);
	     else {
	         // Case 1 & 2
	         if (root.left == null)
	             return root.right;
	         else if (root.right == null)
	             return root.left;
	
	         // Case 3: Two children
	         PatientNode successor = minValue(root.right);
	         root.arrivalId = successor.arrivalId;
	         root.name = successor.name;
	         root.problem = successor.problem;
	
	         root.right = deleteRec(root.right, successor.arrivalId);
	     }
	     return root;
	 }
	
	 private PatientNode minValue(PatientNode node) {
	     PatientNode current = node;
	     while (current.left != null)
	         current = current.left;
	     return current;
	 }
	
	 // -------- DISPLAY BY ARRIVAL --------
	 public void displayAll() {
	     if (root == null) {
	         System.out.println("No patients in queue.");
	         return;
	     }
	     System.out.println("\nPatients by Arrival Time:");
	     inorder(root);
	 }
	
	 private void inorder(PatientNode root) {
	     if (root != null) {
	         inorder(root.left);
	         System.out.println("ID: " + root.arrivalId +
	                 " | Name: " + root.name +
	                 " | Problem: " + root.problem);
	         inorder(root.right);
	     }
	 }
}

