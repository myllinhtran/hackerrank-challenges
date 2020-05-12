package com.exercise.hackerrank.implementation;

import java.util.HashMap;
import java.util.Map;


public class SockMerchant {

    public static void main(String[] args) {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(9, ar);
        System.out.println(result);
    }

    private static int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int color : ar) {
            if (!freq.containsKey(color)) {
                freq.put(color, 1);
            }
            else {
                freq.put(color, freq.get(color) + 1);
            }
        }

        for (int val : freq.values()) {
            count = count + val / 2;
        }

        return count;
    }
}
