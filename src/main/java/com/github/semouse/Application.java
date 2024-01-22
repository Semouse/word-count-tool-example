package com.github.semouse;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Arrays.stream(args).forEach(System.out::println);
    }
}
