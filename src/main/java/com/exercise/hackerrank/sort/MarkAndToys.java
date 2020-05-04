package com.exercise.hackerrank.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * {@see https://www.hackerrank.com/challenges/mark-and-toys}
 */
public class MarkAndToys {

    public static void main(String[] args) {
        int[] prices = {3, 7, 2, 9, 4};
        System.out.println(maximumToys(prices, 15));
    }

    private static int maximumToys(int[] prices, int budget) {

        // sort the list of toys
        Arrays.sort(prices);

        // sum the total prices of each combo of toys
        int sum = 0;
        int combo = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
            combo = i;
            if (sum > budget) {
                break;
            }
        }
        return combo;
    }

}
