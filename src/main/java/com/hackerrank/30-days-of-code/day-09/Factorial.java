package com.exercise.thirtyDaysOfCode;


public class Factorial {

    public static void main(String[] args) {
        int result = factorial(3);
        System.out.println(result);
    }

    private static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}
