package com.exercise.hackerrank.implementation;


public class Kangaroo {

    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {

        for (int i = 1; i < 10000; i++) {
            int kangaroo1 = x1 + v1 * i;
            int kangaroo2 = x2 + v2 * i;
            if (kangaroo1 == kangaroo2) {
                return "YES";
            }
        }
        return "NO";
    }
}
