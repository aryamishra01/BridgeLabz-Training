package com.day2.examresultuploader;

import java.util.*;

public class ExamAnalyzer {

    // SUBJECT → LIST OF MARKS
    public static Map<String, List<Integer>>
    subjectWiseMarks(List<? extends ExamRecord<?>> list) {

        Map<String, List<Integer>> map = new HashMap<>();

        for (ExamRecord<?> r : list) {
            map.putIfAbsent(r.subject, new ArrayList<>());
            map.get(r.subject).add(r.marks);
        }
        return map;
    }

    // TOP SCORER PER SUBJECT
    public static void topScorers(Map<String, List<Integer>> map) {

        for (String sub : map.keySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(map.get(sub));

            System.out.println(sub + " → Top Marks: " + pq.peek());
        }
    }
}

