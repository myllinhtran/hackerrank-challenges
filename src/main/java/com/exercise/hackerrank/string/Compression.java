package com.exercise.hackerrank.string;

public class Compression {

    public static void main(String[] args) {
        String str = "aBBcccaaDeedFFFFg";
        compress(str);
        encode(str);
    }

    private static void compress(String string) {
        char[] chars = string.toCharArray();
        String str = chars[0] + "1";

        for (int i = 1; i < chars.length; i++) {
            if (str.charAt(str.length() - 2) == chars[i]) {
                int number = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1)));
                number = number + 1;
                str = str.substring(0, str.length() - 1) + number;
            }
            else {
                str += chars[i] + "1";
            }
        }
        System.out.println(str);
    }

    private static String encode(final String input) {
        char previousChar = input.charAt(0);
        int amount = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            final char currentChar = input.charAt(i);
            if (previousChar == currentChar) {
                amount++;
            }
            else {
                encode(result, previousChar, amount);
                previousChar = currentChar;
                amount = 1;
            }
        }
        encode(result, previousChar, amount);
        return result.toString();
    }

    private static void encode(StringBuilder sb, char ch, int amount) {
        sb.append(ch).append(amount);
    }
}
