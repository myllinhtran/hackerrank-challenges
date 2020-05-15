package com.exercise.hackerrank.string;


public class ChristmasTree {

    private static void printChristmasTree2(int height) {

        for (int i = 1; i <= height; i++) {
            String start = "";
            String space = " ";
            String star = "*";

            int numOfSpace = 0;
            for (int s = 1; s <= height - i; s++) {
                start = start.concat(space);
                numOfSpace = numOfSpace + 1;
            }

            for (int a = 1; a < ((height - numOfSpace) * 2); a++) {
                start = start.concat(star);
            }

            System.out.println(start);
        }
    }
}
