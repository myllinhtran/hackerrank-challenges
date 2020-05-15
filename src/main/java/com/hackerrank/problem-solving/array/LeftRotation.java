package com.exercise.hackerrank.array;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        int[] result = rotLeft(a, d);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rotLeft(int[] a, int d) {

        for (int i = 0; i < d; i++) {
            int tmp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = tmp;
        }
        return a;
    }
}
