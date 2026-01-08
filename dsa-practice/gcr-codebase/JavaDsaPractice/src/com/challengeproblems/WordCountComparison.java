package com.challengeproblems;

import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class WordCountComparison {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\ARYA\\OneDrive\\Desktop\\largefile.txt"; // 100MB text file

        // Using FileReader Approach
        long startFR = System.currentTimeMillis();

        FileReader fr = new FileReader(filePath);
        StringBuilder frContent = new StringBuilder();
        int ch;

        while ((ch = fr.read()) != -1) {
            frContent.append((char) ch);
        }
        fr.close();

        String[] frWords = frContent.toString().split("\\s+");
        long endFR = System.currentTimeMillis();

        System.out.println("FileReader Word Count: " + frWords.length);
        System.out.println("FileReader Time: " + (endFR - startFR) + " ms");

        // Using InputStreamReader Approach
        long startISR = System.currentTimeMillis();

        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath));
        StringBuilder isrContent = new StringBuilder();

        while ((ch = isr.read()) != -1) {
            isrContent.append((char) ch);
        }
        isr.close();

        String[] isrWords = isrContent.toString().split("\\s+");
        long endISR = System.currentTimeMillis();

        System.out.println("InputStreamReader Word Count: " + isrWords.length);
        System.out.println("InputStreamReader Time: " + (endISR - startISR) + " ms");
    }
}
