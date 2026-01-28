package com.Junit.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {

    // Write content to file
    public void writeToFile(String filename, String content) throws IOException {
        Path path = Path.of(filename);
        Files.writeString(path, content);
    }

    // Read content from file
    public String readFromFile(String filename) throws IOException {
        Path path = Path.of(filename);
        return Files.readString(path);
    }
}

