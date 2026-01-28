package com.Junit.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final FileProcessor fileProcessor = new FileProcessor();
    private final String filename = "testfile.txt";

    // Clean up after each test
    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Path.of(filename));
    }

    // Test write and read
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello Arya, JUnit File Test!";

        fileProcessor.writeToFile(filename, content);
        String result = fileProcessor.readFromFile(filename);

        assertEquals(content, result);
    }

    // Test file exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(filename, "Test Data");

        boolean exists = Files.exists(Path.of(filename));

        assertTrue(exists);
    }

    // Test exception when file does not exist
    @Test
    void testReadFileNotFound() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("nofile.txt");
        });
    }
}

