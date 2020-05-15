package com.exercise.hackerrank.string;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        System.out.println("Please enter some text: ");

        // Read input from user
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        char[] letters = input.toCharArray();

        int count = 0;

        for (char c : letters) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    default:
            }
        }
        System.out.println("Number of vowels in String [" + input + "] is: " + count);
    }
}
