package com.day1.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeAnalyzer {

    // bad method name: starts with capital or underscore
    static Pattern badMethod =
            Pattern.compile("\\b(public|private|protected)\\s+\\w+\\s+([A-Z_][a-zA-Z0-9_]*)\\s*\\(");

    static Pattern importPattern =
            Pattern.compile("^import\\s+([\\w\\.]+);", Pattern.MULTILINE);

    public static FileType analyze(Path path) throws IOException {

        String code = Files.readString(path);

        boolean badMethodFound = badMethod.matcher(code).find();

        Set<String> imports = new HashSet<>();
        Matcher im = importPattern.matcher(code);
        while (im.find()) imports.add(im.group(1));

        boolean unusedImport = false;
        for (String imp : imports) {
            String className = imp.substring(imp.lastIndexOf('.') + 1);
            if (!code.contains(className + " ")) {
                unusedImport = true;
                break;
            }
        }

        if (badMethodFound)
            return FileType.ERROR;
        else if (unusedImport)
            return FileType.WARNING;
        else
            return FileType.VALID;
    }
}

