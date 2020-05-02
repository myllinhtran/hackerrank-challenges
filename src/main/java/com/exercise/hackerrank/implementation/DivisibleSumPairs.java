package com.exercise.hackerrank.implementation;

import java.util.Arrays;

/**
 * Problem:
 * {@see https://www.hackerrank.com/challenges/divisible-sum-pairs/problem}
 */
public class DivisibleSumPairs {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 1, 2};
        int result = countDivPairs(array, 6, 3);
        System.out.println(result);
    }


    // Naive approach
    private static int divisibleSumPairs(int n, int k, int[] ar) {

        Arrays.sort(ar);
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int sumPairs = 0;

            for (int j = i + 1; j < n; j++) {
                sumPairs = ar[i] + ar[j];
                if (ar[i] < ar[j] && sumPairs % k == 0) {
                    count += 1;
                }
            }
        }
        return count;
    }


    // Efficient approach
    private static int countDivPairs(int[] ar, int n, int k) {

        // Create a frequency array to count
        // occurrences of all remainders when
        // divided by k. Numbers of occurrence
        // of remainders would equals k-1.
        int[] freq = new int[k];

        // Count occurrences of all remainders
        for (int i = 0; i < n; i++) {
            freq[ar[i] % k] += 1;
        }

        // If both pairs are divisible by 'k'
        int count = freq[0] * (freq[0] - 1) / 2;

        // count for all i and (k-i)
        // freq pairs
        for (int i = 1; i <= k / 2 && i != (k - 1); i++) {
            count += freq[i] * freq[k-1];
        }
        // If k is even
        if (k % 2 == 0) {
            count += (freq[k/2] * (freq[k/2] - 1)/2);
        }
        return count;
    }
}
