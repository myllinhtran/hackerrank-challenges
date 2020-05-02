package com.exercise.hackerrank.string;

import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        String str = "hi";
        String strWithDigits = "1235345";
        String[] input = {"123", "123.2", "1234", "abcd123", "123456"};

        System.out.printf("%n '%s' contains non-digit numbers: %b", str, containNonDigit(str));
        System.out.printf("%n '%s' contains non-digit numbers: %b", strWithDigits, containNonDigit(strWithDigits));

        System.out.printf("%n '%s' contains digit numbers: %b", str, containDigit(str));
        System.out.printf("%n '%s' contains digit numbers: %b", strWithDigits, containDigit(strWithDigits));

        for (String item : input) {
            System.out.printf("%n '%s' is a 6 digit number: %b", item, containAllDigits(item));
        }
    }

    /**
     * Confirm if the string contains non-digit characters.
     * @param str
     * @return true if String contains any thing other than 0-9 digit, false if otherwise.
     */
    public static boolean containNonDigit(String str) {
        Pattern pattern = Pattern.compile(".*\\D.*");
        return pattern.matcher(str).matches();
    }

    /**
     * Confirm if the string contains digit numbers.
     * @param str
     * @return true if String contains digit numbers, false if otherwise.
     */
    public static boolean containDigit(String str) {
        Pattern pattern = Pattern.compile(".*\\d.*");
        return pattern.matcher(str).matches();
    }

    /**
     * Confirm if all characters of a string are digit numbers.
     * @param str
     * @return true if all characters are digits, false if otherwise.
     */
    public static boolean containAllDigits(String str) {
        Pattern pattern = Pattern.compile("\\d{6}");
        return pattern.matcher(str).matches();
    }
}

