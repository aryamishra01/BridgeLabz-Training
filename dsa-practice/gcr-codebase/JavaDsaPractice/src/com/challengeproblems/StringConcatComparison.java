package com.challengeproblems;

public class StringConcatComparison {

    public static void main(String[] args) {

        int times = 1_000_000;
        String word = "hello";

        // Using StringBuilder
        long startSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(word);
        }

        long endSB = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endSB - startSB) + " ms");

        // Using StringBuffer
        long startSBF = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sbf.append(word);
        }

        long endSBF = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endSBF - startSBF) + " ms");
    }
}

