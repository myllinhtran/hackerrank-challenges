package com.exercise.hackerrank.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        // Original string
        String str = "hello";
        System.out.println("\n" + " Original string: " + str);

        // Reverse string using StringBuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("\n" + " Reverse string in Java using StringBuffer: " + reverseStr);

        // Iterative method to reverse a string in Java
        reverseStr = reverse(reverseStr);
        System.out.println(" Reverse string in Java using Iteration: " + reverseStr);

        // Recursive method to reverse a string in Java
        reverseStr = reverseRecursively(str);
        System.out.println(" Reverse string in Java using recursion: " + reverseStr);
    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();
        for (int i=strChars.length-1; i>=0; i--) {
            strBuilder.append(strChars[i]);
        }
        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        // Base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }


}
