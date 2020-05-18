package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;

class Difference {

    private int[] elements;
    int maximumDifference;

    Difference(int[] array) {
        this.elements = array;
    }

    void computeDifference() {
        int len = elements.length;
        maximumDifference = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                int difference = Math.abs(elements[i] - elements[j]);
                if (difference > maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }
    }
}

class Solve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
