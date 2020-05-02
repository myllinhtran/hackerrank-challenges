package com.exercise.hackerrank.implementation;

/**
 * Problem:
 * {@see https://www.hackerrank.com/challenges/drawing-book/}
 */
public class DrawingBook {

    public static void main(String[] args) {
        int result = pageCount(6, 3);
        System.out.println(result);
    }

    private static int pageCount(int n, int p) {

        int totalPagesTurnCountFromFront = n / 2;
        int targetPagesTurnCountFromFront = p / 2;
        int targetPagesTurnCountFromBack = totalPagesTurnCountFromFront - targetPagesTurnCountFromFront;

        return Math.min(targetPagesTurnCountFromFront, targetPagesTurnCountFromBack);
    }

    private static int pageCounts(int n, int p) {

        int fromFront = 0;
        int fromBack = 0;

        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 1 && i != 1) {
                fromFront += 1;
            }
            if (i > p) {
                break;
            }
        }

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0 && i != n && i != n - 1) {
                fromBack += 1;
            }
            if (i < p) {
                break;
            }
        }

        System.out.println("From front: " + fromFront);
        System.out.println("From back: " + fromBack);

        if (fromFront > fromBack) {
            return fromBack;
        }
        else {
            return fromFront;
        }
    }
}
