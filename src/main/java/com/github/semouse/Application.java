package com.github.semouse;

import java.io.File;
import java.util.Scanner;

public class Application {
    private static final String DEFAULT_FLAG = " ";

    public static void main(String[] args) {
        if (args.length == 0) {
            process(DEFAULT_FLAG, new InputWordCounter(parseInput()));
        } else {
            parseCommandLineArguments(args);
        }
    }

    private static void parseCommandLineArguments(String[] args) {
        if (args.length == 1) {
            if (args[0].startsWith("-")) {
                process(args[0], new InputWordCounter(parseInput()));
            } else {
                process(DEFAULT_FLAG, new FileProcessorWordCounter(new File(args[0])));
            }
        } else {
            process(args[0], new FileProcessorWordCounter(new File(args[1])));
        }
    }

    private static void process(String flag, WordCountable counter) {
        switch (flag) {
            case "-c" -> System.out.println("Number of bytes is: " + counter.getNumberOfBytes());
            case "-l" -> System.out.println("Number of lines is: " + counter.getNumberOfLines());
            case "-w" -> System.out.println("Number of words is: " + counter.getNumberOFWords());
            case "-m" -> System.out.println("Number of characters is: " + counter.getNumberOfCharacters());
            default -> {
                System.out.println("Number of bytes is: " + counter.getNumberOfBytes());
                System.out.println("Number of lines is: " + counter.getNumberOfLines());
                System.out.println("Number of words is: " + counter.getNumberOFWords());
            }
        }
    }

    private static String parseInput() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter text for counting, CTRL+Z or CTRL+D in order to end input.");
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
