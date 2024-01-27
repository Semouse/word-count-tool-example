package com.github.semouse;

import java.io.File;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String flag = args[0];
        WordCountable counter = (args.length == 1) ? new InputWordCounter(parseInput()) :
                new FileProcessorWordCounter(new File(args[1]));
        switch (flag) {
            case "-c" -> System.out.println("Number of bytes is: " + counter.getNumberOfBytes());
            case "-l" -> System.out.println("Number of lines is: " + counter.getNumberOfLines());
            case "-w" -> System.out.println("Number of words is: " + counter.getNumberOFWords());
            case "-m" -> System.out.println("Number of characters is: " + counter.getNumberOfCharacters());
            default -> System.out.println("Unknown flag");
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
