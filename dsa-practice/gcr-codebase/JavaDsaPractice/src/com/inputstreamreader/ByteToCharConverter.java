package com.inputstreamreader;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ByteToCharConverter {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take file path
        System.out.println("Enter file path:");
        String filePath = sc.nextLine();

        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;

            // Read and print file content
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        sc.close();
    }
}

