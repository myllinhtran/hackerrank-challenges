package com.exercise.hackerrank.array;


public class BirthdayCakeCandles {

    public static void main(String[] args) {

        int[] ar = new int[]{3, 2, 1, 3};
        int candles = birthdayCakeCandles(ar);
        System.out.println(candles);
    }

    public static int birthdayCakeCandles(int[] ar) {
        int count = 0;
        int max = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            if (max < ar[i]) {
                max = ar[i];
                count = 1;
            }
            else if (max == ar[i]) {
                count = count + 1;
            }
        }
        return count;
    }
}
