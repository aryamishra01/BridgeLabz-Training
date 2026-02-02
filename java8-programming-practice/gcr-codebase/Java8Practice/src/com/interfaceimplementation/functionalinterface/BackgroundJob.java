package com.interfaceimplementation.functionalinterface;

public class BackgroundJob {

    public static void main(String[] args) {

        // Runnable using lambda
        Runnable job = () -> System.out.println("Background job is running...");

        Thread t = new Thread(job);
        t.start();
    }
}

