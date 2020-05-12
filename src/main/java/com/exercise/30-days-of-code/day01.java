package com.exercise.thirtyDaysOfCode;
import java.util.*;

public class day01 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int integer;
        double decimal;
        String string;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        integer = scan.nextInt();
        decimal = scan.nextDouble();
        string = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        int sumInt = i + integer;
        System.out.println(sumInt);

        /* Print the sum of the double variables on a new line. */
        double sumDouble = d + decimal;
        System.out.println(sumDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        String concatStr = s + string + scan.nextLine();
        System.out.println(concatStr);

        scan.close();
    }
}
