package com.exercise.hackerrank.string;

public class HackerrankInAString {

    public static void main(String[] args) {
        String s1 = "hereiamstackerrank";
        String s2 = "hackerworld";
        String s3 = "hhaacckkekraraannk";
        String s4 = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String result = hackerrankInString(s4);
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
