package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;

public class Review {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();

        for (int i = 0; i < times; i++) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            String word = scan.next();
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    even.append(word.charAt(j));
                }
                else {
                    odd.append(word.charAt(j));
                }
            }
            System.out.printf("%s %s%n", even.toString(), odd.toString());
        }
    }
}
