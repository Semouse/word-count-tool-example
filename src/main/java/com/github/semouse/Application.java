package com.github.semouse;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        String flag = args[0];
        FileProcessor fileProcessor = new FileProcessor(new File(args[1]));
        switch (flag) {
            case "-c" -> System.out.println("Number of bytes: " + fileProcessor.getNumberOfBytes());
            default -> System.out.println("Unknown flag");
        }
    }
}
