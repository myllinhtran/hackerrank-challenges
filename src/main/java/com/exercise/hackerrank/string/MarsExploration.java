package com.exercise.hackerrank.string;


/**
 * Problem:
 * {@see https://www.hackerrank.com/challenges/mars-exploration/problem}
 * @author My Linh Tran
 */
public class MarsExploration {

    public static void main(String[] args) {
        String s = "TOSTSSSOT";
        int result = marsExploration(s);
        System.out.println(result);
    }

    private static int marsExploration(String s) {

        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int first = i;
            int second = i + 1;
            int third = i + 2;

            if (s.charAt(first) != 'S') {
                count += 1;
            }
            if (s.charAt(second) != 'O') {
                count += 1;
            }
            if (s.charAt(third) != 'S') {
                count += 1;
            }

            i = third;
        }
        return count;
    }

}
