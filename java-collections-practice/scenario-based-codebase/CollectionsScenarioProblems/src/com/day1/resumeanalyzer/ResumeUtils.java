package com.day1.resumeanalyzer;

import java.io.*;
import java.util.regex.*;

public class ResumeUtils {

    static Pattern emailPattern =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    static Pattern phonePattern =
            Pattern.compile("\\b[6-9][0-9]{9}\\b");

    static Pattern keywordPattern =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

    // Read full file
    public static String readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }
        br.close();
        return sb.toString();
    }

    public static String extractEmail(String text) {
        Matcher m = emailPattern.matcher(text);
        return m.find() ? m.group() : null;
    }

    public static String extractPhone(String text) {
        Matcher m = phonePattern.matcher(text);
        return m.find() ? m.group() : null;
    }

    public static int countKeywords(String text) {
        Matcher m = keywordPattern.matcher(text);
        int count = 0;
        while (m.find()) count++;
        return count;
    }
}
