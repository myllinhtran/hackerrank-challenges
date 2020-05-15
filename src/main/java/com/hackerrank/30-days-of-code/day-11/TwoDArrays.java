package com.exercise.thirtyDaysOfCode;


public class TwoDArrays {

    private static int printMaxSum(int[][] arr) {

        int max = -10000;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                          + arr[i + 1][j + 1]
                          + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
