package com.day1.examscanner;

import java.util.*;

public class ExamScannerMain {

    static char[] MATH_KEY = {'A','B','C','D','A','B','C'};
    static char[] SCI_KEY  = {'B','C','A','D','A','C','B'};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== ExamScanner Menu =====");
            System.out.println("1. Scan Math Answer Sheets");
            System.out.println("2. Scan Science Answer Sheets");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter CSV file path: ");
                    String mPath = sc.nextLine();

                    Map<String, Integer> mathScores =
                            ExamFileReader.readFile(
                                    mPath, MATH_KEY, new MathAnswerSheet());

                    PriorityQueue<AnswerSheet<MathAnswerSheet>> mpq =
                            ResultProcessor.rankStudents(
                                    mathScores, new MathAnswerSheet());

                    ResultProcessor.displayRankList(mpq);
                    break;

                case 2:
                    System.out.print("Enter CSV file path: ");
                    String sPath = sc.nextLine();

                    Map<String, Integer> sciScores =
                            ExamFileReader.readFile(
                                    sPath, SCI_KEY, new ScienceAnswerSheet());

                    PriorityQueue<AnswerSheet<ScienceAnswerSheet>> spq =
                            ResultProcessor.rankStudents(
                                    sciScores, new ScienceAnswerSheet());

                    ResultProcessor.displayRankList(spq);
                    break;

                case 3:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
