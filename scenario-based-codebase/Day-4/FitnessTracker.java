/* 
Sandeep’s Fitness Challenge Tracker 
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counts[] = new int[7];
        int totalPushup = 0;
        int activeDays = 0;
        int average = 0;

        // Count push-up for each day of week
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Enter pushups for day " + (i + 1));
            counts[i] = input.nextInt();
        }

        // Calculate total and average using for-each
        for (int i : counts) {

            if (i == 0) { // skip rest days
                continue;
            }

            totalPushup += i;
            activeDays++;
        }

        if (activeDays > 0) {
            average = totalPushup / activeDays;
        } else {
            average = 0;
        }

        System.out.println("Total Push-Ups : " + totalPushup);
        System.out.println("Average pushups per active day : " + average);
    }
}

