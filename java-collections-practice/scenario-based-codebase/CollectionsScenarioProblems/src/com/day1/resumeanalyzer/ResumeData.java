package com.day1.resumeanalyzer;

public class ResumeData {

	String email;
    String phone;
    int keywordCount;
    String fileName;

    public ResumeData(String email, String phone, int keywordCount, String fileName) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "File: " + fileName +
               ", Email: " + email +
               ", Phone: " + phone +
               ", Keyword Matches: " + keywordCount;
    }
}
