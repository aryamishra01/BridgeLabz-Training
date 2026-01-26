package com.day2.examresultuploader;

class ExamRecord<T> {
    String rollNo;
    String name;
    String subject;
    int marks;
    T examType;

    public ExamRecord(String r, String n, String s, int m, T type) {
        rollNo = r;
        name = n;
        subject = s;
        marks = m;
        examType = type;
    }
}

