package com.day2.songvalut;

import java.util.*;

public class SongVaultMain{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Song> library = new ArrayList<>();

        while (true) {

            System.out.println("\n===== SongVault Menu =====");
            System.out.println("1. Load Songs from Folder");
            System.out.println("2. Show All Songs");
            System.out.println("3. Group Songs by Genre");
            System.out.println("4. Show Unique Artists");
            System.out.println("5. Filter by Artist");
            System.out.println("6. Sort by Title");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter folder path: ");
                    String path = sc.nextLine();
                    library = SongFileReader.readFolder(path);
                    break;

                case 2:
                    library.forEach(System.out::println);
                    break;

                case 3:
                    Map<String, List<Song>> map =
                            SongAnalyzer.groupByGenre(library);

                    for (String g : map.keySet()) {
                        System.out.println("\nGenre: " + g);
                        map.get(g).forEach(System.out::println);
                    }
                    break;

                case 4:
                    Set<String> artists =
                            SongAnalyzer.uniqueArtists(library);
                    artists.forEach(System.out::println);
                    break;

                case 5:
                    System.out.print("Enter artist name: ");
                    String a = sc.nextLine();
                    SongAnalyzer.filterByArtist(library, a);
                    break;

                case 6:
                    SongAnalyzer.sortByTitle(library);
                    break;

                case 7:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

