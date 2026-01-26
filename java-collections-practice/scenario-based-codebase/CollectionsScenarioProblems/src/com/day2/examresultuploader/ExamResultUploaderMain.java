package com.day2.examresultuploader;

import java.util.*;

public class ExamResultUploaderMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<ExamRecord<String>> records = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Exam Result Uploader =====");
            System.out.println("1. Upload CSV File");
            System.out.println("2. Show Subject-wise Marks");
            System.out.println("3. Show Top Scorer per Subject");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try {

                switch (ch) {

                    case 1:
                        System.out.print("Enter file path: ");
                        String path = sc.nextLine();

                        System.out.print("Enter Exam Type (MidTerm/Final/Internal): ");
                        String type = sc.nextLine();

                        records = ExamFileReader.readFile(path, type);
                        break;

                    case 2:
                        Map<String, List<Integer>> map =
                                ExamAnalyzer.subjectWiseMarks(records);

                        for (String s : map.keySet())
                            System.out.println(s + " → " + map.get(s));
                        break;

                    case 3:
                        Map<String, List<Integer>> map2 =
                                ExamAnalyzer.subjectWiseMarks(records);
                        ExamAnalyzer.topScorers(map2);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }
}

