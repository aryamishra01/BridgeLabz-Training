package com.day1.coderepocleaner;

import java.nio.file.*;
import java.util.*;
import java.io.*;

public class CodeRepoCleanerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Path> javaFiles = new ArrayList<>();
        Map<FileType, List<File>> categorized = new HashMap<>();

        while (true) {

            System.out.println("\n===== CodeRepoCleaner Menu =====");
            System.out.println("1. Scan Java Files");
            System.out.println("2. Analyze & Organize Files");
            System.out.println("3. Show Category Counts");
            System.out.println("4. Filter by File Size");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {

                    case 1:
                        System.out.print("Enter root folder: ");
                        String root = sc.nextLine();
                        javaFiles = RepoScanner.scanJavaFiles(root);
                        System.out.println("Java files found: " + javaFiles.size());
                        break;

                    case 2:
                        System.out.print("Enter output folder: ");
                        String out = sc.nextLine();
                        categorized = RepoOrganizer.organize(javaFiles, out);
                        System.out.println("Files organized.");
                        break;

                    case 3:
                        for (FileType t : categorized.keySet()) {
                            System.out.println(t + " : " +
                                    categorized.get(t).size());
                        }
                        break;

                    case 4:
                        System.out.print("Min size in KB: ");
                        long kb = sc.nextLong();
                        sc.nextLine();
                        categorized.values().stream()
                                .flatMap(List::stream)
                                .toList();
                        List<File> all = new ArrayList<>();
                        categorized.values().forEach(all::addAll);
                        RepoFilters.filterBySize(all, kb);
                        break;

                    case 5:
                        System.out.println("Bye!");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

