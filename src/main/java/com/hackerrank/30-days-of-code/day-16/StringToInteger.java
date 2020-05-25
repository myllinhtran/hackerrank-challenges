package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("Bad String");
        }
    }
}
