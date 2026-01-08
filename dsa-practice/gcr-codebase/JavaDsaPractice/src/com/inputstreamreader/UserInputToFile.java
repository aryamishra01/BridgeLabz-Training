package com.inputstreamreader;

import java.io.*;

public class UserInputToFile {
    
	public static void main(String[] args) {
	    try {
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);

	        FileWriter fw = new FileWriter("output.txt", true);

	        System.out.println("Enter text (type 'exit' to stop):");
	        String line;

	        while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
	            fw.write(line + "\n");
	        }

	        fw.close();
	        br.close();
	        isr.close();
	    } catch (IOException e) {
	        System.out.println("Error occurred");
	    }
	}
}

