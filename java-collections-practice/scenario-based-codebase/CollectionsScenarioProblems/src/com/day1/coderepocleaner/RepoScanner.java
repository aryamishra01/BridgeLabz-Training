package com.day1.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class RepoScanner {

    public static List<Path> scanJavaFiles(String root) throws IOException {

        try (Stream<Path> paths = Files.walk(Paths.get(root))) {
            return paths
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());
        }
    }
}

