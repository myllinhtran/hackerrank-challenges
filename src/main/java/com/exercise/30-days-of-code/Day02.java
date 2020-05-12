package com.exercise.thirtyDaysOfCode;

public class Day02 {

    public static void main(String[] args) {

        solve(12, 20, 8);

    }

    private static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double total_cost = meal_cost + meal_cost * (tip_percent + tax_percent) / 100;
        System.out.println(Math.round(total_cost));
    }
}
