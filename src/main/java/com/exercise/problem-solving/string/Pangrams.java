package com.exercise.hackerrank.string;

import java.util.ArrayList;
import java.util.List;


public class Pangrams {

    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the prize";
        String result = pangrams(s);
        System.out.println(result);
    }

    private static String pangrams(String s) {

        String str = s.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<Character> chars = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (!chars.contains(c) && c != ' ') {
                chars.add(c);
            }
        }

        if (chars.size() == alphabet.length()) {
            return "pangram";
        }
        else {
            return "not pangram";
        }
    }
}
