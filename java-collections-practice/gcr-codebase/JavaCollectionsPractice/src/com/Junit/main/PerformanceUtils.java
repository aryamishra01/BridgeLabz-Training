package com.Junit.main;

public class PerformanceUtils {

    public String longRunningTask() {
        try {
            // Simulate long task (3 seconds)
        	Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Task Completed";
    }
}

