package com.exercise.hackerrank.string;

import static com.exercise.hackerrank.string.ReverseString.reverse;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abbhbba";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindromString(str));
    }

    public static boolean isPalindrome(String str) {

        char[] arrayChars = str.toCharArray();

        int i = 0;
        int j = str.length()-1;
        while (i!=j && i <= j) {
            if (arrayChars[i] == arrayChars[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromString(String text) {
        String reverse = reverse(text);
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    }
}
