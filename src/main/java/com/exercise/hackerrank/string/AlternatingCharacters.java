package com.exercise.hackerrank.string;


public class AlternatingCharacters {

    // Driver to run & test method
    public static void main(String[] args) {
        String s = "AAABBB";
        int result = alternatingCharacters(s);
        System.out.println(result);
    }

    // Method
    public static int alternatingCharacters(String s) {
        int letterToRemove = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    letterToRemove += 1;
                }
                break;
            }
        }
        return letterToRemove;
    }

}
