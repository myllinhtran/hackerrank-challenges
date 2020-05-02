package com.exercise.hackerrank.string;

public class ReverseStringInPlace {

    public static void main(String[] args) {

        String str = "abcdefg";
        System.out.println(" Original string: " + str);

        String reversedStr = inplaceReverse(str);
        System.out.println(" Reversed string: " + reversedStr);
    }

    public static String inplaceReverse(String str) {

        StringBuilder builder = new StringBuilder(str);
        int len = builder.length();
        int mid = builder.length() / 2;

        for (int i = 0; i < mid; i++) {
            char current = str.charAt(i);
            int otherEnd = len - 1 - i;
            builder.setCharAt(i, builder.charAt(otherEnd));
            builder.setCharAt(otherEnd, current);
        }

        return builder.toString();
    }
}
