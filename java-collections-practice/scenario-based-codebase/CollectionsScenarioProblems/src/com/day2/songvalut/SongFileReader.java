package com.day2.songvalut;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SongFileReader {

    static Pattern titleP = Pattern.compile("Title:\\s*(.*)");
    static Pattern artistP = Pattern.compile("Artist:\\s*(.*)");
    static Pattern durationP = Pattern.compile("Duration:\\s*(.*)");
    static Pattern genreP = Pattern.compile("Genre:\\s*(.*)");

    public static List<Song> readFolder(String path) {

        List<Song> songs = new ArrayList<>();
        File folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path");
            return songs;
        }

        File[] files = folder.listFiles((d, name) -> name.endsWith(".txt"));

        for (File f : files) {

            try (BufferedReader br = new BufferedReader(new FileReader(f))) {

                String line;
                String title = null, artist = null, duration = null, genre = null;

                while ((line = br.readLine()) != null) {

                    Matcher m;

                    m = titleP.matcher(line);
                    if (m.matches()) title = m.group(1);

                    m = artistP.matcher(line);
                    if (m.matches()) artist = m.group(1);

                    m = durationP.matcher(line);
                    if (m.matches()) duration = m.group(1);

                    m = genreP.matcher(line);
                    if (m.matches()) genre = m.group(1);
                }

                if (title == null || artist == null || duration == null || genre == null)
                    throw new Exception("Missing fields");

                songs.add(new Song(title, artist, duration, genre));

            } catch (Exception e) {
                System.out.println("Skipped file: " + f.getName());
            }
        }

        System.out.println("Songs loaded: " + songs.size());
        return songs;
    }
}

