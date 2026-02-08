package com.threadstatemonitoring;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

class StateMonitor extends Thread {

    private Thread[] threads;

    // To track number of state changes
    private Map<String, Integer> stateCount = new HashMap<>();

    StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    public void run() {
        boolean allTerminated = false;

        while (!allTerminated) {

            allTerminated = true; // assume finished unless found otherwise

            for (Thread t : threads) {

                Thread.State state = t.getState();

                // Print thread state with timestamp
                System.out.println("[Monitor] " +
                        t.getName() +
                        " is in " + state +
                        " state at " +
                        LocalTime.now());

                // Count observed states
                stateCount.put(t.getName(),
                        stateCount.getOrDefault(t.getName(), 0) + 1);

                // If any thread not terminated, keep monitoring
                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                // Monitor checks every 500 ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Monitor interrupted");
            }
        }

        // Summary after all threads finish
        System.out.println("\nSummary of state observations:");
        for (String name : stateCount.keySet()) {
            System.out.println(name + " state observed "
                    + stateCount.get(name) + " times");
        }
    }
}

