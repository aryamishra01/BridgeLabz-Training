/*
School Bus Attendance System 
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.

*/

import java.util.Scanner;

public class SchoolBusAttendanceSystem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] names = new String[10];
        String[] attendanceRecord = new String[10];

        // Step 1: Enter student names
        for (int i = 0; i < names.length; i++)
        {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = input.next();
        }

        System.out.println("\nPlease say Present or Absent on name calls");

        int index = 0;

        // Step 2: for-each loop on names
        for (String name : names)
        {
            System.out.print("Call for " + name + ": ");
            attendanceRecord[index] = input.next().toLowerCase();

            // validation loop
            while (!(attendanceRecord[index].equals("present") ||
                     attendanceRecord[index].equals("absent")))
            {
                System.out.print("Invalid input! Enter Present or Absent again: ");
                attendanceRecord[index] = input.next().toLowerCase();
            }

            index++;
        }

        int present = 0;
        int absent = 0;

        // Step 3: count present / absent
        for (String status : attendanceRecord)
        {
            if (status.equals("present"))
                present++;
            else
                absent++;
        }

        // Output
        System.out.println("\nTotal Present: " + present);
        System.out.println("Total Absent: " + absent);

        input.close();
    }
}
