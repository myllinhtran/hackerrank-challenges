package com.exercise.hackerrank.string;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem: Migratory Birds
 * Author: My Linh Tran
 *
 */
public class MigratoryBirds {

    public static void main(String[] args) {

        List<Integer> birds = new ArrayList<>();
        birds.add(1);
        birds.add(2);
        birds.add(3);
        birds.add(4);
        birds.add(5);
        birds.add(4);
        birds.add(3);
        birds.add(2);
        birds.add(1);
        birds.add(3);
        birds.add(4);

        int result = migratoryBirds(birds);
        System.out.println(result);
    }

    private static int migratoryBirds(List<Integer> arr) {
        int birdType = 0;
        int birdCount = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int key : arr) {
            if (!freq.containsKey(key)) {
                freq.put(key, 1);
            }
            else {
                int val = freq.get(key);
                freq.put(key, val + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > birdCount) {
                birdCount = entry.getValue();
                birdType = entry.getKey();
            }
            else if (entry.getValue() == birdCount) {
                if (entry.getKey() < birdType) {
                    birdType = entry.getKey();
                }
            }
        }
        return birdType;
    }
}
