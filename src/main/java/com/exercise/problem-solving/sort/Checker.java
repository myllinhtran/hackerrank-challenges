package com.exercise.hackerrank.sort;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

    public static void main(String[] args) {
        Player p1 = new Player("amy", 100);
        Player p2 = new Player("david", 50);

        Checker checker = new Checker();
        System.out.println(checker.compare(p1, p2));
    }

    public int compare(Player o1, Player o2) {

        if (o1.getScore() > o2.getScore()) {
            return -1;
        }
        if (o1.getScore() < o2.getScore()) {
            return 1;
        }
        else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

class Player {

    private String name;
    private int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}