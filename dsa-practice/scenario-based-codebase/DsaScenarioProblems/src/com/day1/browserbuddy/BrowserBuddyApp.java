package com.day1.browserbuddy;

import java.util.Scanner;

public class BrowserBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserTab tab = new BrowserTab();
        int choice;

        do {
            System.out.println("\n====== BrowserBuddy Menu ======");
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Restore Closed Tab");
            System.out.println("6. Show Current Page");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    tab.visit(url);
                    break;

                case 2:
                    tab.back();
                    break;

                case 3:
                    tab.forward();
                    break;

                case 4:
                    tab.closeTab();
                    break;

                case 5:
                    tab.restoreTab();
                    break;

                case 6:
                    tab.showCurrentPage();
                    break;

                case 7:
                    System.out.println("Exiting BrowserBuddy");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}

