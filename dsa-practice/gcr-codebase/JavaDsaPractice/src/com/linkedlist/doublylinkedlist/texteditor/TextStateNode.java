package com.linkedlist.doublylinkedlist.texteditor;

//This class represents a single text state
public class TextStateNode {

	 String content;           // Text content at this state
	 TextStateNode prev;       // Pointer to previous state (undo)
	 TextStateNode next;       // Pointer to next state (redo)
	
	 // Constructor
	 public TextStateNode(String content) {
	     this.content = content;
	     this.prev = null;
	     this.next = null;
	 }
}

