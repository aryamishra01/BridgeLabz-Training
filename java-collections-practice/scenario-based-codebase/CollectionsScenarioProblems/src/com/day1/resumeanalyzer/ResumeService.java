package com.day1.resumeanalyzer;

import java.io.*;
import java.util.*;

public class ResumeService {

    Map<String, ResumeData> resumeMap = new HashMap<>();
    List<ResumeData> sortedList = new ArrayList<>();

    // READ FOLDER
    public void readResumesFromFolder(String folderPath) {

        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path");
            return;
        }

        File[] files = folder.listFiles();

        for (File file : files) {
            try {
                if (!file.getName().endsWith(".txt")) {
                    throw new Exception("Invalid format");
                }

                String text = ResumeUtils.readFile(file);

                String email = ResumeUtils.extractEmail(text);
                String phone = ResumeUtils.extractPhone(text);

                if (email == null)
                    throw new Exception("Email not found");

                int keywordCount = ResumeUtils.countKeywords(text);

                ResumeData rd = new ResumeData(email, phone, keywordCount, file.getName());

                resumeMap.put(email, rd);
                sortedList.add(rd);

            } catch (Exception e) {
                System.out.println("Skipped: " + file.getName() +
                        " (" + e.getMessage() + ")");
            }
        }

        System.out.println("Resume processing completed");
    }

    // DISPLAY MAP
    public void displayAll() {
        if (resumeMap.isEmpty()) {
            System.out.println("No resumes processed yet.");
            return;
        }

        for (ResumeData r : resumeMap.values()) {
            System.out.println(r);
        }
    }

    // SORT BY KEYWORD MATCH
    public void sortByKeywordCount() {

        if (sortedList.isEmpty()) {
            System.out.println("No resumes to sort.");
            return;
        }

        sortedList.sort((a, b) -> b.keywordCount - a.keywordCount);

        System.out.println("Sorted by keyword match:");
        for (ResumeData r : sortedList) {
            System.out.println(r);
        }
    }
}

