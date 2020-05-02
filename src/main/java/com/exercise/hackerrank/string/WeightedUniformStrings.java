package com.exercise.hackerrank.string;

import java.util.HashMap;
import java.util.Map;

public class WeightedUniformStrings {

    public static void main(String[] args) {
        String s = "abccddde";
        int[] queries = {6, 1, 3, 12, 5, 9, 10};
        String[] result = weightedUniformStrings(s, queries);
        System.out.println(result);
    }

    private static String[] weightedUniformStrings(String s, int[] queries) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<String, Integer> weights = new HashMap<>();
        String uniform = "";

        for (int i = 0; i < s.length(); i++) {

            String c = s.substring(i, i + 1);
            if (!weights.containsKey(c)) {
                int val = alphabet.indexOf(c) + 1;
                weights.put(c, val);
            }
        }
        System.out.println(weights);
        return null;
    }
}
