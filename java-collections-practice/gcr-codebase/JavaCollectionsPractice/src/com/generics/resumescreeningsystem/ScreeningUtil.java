package com.generics.resumescreeningsystem;

import java.util.List;

public class ScreeningUtil {

    // Generic method for single resume screening
    public static <T extends JobRole> void screenResume(T role) {

        role.displayProfile();

        if (role.isEligible()) {
            System.out.println("Status: Shortlisted\n");
        } else {
            System.out.println("Status: Rejected\n");
        }
    }

    // Wildcard method for screening pipeline (mixed roles)
    public static void screenPipeline(List<? extends JobRole> candidates) {

        System.out.println("\n===== AI Screening Pipeline =====");

        for (JobRole role : candidates) {
            screenResume(role); // reuse generic method
        }
    }
}

