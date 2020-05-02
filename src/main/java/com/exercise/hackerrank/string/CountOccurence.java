package com.exercise.hackerrank.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

    public static void main(String[] args) {
        String word = "harry potter";
        char letter = 't';
        System.out.printf("%n The times letter '%s' is repeated in '%s': %d", letter, word, countOccurence(word, letter));
        System.out.printf("%n The times letter '%s' is repeated in '%s': %d", letter, word, countAppearance(word, letter));
    }

    public static Integer countOccurence(String word, char letter) {
        char[] arrayChar = word.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char character : arrayChar) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == letter) {
                return entry.getValue();
            }
        }
        throw new RuntimeException("Didn't find the given letter in the string.");
    }

    public static Integer countAppearance(String str, char letter) {
        char[] arrayChar = str.toCharArray();

        int count = 0;
        for (char item : arrayChar) {
            if (item == letter) {
                count += 1;
            }
        }
        return count;
    }
}
