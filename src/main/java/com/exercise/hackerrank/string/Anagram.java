package com.exercise.hackerrank.string;


/**
 * {@see https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview
 * -preparation-kit&playlist_slugs%5B%5D=strings}
 * <p>
 * Function to calculate minimum numbers of characters to be removed to make two strings anagram.
 */
public class Anagram {

    public static void main(String[] args) {
        String a = "aaabb";
        String b = "bac";
        int output = makeAnagram(a, b);
        System.out.println(output);
    }

    private static int makeAnagram(String a, String b) {

        // Using StringBuilder can delete char at preferred index
        StringBuilder strA = new StringBuilder(a);
        StringBuilder strB = new StringBuilder(b);

        // Initialize the total numbers of character to be removed equals the total number of char of both strings
        int letterToRemove = strA.length() + strB.length();

        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);

            for (int j = 0; j < strB.length(); j++) {
                char charToCompare = strB.charAt(j);

                if (charToCompare == currentChar) {
                    strA.deleteCharAt(0);
                    strB.deleteCharAt(j);
                    letterToRemove = letterToRemove - 2;
                    break;
                }
            }
        }
        return letterToRemove;
    }
}
