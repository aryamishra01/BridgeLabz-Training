package com.linkedlist.doublylinkedlist.texteditor;

//This class manages undo and redo using a doubly linked list
public class TextEditorHistory {

	 private TextStateNode head;
	 private TextStateNode tail;
	 private TextStateNode current;
	
	 private int size;
	 private final int MAX_SIZE = 10;
	
	 // Constructor
	 public TextEditorHistory() {
	     head = null;
	     tail = null;
	     current = null;
	     size = 0;
	 }
	
	 // Add new text state
	 public void addState(String text) {
	
	     TextStateNode newNode = new TextStateNode(text);
	
	     // If starting first time
	     if (head == null) {
	         head = tail = current = newNode;
	         size = 1;
	         return;
	     }
	
	     // Remove redo history
	     if (current.next != null) {
	         current.next.prev = null;
	         current.next = null;
	         tail = current;
	     }
	
	     // Add at end
	     tail.next = newNode;
	     newNode.prev = tail;
	     tail = newNode;
	     current = newNode;
	     size++;
	
	     // Limit history size
	     if (size > MAX_SIZE) {
	         head = head.next;
	         head.prev = null;
	         size--;
	     }
	 }
	
	 // Undo operation
	 public void undo() {
	
	     if (current == null || current.prev == null) {
	         System.out.println("Nothing to undo");
	         return;
	     }
	
	     current = current.prev;
	     System.out.println("Undo performed");
	 }
	
	 // Redo operation
	 public void redo() {
	
	     if (current == null || current.next == null) {
	         System.out.println("Nothing to redo");
	         return;
	     }
	
	     current = current.next;
	     System.out.println("Redo performed");
	 }
	
	 // Display current text state
	 public void displayCurrentState() {
	
	     if (current == null) {
	         System.out.println("Text editor is empty");
	     } else {
	         System.out.println("Current Text:");
	         System.out.println(current.content);
	     }
	 }
}

