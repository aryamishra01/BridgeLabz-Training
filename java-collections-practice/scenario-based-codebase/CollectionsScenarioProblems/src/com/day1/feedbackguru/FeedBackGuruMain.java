package com.day1.feedbackguru;

import java.util.*;

public class FeedBackGuruMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Feedback<String>> feedbackList = new ArrayList<>();

        while (true) {

            System.out.println("\n===== FeedbackGuru Menu =====");
            System.out.println("1. Load Service Feedback");
            System.out.println("2. Load Product Feedback");
            System.out.println("3. Group by Sentiment");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter folder path: ");
                    String sPath = sc.nextLine();
                    feedbackList.addAll(
                            FeedbackReader.readFolder(sPath, "Service"));
                    break;

                case 2:
                    System.out.print("Enter folder path: ");
                    String pPath = sc.nextLine();
                    feedbackList.addAll(
                            FeedbackReader.readFolder(pPath, "Product"));
                    break;

                case 3:
                    Map<String, List<Feedback<String>>> map =
                            FeedbackAnalyzer.groupBySentiment(feedbackList);
                    FeedbackAnalyzer.displayGrouped(map);
                    break;

                case 4:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

