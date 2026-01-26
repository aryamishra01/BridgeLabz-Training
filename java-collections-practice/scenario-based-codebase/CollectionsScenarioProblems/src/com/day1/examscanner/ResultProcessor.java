package com.day1.examscanner;

import java.util.*;

public class ResultProcessor {

    public static <T> PriorityQueue<AnswerSheet<T>> rankStudents(
            Map<String, Integer> map, T subject) {

        PriorityQueue<AnswerSheet<T>> pq =
                new PriorityQueue<>((a, b) -> b.score - a.score);

        for (String name : map.keySet()) {
            pq.add(new AnswerSheet<>(name, subject, map.get(name)));
        }

        return pq;
    }

    public static <T> void displayRankList(PriorityQueue<AnswerSheet<T>> pq) {

        int rank = 1;
        while (!pq.isEmpty()) {
            System.out.println("Rank " + rank + " → " + pq.poll());
            rank++;
        }
    }
}

