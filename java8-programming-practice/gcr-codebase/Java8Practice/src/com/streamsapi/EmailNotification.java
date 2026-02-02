package com.streamsapi;

import java.util.*;

public class EmailNotification {

    // Simulated email sending method
    static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
            "user1@gmail.com",
            "user2@gmail.com",
            "user3@gmail.com"
        );

        // forEach calls email method for each user
        emails.forEach(email -> sendEmailNotification(email));
    }
}

