package com.day2.chatlogparser;

import java.util.*;

public class ChatLogParserMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MessageFilter<String> idleFilter = new IdleChatFilter();

        while (true) {

            System.out.println("\n===== ChatLogParser Menu =====");
            System.out.println("1. Analyze Chat Log File");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter chat log file path: ");
                    String path = sc.nextLine();

                    TreeMap<String, List<String>> result =
                            ChatLogReader.readLogs(path, idleFilter);

                    for (String user : result.keySet()) {
                        System.out.println("\nUser: " + user);
                        for (String msg : result.get(user))
                            System.out.println(msg);
                    }
                    break;

                case 2:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

