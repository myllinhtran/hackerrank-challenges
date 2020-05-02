package com.exercise.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;


public class BonAppetit {

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(bill, 1, 12);
    }

    private static void bonAppetit(List<Integer> bill, int k, int b) {
        int sumOfBill = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sumOfBill += bill.get(i);
            }
        }
        int actual = Math.abs(sumOfBill / 2 - b);
        if (actual > 0) {
            System.out.println(actual);
        }
        else {
            System.out.println("Bon Appetit");
        }
    }
}
