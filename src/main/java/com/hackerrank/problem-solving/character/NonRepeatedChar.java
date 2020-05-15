package com.exercise.hackerrank.character;

import java.util.*;
import java.util.Map.Entry;

public class NonRepeatedChar {

    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatedChar("abcdefghijaashfajdghaewubakgda"));
        System.out.println(firstNonRepeatingChar("abcdefghijaashfajdghaewubakgda"));
        System.out.println(firstNonRepeatedCharacter("abcdefghijaashfajdghaewubakgda"));
    }

    private static char getFirstNonRepeatedChar(String str) {
        // LinkedHashMap maintains insertion order
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());

        // Insert char in order they appear in String
        for (char c : str.toCharArray()) {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        // Iterate over the LinkedHashMap and choose entry with value 1
        for (Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("Didn't find any non-repeated character.");
    }

    private static char firstNonRepeatingChar(String word) {
        
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }

        return nonRepeating.get(0);
    }

    private static char firstNonRepeatedCharacter(String word) {

        HashMap<Character, Integer> scoreboard = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behavior.");
    }

}
