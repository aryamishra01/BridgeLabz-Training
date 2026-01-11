package com.day1.browserbuddy;

import java.util.Stack;

class BrowserTab {

    private HistoryNode current;
    private Stack<HistoryNode> closedTabs;

    public BrowserTab() {
        closedTabs = new Stack<>();
    }

    // Visit a new page
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;

        System.out.println("Visiting: " + url);
    }

    // Go back
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    // Go forward
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No forward page");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    // Close current tab
    public void closeTab() {
        if (current == null) {
            System.out.println("No tab to close");
            return;
        }

        closedTabs.push(current);
        System.out.println("Tab closed: " + current.url);
        current = null;
    }

    // Restore closed tab
    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore");
            return;
        }

        current = closedTabs.pop();
        System.out.println("Restored tab: " + current.url);
    }

    // Display current page
    public void showCurrentPage() {
        if (current == null) {
            System.out.println("No active tab");
        } else {
            System.out.println("Current Page: " + current.url);
        }
    }
}

