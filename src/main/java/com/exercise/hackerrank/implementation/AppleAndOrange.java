package com.exercise.hackerrank.implementation;


public class AppleAndOrange {

    public static void main(String[] args) {

        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        int[] apples = {2, 3, -4};
        int[] oranges = {3, -2, -4};

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int numApples = 0;
        int numOranges = 0;

        for (int apple : apples) {
            int position = a + apple;
            if (position >= s && position <= t) {
                numApples = numApples + 1;
            }
        }
        System.out.println(numApples);

        for (int orange : oranges) {
            int position = b + orange;
            if (position >= s && position <= t) {
                numOranges = numOranges + 1;
            }
        }
        System.out.println(numOranges);
    }
}
