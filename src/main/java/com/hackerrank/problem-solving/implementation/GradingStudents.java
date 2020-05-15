package com.exercise.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;


public class GradingStudents {

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        grades.add(30);

        System.out.println(" Original grades: " + grades);
        System.out.println(" Rounded grades: " + gradingStudents(grades));
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {

            if (grade < 40 && 40 - grade >= 3) {
                roundedGrades.add(grade);
            }

            int nextMultiFive = grade;

            for (int j = 0; j < 5; j++) {
                nextMultiFive = nextMultiFive + 1;
                if (nextMultiFive % 5 == 0) {
                    break;
                }
            }
            if (grade < 40 && 40 - grade < 3) {
                roundedGrades.add(nextMultiFive);
            }
            if (grade >= 40) {
                if (nextMultiFive - grade >= 3) {
                    roundedGrades.add(grade);
                }
                else {
                    roundedGrades.add(nextMultiFive);
                }
            }
        }

        return roundedGrades;
    }
}
