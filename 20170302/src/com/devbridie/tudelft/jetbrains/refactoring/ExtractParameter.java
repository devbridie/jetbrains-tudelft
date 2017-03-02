package com.devbridie.tudelft.jetbrains.refactoring;

public class ExtractParameter {
    public static void print() {
        System.out.println(generateText());
    }

    //TODO This method should be able to uppercase all strings, not just our test string.
    private static String generateText() {
        return "Hello, World!".toUpperCase();
    }
}
