package com.exercise.thirtyDaysOfCode;

public class Day02 {

    private static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double total_cost = meal_cost + meal_cost * (tip_percent + tax_percent) / 100;
        System.out.println(Math.round(total_cost));
    }
}
