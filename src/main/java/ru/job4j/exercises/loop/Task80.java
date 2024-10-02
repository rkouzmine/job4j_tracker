package ru.job4j.exercises.loop;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg = 0.0;
        double badAvg = 0.0;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;

        for (int grade : grades) {
            if (grade >= 3 && grade <= 5) {
                sumGood += grade;
                good++;
            } else if (grade > 0 && grade <= 2) {
                sumBad += grade;
                bad++;
            }
        }
        if (good != 0) {
            goodAvg = (double) sumGood / good;
        }
        if (bad != 0) {
            badAvg = (double) sumBad / bad;
        }
        System.out.printf("Средняя удовл. оценка: %s, средняя неуд. оценка: %s%n", goodAvg, badAvg);
    }

    public static void main(String[] args) {
        loop(new int[]{5, 4, 2, 3, 1});
        loop(new int[]{3, 4, 4, 3, 5});
        loop(new int[]{1, 2, 2, 2, 1});
    }
}