package src.main.java.com.github.semouse;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);
    }
}
