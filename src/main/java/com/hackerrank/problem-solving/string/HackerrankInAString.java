package com.exercise.hackerrank.string;

public class HackerrankInAString {

    public static void main(String[] args) {
        String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String result = hackerrankInString(s);
        System.out.println(result);
    }

    private static String hackerrankInString(String s) {
        String word = "hackerrank";

        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            if (j == word.length() - 1) {
                return "YES";
            }
        }
        return "NO";
    }
}
