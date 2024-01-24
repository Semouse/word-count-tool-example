package com.github.semouse;

import java.io.File;

public class FileProcessor {

    private final File file;

    public FileProcessor(File file) {
        this.file = file;
    }

    public long getNumberOfBytes() {
        return file.length();
    }
}
