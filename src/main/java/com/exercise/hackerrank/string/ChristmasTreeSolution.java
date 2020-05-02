package com.exercise.hackerrank.string;

public class ChristmasTreeSolution {

    public static void main(String[] args) {
        tree(4);
    }

    public static void tree(final int height) {
        for (int i = 0; i < height; i++) {
            printChars(" ", height - i - 1);
            printChars("*", 2 * i + 1);
            System.out.println();
        }
    }

    private static void printChars(String ch, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(ch);
        }
    }
}
