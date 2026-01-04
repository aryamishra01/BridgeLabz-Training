package com.linkedlist.doublylinkedlist.texteditor;

import java.util.Scanner;

//Main class to run Undo / Redo Text Editor
public class TextEditorApp {

	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	     TextEditorHistory editor = new TextEditorHistory();
	
	     int choice;
	
	     do {
	         System.out.println("\nText Editor Menu");
	         System.out.println("1. Add Text");
	         System.out.println("2. Undo");
	         System.out.println("3. Redo");
	         System.out.println("4. Display Current Text");
	         System.out.println("5. Exit");
	         System.out.print("Enter your choice: ");
	
	         choice = sc.nextInt();
	         sc.nextLine();
	
	         switch (choice) {
	
	             case 1:
	                 System.out.print("Enter text: ");
	                 String text = sc.nextLine();
	                 editor.addState(text);
	                 break;
	
	             case 2:
	                 editor.undo();
	                 break;
	
	             case 3:
	                 editor.redo();
	                 break;
	
	             case 4:
	                 editor.displayCurrentState();
	                 break;
	
	             case 5:
	                 System.out.println("Exiting Text Editor");
	                 break;
	
	             default:
	                 System.out.println("Invalid choice");
	         }
	
	     } while (choice != 5);
	
	     sc.close();
	 }
}

