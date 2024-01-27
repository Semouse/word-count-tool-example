package com.github.semouse;

import java.io.*;

public class FileProcessorWordCounter implements WordCountable {

    private final File file;

    public FileProcessorWordCounter(File file) {
        this.file = file;
    }

    public long getNumberOfBytes() {
        return file.length();
    }

    public long getNumberOfLines() {
        long count = 0;
        try (LineNumberReader reader = new LineNumberReader(new FileReader(file))) {
            reader.skip(Integer.MAX_VALUE);
            count = reader.getLineNumber();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public long getNumberOFWords() {
        long count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isBlank()) {
                    String[] words = line.split("\\s+");
                    count += words.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public long getNumberOfCharacters() {
        long count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}
