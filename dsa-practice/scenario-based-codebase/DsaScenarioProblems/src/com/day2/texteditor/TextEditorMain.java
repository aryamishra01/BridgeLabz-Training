package com.day2.texteditor;

import java.util.Scanner;

public class TextEditorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        int choice;

        do {
            System.out.println("\n====== Text Editor Menu ======");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Display Content");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter text to insert: ");
                    String text = sc.nextLine();
                    editor.insert(text);
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int len = sc.nextInt();
                    editor.delete(len);
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.display();
                    break;

                case 6:
                    System.out.println("Exiting Text Editor");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}

