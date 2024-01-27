package com.github.semouse;

public class InputWordCounter implements WordCountable {
    private final String input;

    public InputWordCounter(String input) {
        this.input = input;
    }

    @Override
    public long getNumberOfBytes() {
        return input.getBytes().length;
    }

    @Override
    public long getNumberOfLines() {
        return input.split("\n").length;
    }

    @Override
    public long getNumberOFWords() {
        return input.split("\\s+").length;
    }

    @Override
    public long getNumberOfCharacters() {
        return input.length();
    }
}
