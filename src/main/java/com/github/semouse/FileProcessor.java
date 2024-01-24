package com.github.semouse;

import java.io.*;

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

    public int getNumberOFWords() {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(!"".equals(line)) {
                    String[] words = line.split("\\s+");
                    count += words.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}
