package com.day2.songvalut;

import java.util.*;
import java.util.stream.*;

public class SongAnalyzer {

    // GROUP BY GENRE
    public static Map<String, List<Song>> groupByGenre(List<Song> list) {

        return list.stream()
                .collect(Collectors.groupingBy(s -> s.genre));
    }

    // UNIQUE ARTISTS
    public static Set<String> uniqueArtists(List<Song> list) {

        return list.stream()
                .map(s -> s.artist)
                .collect(Collectors.toSet());
    }

    // FILTER BY ARTIST
    public static void filterByArtist(List<Song> list, String artist) {

        list.stream()
                .filter(s -> s.artist.equalsIgnoreCase(artist))
                .forEach(System.out::println);
    }

    // SORT BY TITLE
    public static void sortByTitle(List<Song> list) {

        list.stream()
                .sorted(Comparator.comparing(s -> s.title))
                .forEach(System.out::println);
    }
}

