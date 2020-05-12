package com.exercise.hackerrank.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Find missing numbers in a given list of integers.
 */
public class MissingNumberInArray {

    public List<Integer> printMissingNumber(int[] numbers) {
        List<Integer> missingNumbers = new ArrayList<Integer>();
        Arrays.sort(numbers);
        System.out.println("Test list: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 != numbers[i + 1]) {
                int dif = numbers[i + 1] - (numbers[i] + 1);
                if (dif == 1) {
                    missingNumbers.add(numbers[i] + 1);
                } else {
                    for (int e = 1; e <= dif; e++) {
                        missingNumbers.add(numbers[i] + e);
                    }
                }
            }
        }
        System.out.println("Missing numbers: " + missingNumbers);
        return missingNumbers;
    }
}
