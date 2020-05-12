package com.exercise.hackerrank.character;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String inputStr = "Harry Potter and the Deathly Hallow";
        findDuplicateChars(inputStr);
    }

    private static void findDuplicateChars(String word) {

        char[] arrayChar = word.toCharArray();

        Map<Character, Integer> charCount = new HashMap<>();
        for (char letter : arrayChar) {
            if (charCount.containsKey(letter) && letter != ' ') {
                charCount.put(letter, charCount.get(letter) + 1);
            } else {
                charCount.put(letter, 1);
            }
        }

        System.out.printf(" %n List of duplicate characters in String '%s' %n ", word);

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf(" %s : %d %n ", entry.getKey(), entry.getValue());
            }
        }
    }
}
