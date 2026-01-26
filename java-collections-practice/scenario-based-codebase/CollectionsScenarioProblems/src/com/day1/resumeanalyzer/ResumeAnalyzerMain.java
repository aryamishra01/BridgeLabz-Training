package com.day1.resumeanalyzer;

import java.util.*;

public class ResumeAnalyzerMain{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ResumeService service = new ResumeService();

        while (true) {
            System.out.println("\n===== Resume Analyzer Menu =====");
            System.out.println("1. Read resumes from folder");
            System.out.println("2. Display all candidates");
            System.out.println("3. Display sorted by keyword match");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter folder path (e.g. resumes): ");
                    String path = sc.nextLine();
                    service.readResumesFromFolder(path);
                    break;

                case 2:
                    service.displayAll();
                    break;

                case 3:
                    service.sortByKeywordCount();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

