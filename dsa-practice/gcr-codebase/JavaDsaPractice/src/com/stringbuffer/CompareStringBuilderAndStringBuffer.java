package com.stringbuffer;

public class CompareStringBuilderAndStringBuffer {

    public static void main(String[] args) {

        int n = 1000000;

        // StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }

        long end1 = System.nanoTime();

        // StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }

        long end2 = System.nanoTime();

        // Output
        System.out.println("StringBuffer time: " + (end1 - start1));
        System.out.println("StringBuilder time: " + (end2 - start2));
    }
}

