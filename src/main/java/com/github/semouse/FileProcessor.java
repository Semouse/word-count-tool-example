package com.github.semouse;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileProcessor {

    private final File file;

    public FileProcessor(File file) {
        this.file = file;
    }

    public long getNumberOfBytes() {
        return file.length();
    }

    public int getNumberOfLines() {
        int count = 0;
        try (LineNumberReader reader = new LineNumberReader(new FileReader(file))) {
            reader.skip(Integer.MAX_VALUE);
            count = reader.getLineNumber();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}
