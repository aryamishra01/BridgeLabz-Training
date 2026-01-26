package com.day1.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class RepoOrganizer {

    public static Map<FileType, List<File>> organize(List<Path> files, String baseDir)
            throws Exception {

        Map<FileType, List<File>> map = new HashMap<>();
        for (FileType t : FileType.values())
            map.put(t, new ArrayList<>());

        for (Path p : files) {

            FileType type = CodeAnalyzer.analyze(p);
            map.get(type).add(p.toFile());

            Path targetDir = Paths.get(baseDir, type.name());
            Files.createDirectories(targetDir);

            Path targetFile = targetDir.resolve(p.getFileName());
            Files.copy(p, targetFile, StandardCopyOption.REPLACE_EXISTING);
        }

        return map;
    }
}

