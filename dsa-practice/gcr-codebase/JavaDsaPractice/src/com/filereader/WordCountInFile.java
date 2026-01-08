package com.filereader;

import java.io.*;
import java.util.Scanner;

public class WordCountInFile {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take file path
        System.out.println("Enter file path:");
        String filePath = sc.nextLine();

        // Take word to search
        System.out.println("Enter word to count:");
        String word = sc.nextLine();

        int count = 0;

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("Occurrences of \"" + word + "\": " + count);
        sc.close();
    }
}

