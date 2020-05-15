package com.exercise.thirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        int entries = scan.nextInt();
        for (int i = 0; i < entries; i++) {
            String name = scan.next();
            String phone = scan.next();
            phoneBook.put(name, phone);
        }

        while (scan.hasNext()) {
            search(phoneBook, scan.next());
        }
        scan.close();
    }

    private static void search(Map<String, String> phoneBook, String name) {

        if (phoneBook.containsKey(name)) {
            System.out.printf("%s=%s%n", name, phoneBook.get(name));
        }
        else {
            System.out.println("Not found");
        }
    }
}
