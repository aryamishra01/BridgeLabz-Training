package com.day1.coderepocleaner;

import java.io.File;
import java.util.*;
import java.util.stream.*;

public class RepoFilters {

    public static void filterBySize(List<File> files, long minKB) {

        files.stream()
                .filter(f -> f.length() > minKB * 1024)
                .forEach(f -> System.out.println(f.getName() +
                        " : " + (f.length() / 1024) + " KB"));
    }

    public static void filterByDate(List<File> files, long afterMillis) {

        files.stream()
                .filter(f -> f.lastModified() > afterMillis)
                .forEach(f -> System.out.println(f.getName()));
    }
}

