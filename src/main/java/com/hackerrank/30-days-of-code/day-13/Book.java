package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;

abstract class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {

    private int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.printf("Title: %s%n", title);
        System.out.printf("Author: %s%n", author);
        System.out.printf("Price: %d%n", price);
    }
}


