package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;


public class Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();

        printReverse(n, arr);
    }

    private static void printReverse(int n, int[] arr) {

        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
