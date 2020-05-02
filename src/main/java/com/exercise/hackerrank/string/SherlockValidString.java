package com.exercise.hackerrank.string;

import java.util.*;

/**
 * {@see https://www.hackerrank.com/challenges/sherlock-and-valid-string}
 */
public class SherlockValidString {

    public static void main(String[] args) {
        String s = "aabbcccc";
        String result = isValid(s);
        System.out.println(result);
    }

    private static String isValid(String s) {

        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count += 1;
                }
            }
            chars.put(s.charAt(i), count);
        }
        System.out.println("Frequencies: " + chars);

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int num : chars.values()) {
            int count = 0;
            for (int val : chars.values()) {
                if (num == val) {
                    count += 1;
                    numbers.put(num, count);
                }
            }
        }
        System.out.println("Numbers: " + numbers);

        // Conditions to make a string valid
        if (numbers.size() > 2) {
            return "NO";
        }

        if (numbers.size() == 2) {
            for (int val : numbers.values()) {
                if (val == 1) {
                    return "YES";
                }
                else {
                    return "NO";
                }
            }
        }

        if (numbers.size() < 2) {
            return "YES";
        }

        return "NO";
    }
}
