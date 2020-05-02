package com.exercise.hackerrank.implementation;

/**
 * Problem:
 * {@see https://www.hackerrank.com/challenges/day-of-the-programmer/problem?h_r=next-challenge&h_v=zen}
 */
public class DayOfTheProgrammer {

    public static void main(String[] args) throws Exception {

        int year1 = 1908;

        String year = dayOfProgrammer(year1);
        System.out.println(year);
    }

    private static String dayOfProgrammer(int year) {

        if (year == 1918) {
            return "26.09." + year;
        }

        if (year <= 1917) {
            if (year % 4 == 0) {
                return "12.09." + year;
            }
            else {
                return "13.09." + year;
            }
        }

        if (((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            return "12.09." + year;
        }
        else {
            return "13.09." + year;
        }
    }

}
