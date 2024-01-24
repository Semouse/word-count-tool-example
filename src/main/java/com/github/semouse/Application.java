package com.github.semouse;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        String flag = args[0];
        File file = new File(args[1]);
        FileProcessor processor = new FileProcessor(file);
        switch (flag) {
            case "-c" ->
                    System.out.println("Number of bytes is: " + (file.exists() ? processor.getNumberOfBytes() : 0));
            case "-l" ->
                    System.out.println("Number of lines is: " + (file.exists() ? processor.getNumberOfLines() : 0));
            case "-w" ->
                    System.out.println("Number of words is: " + (file.exists() ? processor.getNumberOFWords() : 0));
            default -> System.out.println("Unknown flag");
        }
    }
}
