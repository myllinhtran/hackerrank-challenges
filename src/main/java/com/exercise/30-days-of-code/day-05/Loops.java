package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;


public class Loops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d %n", n, i + 1, n * (i + 1));
        }
        scanner.close();
    }
}
