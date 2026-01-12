package com.day2.texteditor;

import java.util.Stack;

class TextEditor {

    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert text
    public void insert(String text) {
        String newText = text + "\n";   // force next line
        content += newText;
        undoStack.push(new Action("INSERT", newText));
        redoStack.clear();
        System.out.println("Inserted text!");
    }


    // Delete last n characters
    public void delete(int length) {
        if (length > content.length()) {
            System.out.println("Cannot delete more characters than exist");
            return;
        }

        String removed = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);

        undoStack.push(new Action("DELETE", removed));
        redoStack.clear();
        System.out.println("Deleted text");
    }

    // Undo last action
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("INSERT")) {
            content = content.substring(0, content.length() - action.text.length());
            redoStack.push(action);
        } else if (action.type.equals("DELETE")) {
            content += action.text;
            redoStack.push(action);
        }

        System.out.println("Undo performed");
    }

    // Redo last undone action
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            content += action.text;
        } else if (action.type.equals("DELETE")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    // Display content
    public void display() {
        System.out.println("\nCurrent Text:");
        System.out.println(content);
    }
}

