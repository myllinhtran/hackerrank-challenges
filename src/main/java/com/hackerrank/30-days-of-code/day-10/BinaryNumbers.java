package com.exercise.thirtyDaysOfCode;


public class BinaryNumbers {

    private static int printConsecutive(int n) {

        int max = 0;
        int count = 0;

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;

            if (remainder == 1) {
                count += 1;
                if (max < count) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }
        return max;
    }
}
