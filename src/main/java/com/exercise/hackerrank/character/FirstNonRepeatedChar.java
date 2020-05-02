package com.exercise.hackerrank.character;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static char printFirstNonRepeatedChar(String word) {

        char[] arrayChar = word.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char letter : arrayChar) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("Didn't find any non repeated character.");
    }
}
