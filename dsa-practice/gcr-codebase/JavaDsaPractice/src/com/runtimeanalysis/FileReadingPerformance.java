package com.runtimeanalysis;

import java.io.*;
import java.util.Scanner;

class FileReadingPerformance {

    // Read file using FileReader (character stream)
    public static long readUsingFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        long start = System.nanoTime();
        while (fr.read() != -1) {
            // reading character by character
        }
        fr.close();
        return System.nanoTime() - start;
    }

    // Read file using InputStreamReader (byte stream + conversion)
    public static long readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        long start = System.nanoTime();
        while (isr.read() != -1) {
            // reading byte data as characters
        }
        isr.close();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read file path from user
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        try {
            long fileReaderTime = readUsingFileReader(filePath);
            System.out.println("FileReader Time (ms): " + fileReaderTime / 1_000_000.0);

            long inputStreamReaderTime = readUsingInputStreamReader(filePath);
            System.out.println("InputStreamReader Time (ms): " + inputStreamReaderTime / 1_000_000.0);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}

