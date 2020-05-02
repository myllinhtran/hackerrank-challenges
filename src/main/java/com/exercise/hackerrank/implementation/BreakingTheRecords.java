package com.exercise.hackerrank.implementation;

import java.util.Arrays;

/**
 * Problem:
 * {@see https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem}
 */
public class BreakingTheRecords {

    public static void main(String[] args) {
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] result = breakingRecords(scores);
        System.out.println(Arrays.toString(result));
    }

    private static int[] breakingRecords(int[] scores) {
        int[] output = new int[2];

        int best = scores[0];
        int worst = scores[0];
        int countBest = 0;
        int countWorst = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
                countBest += 1;
            }
            if (scores[i] < worst) {
                worst = scores[i];
                countWorst += 1;
            }
        }
        output[0] = countBest;
        output[1] = countWorst;

        return output;
    }

}
