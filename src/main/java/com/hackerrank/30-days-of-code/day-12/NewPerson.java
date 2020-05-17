package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;

public class NewPerson {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    NewPerson(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends NewPerson {

    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate() {

        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        int avg = sum / testScores.length;

        if (avg < 40) {
            return 'T';
        }
        if (avg >= 40 && avg < 55) {
            return 'D';
        }
        if (avg >= 55 && avg < 70) {
            return 'P';
        }
        if (avg >= 70 && avg < 80) {
            return 'A';
        }
        if (avg >= 80 && avg < 90) {
            return 'E';
        }
        else {
            return 'O';
        }
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            testScores[i] = scanner.nextInt();
        }
        scanner.close();

        Student student = new Student(firstName, lastName, id, testScores);
        student.printPerson();
        System.out.println("Grade: " + student.calculate());
    }
}
