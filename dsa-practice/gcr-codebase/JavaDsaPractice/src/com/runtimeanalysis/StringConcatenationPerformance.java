package com.runtimeanalysis;

import java.util.Scanner;

class StringConcatenationPerformance {

    // Using String (creates new object on each concatenation)
    public static long useString(int n) {
        String s = "";
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            s = s + "a";
        }
        return System.nanoTime() - start;
    }

    // Using StringBuilder (mutable, faster)
    public static long useStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return System.nanoTime() - start;
    }

    // Using StringBuffer (thread-safe, slightly slower)
    public static long useStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of concatenation operations
        System.out.print("Enter number of concatenations: ");
        int n = sc.nextInt();

        // String test (skip for very large input)
        if (n <= 10000) {
            long stringTime = useString(n);
            System.out.println("String Time (ms): " + stringTime / 1_000_000.0);
        } else {
            System.out.println("String Time: Unusable for large input");
        }

        // StringBuilder test
        long sbTime = useStringBuilder(n);
        System.out.println("StringBuilder Time (ms): " + sbTime / 1_000_000.0);

        // StringBuffer test
        long sbufTime = useStringBuffer(n);
        System.out.println("StringBuffer Time (ms): " + sbufTime / 1_000_000.0);

        sc.close();
    }
}

